/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3.Entidades;

import Ejercicio_3.Operacion;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        System.out.println("Suma: " + op.sumar());
        System.out.println("Resta: "+op.restar());
        System.out.println("Producto: "+op.multiplicar());
        System.out.println("Division: "+op.dividir());
    }
    
}
