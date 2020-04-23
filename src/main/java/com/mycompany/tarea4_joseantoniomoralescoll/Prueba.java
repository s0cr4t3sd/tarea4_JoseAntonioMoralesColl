/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4_joseantoniomoralescoll;

/**
 *
 * @author Nao
 */
public class Prueba {

    public static void main(String[] args) {
        //Creo e instancio tres personas
        Persona persona1 = new Persona("María Jesús", "García", 39);
        Persona persona2 = new Persona("Javier", "Muñoz", 25);
        Persona persona3 = new Persona();
        
        //Imprimo los datos
        System.out.println("Datos persona1: " + persona1.toString());
        System.out.println("Datos persona2: " + persona2.toString());
        System.out.println("Datos persona3: " + persona3.toString());
    }
}
