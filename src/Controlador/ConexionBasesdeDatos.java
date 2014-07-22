/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class ConexionBasesdeDatos {
    
    Connection conexion;
    Statement exe;
    ResultSet consulta;
    public ConexionBasesdeDatos(){
        conexion=null;
        exe=null;
        consulta=null;
            //CONEXION CON BASES DE DATOS SQL SERVER 2008
          try{
        Class.forName("org.postgresql.Driver");
        
         String connectionUrl = "jdbc:postgresql://localhost:5432/BDTIENDA";
         String usuario="postgres";
         String clave="m1cha31";
         conexion = DriverManager.getConnection(connectionUrl,usuario,clave);
          exe=conexion.createStatement(); 
     
            System.out.println("Conexion exitosa con la base de datos");    
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "El siguiente problema con la conexion a la base de datos "+ e.toString());
        }
        
        
    }
    
    public void insertar(String tabla,String campos,String valores) throws SQLException{
     
      exe.execute("insert into "+tabla+"("+campos+") values ("+valores+")");
    }
    
    public boolean consultarexistencia(String tabla,String campo1,String campo2,String valor) throws SQLException{
        boolean id=false;
        consulta=exe.executeQuery("select "+campo1+" from "+tabla+" where "+campo2+" = "+valor);
        if(consulta.next()){
            id=true;
        }
        
        return id;
    }
    
     public ResultSet consultarconcondicion(String tabla,String campo1,String valor) throws SQLException{
        exe=conexion.createStatement();
        consulta=exe.executeQuery("select "+campo1+" from "+tabla+" where "+valor);
        
        
        return consulta;
    }
     
       public ResultSet consultarsincondicion(String tabla,String campo1) throws SQLException{
        exe=conexion.createStatement();
        consulta=exe.executeQuery("select "+campo1+" from "+tabla);
        
        
        return consulta;
    }
     
     public void actualizar(String tabla,String nuevosvalores,String campo,String valor) throws SQLException{
         
         exe.execute("update "+tabla+" set " +nuevosvalores+" where "+campo+" = "+ valor);
     }
     
     public int consultarmaximo(String tabla, String campo) throws SQLException{
         
         ResultSet info=exe.executeQuery("select MAX("+campo+") from "+tabla );
         info.next();
         return (info.getInt(1)+1);
     }
      public int consultarsuma(String tabla, String campo,String opcion,int opc) throws SQLException{
        exe=conexion.createStatement();
         ResultSet info=exe.executeQuery("select " +campo+" from "+tabla +"  "+ opcion);
         int valor=0;
        while(info.next()){
             //info.next();
            System.out.println("valor-->"+valor);
             valor=valor+Integer.parseInt((info.getString(opc)));
            System.out.println("valor-->"+valor);
         }
         
         
         return valor;
     }
    public ResultSet consultarvariastablas(String tablas,String campos,String condiciones) throws SQLException{
        exe=conexion.createStatement();
         ResultSet info=null;
        try{
         info=exe.executeQuery("select DISTINCT "+ campos+ " from "+tablas+ " where "+condiciones);
            System.out.println("VAMOS BIEN POR AQUI");
        }
        catch(Exception e){
          System.out.println("ERROR-->"+e.toString());  
        }
        return info;
    } 
     
}
