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
public class RegistroMedico extends Cliente{
    
    //Atributos
    private int registroMedicoId;
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
    private String pregunta4;
    private String [] enfermedades ={"Hipertensión", "Asma", "Diabetes"};

    //Constructor
    public RegistroMedico(String pregunta1, String pregunta2, String pregunta3, String pregunta4, int clienteId, float dineroCuenta, String password, String username, String nombre, String apellido, String address) {
        super(clienteId, dineroCuenta, password, username, nombre, apellido, address);
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.pregunta4 = pregunta4;
    }
    
    public RegistroMedico(int clienteId, float dineroCuenta, String password, String username, String nombre, String apellido, String address) {
        super(clienteId, dineroCuenta, password, username, nombre, apellido, address);
    }

    public void cartaMedica() {
        //Preguntas a responder de los tipos de padecimientos
        JOptionPane.showMessageDialog(null, "Bienvenido a su registro medico" + " " + getNombre());
        Object opcion = JOptionPane.showInputDialog(null,"Padece alguna de estas enfermedades? ", "Elegir",JOptionPane.QUESTION_MESSAGE,null,enfermedades, enfermedades[0]);
        pregunta1 = opcion.toString();
        System.out.println("Test lista desoplegable "+ pregunta1);       
        pregunta2 = JOptionPane.showInputDialog("Cúal es su tipo de sangre?");
        pregunta3 = JOptionPane.showInputDialog("Cúal es su estatura? ");
        pregunta4 = JOptionPane.showInputDialog("Cúal es su tipo de peso?");
    } //Fin cartaMedica() Method
    
    public void verificarEnfermedad(){
        if (pregunta1.equals("Hipertension")){
           JOptionPane.showMessageDialog(null, "Consulte a su médico antes de adquirir los medicamentos");
        }
        if (pregunta1.equals("Asma")){
           JOptionPane.showMessageDialog(null, "Consulte a su médico antes de adquirir pastillas de paracetamol");
        }
        if (pregunta1.equals("Diabetes")){
           JOptionPane.showMessageDialog(null, "Consulte a su médico antes de adquirir bomba de salbutamol");
        }
    } //Fin verificarEnfermedad() Method
    

}//Fin RegistroMedico Class
