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
public class Factura {
    private int Id;
    private String Cliente;
    private Double subtotal;
    private Double iva;

    public Factura(int Id, String Cliente, Double subtotal, Double iva) {
        this.Id = Id;
        this.Cliente = Cliente;
        this.subtotal = subtotal;
        this.iva = iva;
    }
    
    public Factura() {
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }
    
    
}
