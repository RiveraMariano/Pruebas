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
public class Usuario {

    //Atributos
    private String password;
    private String username;
    static private String nombre;
    private String apellido;
    private String address;
    
    //Constructor
    public Usuario(String password, String username, String nombre, String apellido, String address) {
        this.password = password;
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.address = address;
    }
    
    //Getter and Setter
       public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    //Metodos
    public void verificarLogin(String user, String pass) {
        int option = 0;
        do{
            String username = JOptionPane.showInputDialog("Escriba su nombre de usuario");
            String password = JOptionPane.showInputDialog("Escriba su contraseña");
                if(username.equals(user) && password.equals(pass)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + getNombre());
                    option = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Error de autentificacion, intente de nuevo");
                }
        }while (option != 1);
    } //Fin verericarLogin() Method

    
} //Fin Usuario Class
