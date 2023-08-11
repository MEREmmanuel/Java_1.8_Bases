/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8;

import Ejercicio_8.Entidades.Cadena;
import Ejercicio_8.Servicios.cadenaServicios;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cadenaServicios cadena = new cadenaServicios();
        
        Cadena c = cadena.crearCadena();
        
        c.setFrase("hola como estan");
        c.setLongitud(c.getFrase().length());
        
        System.out.println("Vocales: "+cadena.mostrarVocales(c));
        System.out.println("Frase invertida: "+cadena.invertirFrase(c));
        System.out.println("Cuántas veces -h-: "+cadena.vecesRepetido(c,'h'));
        
        String nuevaFrase=" muchachos";
        System.out.println("Longitudes iguales: "+cadena.compararLongitud(c, nuevaFrase));
        System.out.println("Frases unidas: "+cadena.unirFrases(c, nuevaFrase));
        System.out.println("a reemplazada por #: "+cadena.reemplazar(c, '#'));
        System.out.println("La frase tiene -a-: "+cadena.contiene(c, 'a'));
    }
    
}
