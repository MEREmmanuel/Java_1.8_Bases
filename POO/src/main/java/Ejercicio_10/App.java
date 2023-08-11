/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

import Ejercicio_10.Entidades.Arreglo;
import Ejercicio_10.Servicios.ArregloServicios;
import java.util.Arrays;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloServicios arregloA = new ArregloServicios();
        ArregloServicios arregloB = new ArregloServicios();
        
        Arreglo a = arregloA.crearArreglo(50);
        Arreglo b = arregloB.crearArreglo(20);
        
        System.out.println("Creamos el arreglo A.");
        System.out.println(Arrays.toString(arregloA.iniciarArreglo(a)));
        System.out.println("\nOrdenamos el arreglo de mayor a menor.");
        System.out.println(Arrays.toString(arregloA.ordenarArreglo(a)));
        System.out.println("\nCreamos el arreglo B.");
        System.out.println(Arrays.toString(arregloB.ArregloB(a,b)));
    }
    
}
