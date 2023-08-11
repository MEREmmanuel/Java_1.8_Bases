/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_11;

import java.util.Date;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date fecha = new Date(99, (3) - 1, 20);

        Date fechaActual = new Date();
        System.out.println("Fecha ingresada: " + fecha);

        int diferenciaAnios = fechaActual.getYear() - fecha.getYear();
        System.out.println("Diferencia en años: " + diferenciaAnios);

    }

}
