/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author ALEJA
 */
public class PRODUCTO {
    private int Id;
    private String Nombre;
    private String Serial;
    private Double Precio;
    private String Color;
    private String Modelo;
    private String Material;
    private Date FechaIngreso;

    public PRODUCTO(int Id, String Nombre, String Serial, Double Precio, String Color, String Modelo, String Material, Date FechaIngreso) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Serial = Serial;
        this.Precio = Precio;
        this.Color = Color;
        this.Modelo = Modelo;
        this.Material = Material;
        this.FechaIngreso = FechaIngreso;
    }
    
    public PRODUCTO() {
        
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

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    
    
    
}
