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
public class Administrador extends Inventario {

    //Atributos
    private int adminId;
    private String username;
    private String password;
    
    //Constructor
    public Administrador(int adminId, String username, String password, int inventarioId, String producto, float precio) {
        super(inventarioId, producto, precio);
        this.adminId = adminId;
        this.username = username;
        this.password = password;
    }
    
    //Getter and Setter  
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

   
    public void setPassword(String password) {
        this.password = password;
    }
    
    //Metodos 
    public void adminLogin(String user, String pass) {
        int option = 0;
        do{
        String username = JOptionPane.showInputDialog("Escriba su nombre de usuario");
        String password = JOptionPane.showInputDialog("Escriba su contraseña");
        if(username.equals(user) && password.equals(pass)) {
            JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
            option = 1;
        } else {
            JOptionPane.showMessageDialog(null, "Error de autentificacion, intente de nuevo");
        }
        }while (option != 1);
    } //Fin adminLogin() Method
    
    
    public void agregarProducto() {
        int itemsAgregar = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos desea agregar?")); 
        //Creacion del array productos de itemsAgregar posiciones
        Inventario[] productos = new Inventario[itemsAgregar];
        //Ciclo for para la creacion del array de objetos
        for (int i = 0; i < itemsAgregar; i++) {
            String producto = JOptionPane.showInputDialog("Producto");
            float precio = Integer.parseInt(JOptionPane.showInputDialog("Precio"));
            productos[i] = new Inventario(i, producto, precio);
        }
        //Ciclo for para la impresion de los items agregados al inventario
        for (int i = 0; i < itemsAgregar; i++) {
            productos[i].mostrarInventario();
            JOptionPane.showMessageDialog(null,"\nNombre: " + productos[i].getProducto() + "\nPrecio: " + productos[i].getPrecio());
        }
    } //Fin agregarProducto() Method

    public void eliminarProducto() {   
        Inventario mascarilla = new Inventario(1, "Mascarilla", 500);
        Inventario antibiotico = new Inventario(2, "Antibiotico", 5000);
        Inventario vacunaInfluencia = new Inventario(3, "Vacuna Influencia", 7000);
        int eliminar = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del producto que desea eliminar")); 
        if (eliminar == 1) {
            JOptionPane.showMessageDialog(null, "Se eliminio mascarillas");
            JOptionPane.showMessageDialog(null,"\nNombre: " + antibiotico.getProducto() + "\nPrecio: " + antibiotico.getPrecio());
            JOptionPane.showMessageDialog(null,"\nNombre: " + vacunaInfluencia.getProducto() + "\nPrecio: " + vacunaInfluencia.getPrecio());
        } else if (eliminar == 2) {
            JOptionPane.showMessageDialog(null, "Se eliminaron los antibioticos");
            JOptionPane.showMessageDialog(null,"\nNombre: " + mascarilla.getProducto() + "\nPrecio: " + mascarilla.getPrecio());
            JOptionPane.showMessageDialog(null,"\nNombre: " + vacunaInfluencia.getProducto() + "\nPrecio: " + vacunaInfluencia.getPrecio());
        } else if (eliminar == 3) {
            JOptionPane.showMessageDialog(null, "Se eliminaron las vacunas de la influencia");
            JOptionPane.showMessageDialog(null,"\nNombre: " + mascarilla.getProducto() + "\nPrecio: " + mascarilla.getPrecio());
            JOptionPane.showMessageDialog(null,"\nNombre: " + antibiotico.getProducto() + "\nPrecio: " + antibiotico.getPrecio());
        } else {
            JOptionPane.showMessageDialog(null, "El ID que se digito no existe");
        }
    } //Fin de eliminarProducto() Method
}
