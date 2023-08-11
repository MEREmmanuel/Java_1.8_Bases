/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_12;

import Ejercicio_12.Servicios.personaServicios;
import Ejercicio_12.Entidades.Persona;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaServicios creacionPersona = new personaServicios();
        
        Persona persona = creacionPersona.crearPersona();
        
        System.out.println(creacionPersona.calcularEdad());
        System.out.println(creacionPersona.menorQue(23));
        creacionPersona.mostrarPersona();
    }
    
}
