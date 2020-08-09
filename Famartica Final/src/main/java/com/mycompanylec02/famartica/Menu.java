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
public class Menu {
    
    //Objetos de clase
    Cliente usuario = new Cliente(1, 5000, "Undefined", "Undefined", "Undefined", "Undefined", "Undefined");
    Administrador admin = new Administrador(0, "admin", "admin", 0, "", 0);
    RegistroMedico carta = new RegistroMedico(1, 1, "a", "a", "a", "a", "a");
    Carrito carro = new Carrito();
    Facturacion factura = new Facturacion();
        
    public void menu() {
        int option = 0;
        int option2 = 0;
        int option3 = 0;
        int option4 = 0;
        int option5 = 0;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("\n1. Registrarse" + "\n2. Login" + "\n0. Salir"));
            switch(option) {
                case 1: {
                    usuario.registro();
                    JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
                    carta.cartaMedica();
                    carta.verificarEnfermedad();
                    break;
                }
                
                case 2: {
                    //Submenu para eligir el tipo de login
                    option2 = Integer.parseInt(JOptionPane.showInputDialog("\n1. Usuario" + "\n2. Administrador" + "\n0. Salir"));
                    switch(option2) {
                        case 1: {
                            usuario.verificarLogin(usuario.getUsername(), usuario.getPassword());
                            //Submenu para opciones de usuario
                            do{
                                option3 = Integer.parseInt(JOptionPane.showInputDialog("\n1. Comprar" + "\n2. Facturar" + "\n0. Salir"));
                                switch(option3) {
                                    case 1: {
                                        do{
                                            option5 = Integer.parseInt(JOptionPane.showInputDialog("\n1. Agregar" + "\n2. Eliminar" + "\n3. Lista" + "\n0. Salir"));
                                            switch(option5) {
                                                case 1: {
                                                   carro.agregarCarrito();
                                                   break;
                                                }
                                                case 2: {
                                                    carro.removerCarrito();
                                                    break;
                                                }
                                                case 3: {
                                                    carro.listaCarrito();
                                                    break;
                                                }
                                                default: {
                                                    JOptionPane.showMessageDialog(null, "Gracias por usar el carrito");
                                                    option5 = 0;
                                                    break;
                                                }
                                            }
                                        }while(option5 != 0);
                                        break;
                                    }
                                    case 2: {
                                        factura.facturarCarrito();
                                        break;
                                    }
                                    default: {
                                        option3 = 0;
                                        break;
                                    } 
                                }
                            }while(option3 != 0);
                            break;
                        } //FIN DEL MENU DE USUARIO
                        
                        
                        case 2: {
                            admin.adminLogin(admin.getUsername(), admin.getPassword());
                            //Submenu para opciones de usuario
                            do{
                                option4 = Integer.parseInt(JOptionPane.showInputDialog("\n1. Agregar Producto" + "\n2. Remover producto" + "\n3. Inventario" + "\n0. Salir"));
                                switch(option4) {
                                    case 1: {
                                        admin.agregarProducto();
                                        break;
                                    }
                                    case 2: {
                                        admin.eliminarProducto();
                                        break;
                                    }
                                    case 3: {
                                        admin.mostrarInventario();
                                        break;
                                    }
                                    default: {
                                        option4 = 0;
                                        break;
                                    } 
                                }
                            }while(option4 != 0);       
                            break;
                            } //Fin del menu de Administrador
                        }
                    } //Fin del segundo menu Usuario-Admin
                default: {
                    JOptionPane.showMessageDialog(null, "Gracias por visitarnos");
                    option = 0;
                    break;
                }
            } //Fin del primer menu Registro-Login
        }while(option != 0);
    }// Fin menu() Method
    
} //Fin Menu Class
