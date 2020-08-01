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
public class Inventario {

        
    //Atributos
    private int inventarioId;
    private String producto;
    private float precio;
    
    //Constructor
    public Inventario(int inventarioId, String producto, float precio) {
        this.inventarioId = inventarioId;
        this.producto = producto;
        this.precio = precio;
    }
    
    public Inventario() {
        
    }
    
    //Getter and Setter
    public int getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(int inventarioId) {
        this.inventarioId = inventarioId;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void mostrarInventario() {
        Inventario mascarilla = new Inventario(1, "Mascarilla", 500);
        Inventario antibiotico = new Inventario(2, "Antibiotico", 5000);
        Inventario vacunaInfluencia = new Inventario(3, "Vacuna Influencia", 7000);
        JOptionPane.showMessageDialog(null,"\nNombre: " + mascarilla.getProducto() + "\nPrecio: " + mascarilla.getPrecio());
        JOptionPane.showMessageDialog(null,"\nNombre: " + antibiotico.getProducto() + "\nPrecio: " + antibiotico.getPrecio());
        JOptionPane.showMessageDialog(null,"\nNombre: " + vacunaInfluencia.getProducto() + "\nPrecio: " + vacunaInfluencia.getPrecio());
    } //Fin de mostrarInventario() Method

}
