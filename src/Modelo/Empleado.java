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
import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author ALEJA
 */
public class Empleado extends PERSONA{
    private Date FechaIngreso;

    public Empleado(Date FechaIngreso, int Id, String Nombre, String Apellidos, char Genero, String Clave, Long Cedula) {
        super(Id, Nombre, Apellidos, Genero, Clave, Cedula);
        this.FechaIngreso = FechaIngreso;
    }

    public Empleado( ConexionBasesdeDatos conexion,int numero) {
        super(conexion,numero);
        
    }
    
    
    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
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
