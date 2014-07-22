/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Controlador.ConexionBasesdeDatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALEJA
 */
public class Administrador extends PERSONA {
    
    private String Nick;

    public Administrador(String Nick, int Id, String Nombre, String Apellidos, char Genero, String Clave, Long Cedula) {
        super(Id, Nombre, Apellidos, Genero, Clave, Cedula);
        this.Nick = Nick;
    }

    public Administrador( ConexionBasesdeDatos conexion,int numero) {
        super(conexion,numero);
        
    }
    
    

    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    @Override
    public ResultSet modificarproducto(ConexionBasesdeDatos conexion,int numero) {
       ResultSet datos=null;
        try {
            datos = conexion.consultarconcondicion("PRODUCTO","prod_nombre,prod_precio,prod_serial,prod_color,prod_modelo,prod_material", "prod_id = "+numero+"");
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos; 
    }

    
    
    
    
}
