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
public class Cliente extends Usuario {

    //Atributos
    private int clienteId;
    private float dineroCuenta;
    
    //Constructor
   public Cliente(int clienteId, float dineroCuenta, String password, String username, String nombre, String apellido, String address) {
        super(password, username, nombre, apellido, address);
        this.clienteId = clienteId;
        this.dineroCuenta = dineroCuenta;
    }
   
    
    //Getter and Setter
    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public float getDineroCuenta() {
        return dineroCuenta;
    }


    public void setDineroCuenta(float dineroCuenta) {
        this.dineroCuenta = dineroCuenta;
    }
    
    //Metodos
    public void registro() {
        setNombre(JOptionPane.showInputDialog("Cúal es su nombre?"));
        setApellido(JOptionPane.showInputDialog("Cúal es su apellido?"));
        setAddress(JOptionPane.showInputDialog("Dónde vive?"));
        setUsername(JOptionPane.showInputDialog("Escriba un nombre de usuario"));
        setPassword(JOptionPane.showInputDialog("Escriba una contraseña"));
    }
    
    
    
} //Fin Cliente Class
