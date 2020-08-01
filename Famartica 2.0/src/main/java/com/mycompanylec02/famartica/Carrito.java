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
    static private int antibioticos;
    static private int vacunas;
    
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

    public int getAntibioticos() {
        return antibioticos;
    }

    public void setAntibioticos(int antibioticos) {
        this.antibioticos = antibioticos;
    }

    public int getVacunas() {
        return vacunas;
    }
    
    public void setVacunas(int vacunas) {
        this.vacunas = vacunas;
    }
    
    
    //Métodos
    public void agregarCarrito() {
        JOptionPane.showMessageDialog(null, "Qué desea comprar?");
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("\n1. Mascarillas" + "\n2. Antibióticos" + "\n3. Vacuna Influencia" + "\n0. Salir"));
            switch(option) {
                case 1: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas mascarillas desea?"));
                    setSubtotal(subtotal + (cantidad * 500));
                    setMascarillas(mascarillas + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 1: Agregar Mascarillas
                case 2: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantos antibióticos desea?"));
                    setSubtotal(subtotal + (cantidad * 5000));
                    setAntibioticos(antibioticos + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 2: Agregar Antibióticos
                case 3: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas vacunas desea?"));
                    setSubtotal(subtotal + (cantidad * 7000));
                    setVacunas(vacunas + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 3: Agregar Vacunas
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
            option = Integer.parseInt(JOptionPane.showInputDialog("\n1. Mascarillas" + "\n2. Antibióticos" + "\n3. Vacuna Influencia" + "\n0. Salir"));
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
                    if(getAntibioticos() != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantos antibióticos desea eliminar?"));
                        if(cantidad > getAntibioticos()) {
                            JOptionPane.showMessageDialog(null, "Disculpe, no posee tantos antibióticos");
                        } else {
                            if(cantidad > 1) {
                                JOptionPane.showMessageDialog(null, "Se eliminaron " + cantidad + " antibióticos del carrito");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " antibiótico del carrito");
                            }
                            setSubtotal(getSubtotal() - (cantidad * 5000));
                            setAntibioticos(getAntibioticos() - cantidad);
                            JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                        }                     
                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene antibióticos dentro del carrito de compras");
                    }
                    break;
                } //Fin Case 2: Eliminar Antibióticos
                case 3: {
                    if(getVacunas() != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas vacunas desea eliminar?"));
                        if(cantidad > getVacunas()) {
                            JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas vacunas");
                        } else {
                            if(cantidad > 1) {
                                JOptionPane.showMessageDialog(null, "Se eliminaron " + cantidad + " vacunas del carrito");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " vacuna del carrito");
                            }
                            setSubtotal(getSubtotal() - (cantidad * 7000));
                            setVacunas(getVacunas() - cantidad);
                            JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                        }                     
                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene vacunas dentro del carrito de compras");
                    }
                    break;
                } //Fin Case 3: Eliminar Vacunas
                default: {
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar Farmatica Virtual!");
                    option = 0;
                    break;
                }
            }
        }while(option != 0);;
    } //Fin removerCarrito() Method
    
    public void listaCarrito() {
        JOptionPane.showMessageDialog(null, "********CARRITO DE COMPRAS********" + "\nTiene: " + getMascarillas() + " Mascarilla/s" + "\nTiene: " + getAntibioticos() + " Antibiótico/s" + "\nTiene: " + getVacunas() + " Vacuna/s para Influencia");
    } //Fin listaCarrito() Method
    
    
} //Fin Carrito Class


