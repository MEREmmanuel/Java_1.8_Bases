/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra_6;

import EjercicioExtra_6.Entidades.Ahorcado;
import EjercicioExtra_6.Servicios.ServiciosAhorcado;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosAhorcado metodosAhorcado = new ServiciosAhorcado();
        
        Ahorcado juego = metodosAhorcado.crearJuego();
        
        metodosAhorcado.juego();
    }
    
}
