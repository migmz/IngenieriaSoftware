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
public class Administrador extends PERSONA {
    
    private String Nick;

    public Administrador(String Nick, int Id, String Nombre, String Apellidos, char Genero, String Clave, Long Cedula) {
        super(Id, Nombre, Apellidos, Genero, Clave, Cedula);
        this.Nick = Nick;
    }
    
    public Administrador() {
        super();
        
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }
    
    
    
}
