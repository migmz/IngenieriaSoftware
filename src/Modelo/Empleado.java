/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

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
    
    public Empleado() {
        super();
        
    }
    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
            
    
}
