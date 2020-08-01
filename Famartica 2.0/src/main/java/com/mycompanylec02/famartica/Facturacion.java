/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanylec02.famartica;

import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 4
 */
 
public class Facturacion extends Carrito {
    
    Carrito carro = new Carrito();

    //Atributos
    private int facturaId;
    private float descuento;
    private float impuestos = (float) 0.13;
    private float total;
    
    //Constructor
    public Facturacion(int facturaId, int descuento, int impuestos, int total, int cartId) {
        super(cartId);
        this.facturaId = facturaId;
        this.descuento = descuento;
        this.impuestos = impuestos;
        this.total = total;
    }
    
    public Facturacion() {
        //Constructor para llamar desde menu
    }

    //Getter and Setter
    public Carrito getCarro() {
        return carro;
    }

    public void setCarro(Carrito carro) {
        this.carro = carro;
    }

    public int getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public float getTotal() {
        return total;
    }
    
    public void setTotal(float total) {
        this.total = total;
    }

    public void facturarCarrito(){
        if(carro.getMascarillas() == 0 && carro.getAntibioticos() == 0 && carro.getVacunas() == 0) {
            JOptionPane.showMessageDialog(null, "Disculpe, no tiene ningún artículo dentro del carrito de compras");
        } else {
            if(carro.getMascarillas() > 5) {
                JOptionPane.showMessageDialog(null, "Por comprar más de 5 mascarillas obtiene un 2% de descuento en sus compras");
                setDescuento((float) 0.02);
            } else if(carro.getAntibioticos() > 3){
                JOptionPane.showMessageDialog(null, "Por comprar más de 3 antibióticos obtiene un 4% de descuento en sus compras");
                setDescuento((float) 0.04);
            } else if(carro.getVacunas()> 7){
                JOptionPane.showMessageDialog(null, "Por comprar más de 7 antibióticos obtiene un 12% de descuento en sus compras");
                setDescuento((float) 0.12);
            }
            setTotal(carro.getSubtotal() - (carro.getSubtotal() * getDescuento()));
            setTotal(getTotal() + (getTotal() * getImpuestos()));
            JOptionPane.showMessageDialog(null, "********FACTURA DE COMPRAS********" + "\nTiene: " + carro.getMascarillas() + " Mascarilla/s" + "\nTiene: " + carro.getAntibioticos() + " Antibiótico/s" + "\nTiene: " + carro.getVacunas() + " Vacuna/s para Influencia" + "\nSubtotal: ₡" + carro.getSubtotal() + "\nImpuestos: " + getImpuestos() + "%" + "\nDescuento: " + getDescuento() + "%" +  "\n********TOTAL DE COMPRAS********" +"\nTotal: ₡" + getTotal());
        }
    } //Fin facturarCarrito() Method
    
} //Fin FActuracion Class




