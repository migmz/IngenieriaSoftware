/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.sql.ResultSet;

/**
 *
 * @author Carlos
 */
public class NullConexionBasesdeDatos {
    public NullConexionBasesdeDatos(){
        
    }
    
    public ConexionBasesdeDatos funcion(){
        ConexionBasesdeDatos conexion=new ConexionBasesdeDatos();
        return conexion;
    }
    
    public void insertar() {
     
     
    }
    
    public boolean consultarexistencia(){
        return false;
    }
    
     public ResultSet consultarconcondicion(String tabla,String campo1,String valor){
       ResultSet nuevo=null;
        
        return nuevo;
    }
     
       public ResultSet consultarsincondicion(String tabla,String campo1){
         ResultSet nuevo=null;
        
        return nuevo;
        
    }
     
     public void actualizar(String tabla,String nuevosvalores,String campo,String valor){
         
        
     }
     
     public int consultarmaximo(String tabla, String campo) {
         
          
        
        return 0;
     }
      public int consultarsuma(String tabla, String campo,String opcion,int opc){
        
         return 0;
     }
    public ResultSet consultarvariastablas(String tablas,String campos,String condiciones){
         ResultSet nuevo=null;
        
        return nuevo;
    } 
}
