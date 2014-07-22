/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import sun.util.calendar.BaseCalendar;

/**
 *
 * @author ALEJA
 */
public class PERSONA {
    private int Id;
    private String Nombre;
    private String Apellidos;
    private char Genero;
    private String Clave;
    private Long Cedula;

    public PERSONA(int Id, String Nombre, String Apellidos, char Genero, String Clave, Long Cedula) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Genero = Genero;
        this.Clave = Clave;
        this.Cedula = Cedula;
    }
    
    public PERSONA() {
        
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
    
    
}
