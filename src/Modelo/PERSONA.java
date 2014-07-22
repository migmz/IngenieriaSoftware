/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Controlador.ConexionBasesdeDatos;
import java.sql.Connection;
import java.sql.ResultSet;
import sun.util.calendar.BaseCalendar;

/**
 *
 * @author ALEJA
 */
abstract class PERSONA {
    protected int Id;
    protected String Nombre;
    protected String Apellidos;
    protected char Genero;
    protected String Clave;
    protected Long Cedula;
    ConexionBasesdeDatos conexion;
    int numero;

    public PERSONA(int Id, String Nombre, String Apellidos, char Genero, String Clave, Long Cedula) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Genero = Genero;
        this.Clave = Clave;
        this.Cedula = Cedula;
    }
    
    public PERSONA(ConexionBasesdeDatos conexion,int numero) {
        this.conexion=conexion;
        this.numero=numero;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public Long getCedula() {
        return Cedula;
    }

    public void setCedula(Long Cedula) {
        this.Cedula = Cedula;
    }
    
   public abstract ResultSet modificarproducto(ConexionBasesdeDatos conexion,int numero);
   
   public void Template(){
       modificarproducto(conexion,numero);
   }
    
}
