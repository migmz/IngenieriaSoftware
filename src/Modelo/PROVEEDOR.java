/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author ALEJA
 */
public class PROVEEDOR {
    private String nombre;
    private String Nit;
    private long telefono;
    private String direccion;

    public PROVEEDOR(String nombre, String Nit, long telefono, String direccion) {
        this.nombre = nombre;
        this.Nit = Nit;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
     public PROVEEDOR() {
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     
     
}
