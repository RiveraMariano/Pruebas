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
public class Carrito {
    
    //Variables Locales
    int option = 0;
    int cantidad = 0;
    
    //Atributos
    private int cartId;
    static private float subtotal;
    static private int mascarillas;
    static private int salbutamol;
    static private int paracetamol;
    
    //Constructor
    public Carrito(int cartId) {
        this.cartId = cartId;
    }
    
    public Carrito(){
        //Constructor para llamar desde menu
    }
       
    //Getter and Setter
    public int getOption() {  
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getMascarillas() {
        return mascarillas;
    }

    public void setMascarillas(int mascarillas) {
        this.mascarillas = mascarillas;
    }

    public int getSalbutamol() {
        return salbutamol;
    }

    public void setSalbutamol(int salbutamol) {
        this.salbutamol = salbutamol;
    }

    public int getParacetamol() {
        return paracetamol;
    }
    
    public void setParacetamol(int paracetamol) {
        this.paracetamol = paracetamol;
    }
    
    
    //Métodos
    public void agregarCarrito() {
        JOptionPane.showMessageDialog(null, "Qué desea comprar?");
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("\n1. Mascarillas" + "\n2. Bombas de Salbutamol" + "\n3. Pastillas de Paracetamol" + "\n0. Salir"));
            switch(option) {
                case 1: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas mascarillas desea?"));
                    setSubtotal(subtotal + (cantidad * 500));
                    setMascarillas(mascarillas + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 1: Agregar Mascarillas
                case 2: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas bombas de salbutamol desea?"));
                    setSubtotal(subtotal + (cantidad * 5000));
                    setSalbutamol(salbutamol + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 2: Agregar Bombas de Sabutamol
                case 3: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas Pastillas de paracetamol desea?"));
                    setSubtotal(subtotal + (cantidad * 7000));
                    setParacetamol(paracetamol + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 3: Agregar Pastillas de Paracetamol
                default: {
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar Farmatica Virtual!");
                    option = 0;
                    break;
                } //Fin Switch Comprar Productos
            }
        }while(option != 0);
    } //Fin agregarCarrito() Method
    
    public void removerCarrito() {
        JOptionPane.showMessageDialog(null, "Qué desea eliminar?");
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("\n1. Mascarillas" + "\n2. Bombas de Salbutamol" + "\n3. Pastillas de Paracetamol" + "\n0. Salir"));
            switch(option) {
                case 1: {
                    if(getMascarillas() != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas mascarillas desea eliminar?"));
                        if(cantidad > getMascarillas()) {
                            JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas mascarillas");
                        } else {
                            if(cantidad > 1) {
                                JOptionPane.showMessageDialog(null, "Se eliminaron " + cantidad + " mascarillas del carrito");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " mascarilla del carrito");
                            }
                            setSubtotal(getSubtotal() - (cantidad * 500));
                            setMascarillas(getMascarillas() - cantidad);
                            JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                        }                     
                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene mascarillas dentro del carrito de compras");
                    }
                    break;
                } //Fin Case 1: Eliminar Mascarillas
                case 2: {
                    if(getSalbutamol() != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas bombas de salbutamol desea eliminar?"));
                        if(cantidad > getSalbutamol()) {
                            JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas bombas de salbutamol");
                        } else {
                            if(cantidad > 1) {
                                JOptionPane.showMessageDialog(null, "Se eliminaron " + cantidad + " bombas de salbutamol del carrito");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " bomba de salbutamol del carrito");
                            }
                            setSubtotal(getSubtotal() - (cantidad * 5000));
                            setSalbutamol(getSalbutamol() - cantidad);
                            JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                        }                     
                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene bombas de salbutamol dentro del carrito de compras");
                    }
                    break;
                } //Fin Case 2: Eliminar bombas de salbutamol
                case 3: {
                    if(getParacetamol() != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas pastillas de paracetamol desea eliminar?"));
                        if(cantidad > getParacetamol()) {
                            JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas pastillas de paracetamol");
                        } else {
                            if(cantidad > 1) {
                                JOptionPane.showMessageDialog(null, "Se eliminaron " + cantidad + " pastillas de paracetamol del carrito");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " pastilla de paracetamol del carrito");
                            }
                            setSubtotal(getSubtotal() - (cantidad * 7000));
                            setParacetamol(getParacetamol() - cantidad);
                            JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                        }                     
                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene pastillas de paracetamol dentro del carrito de compras");
                    }
                    break;
                } //Fin Case 3: Eliminar Pastillas Paracetamol
                default: {
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar Farmatica Virtual!");
                    option = 0;
                    break;
                }
            }
        }while(option != 0);;
    } //Fin removerCarrito() Method
    
    public void listaCarrito() {
        JOptionPane.showMessageDialog(null, "********CARRITO DE COMPRAS********" + "\nTiene: " + getMascarillas() + " Mascarilla/s" + "\nTiene: " + getSalbutamol() + " Antibiótico/s" + "\nTiene: " + getParacetamol() + " Vacuna/s para Influencia");
    } //Fin listaCarrito() Method
    
    
} //Fin Carrito Class


