/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4_joseantoniomoralescoll;

/**
 *
 * @author moral
 */
public class Persona {
    private String nombre, apellido;
    private int edad;
    
    public Persona(){
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
}
