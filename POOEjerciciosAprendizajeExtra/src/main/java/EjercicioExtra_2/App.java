/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra_2;
import EjercicioExtra_2.Entidades.Puntos;
import EjercicioExtra_2.Servicios.ServiciosPuntos;


/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPuntos metodosPuntos = new ServiciosPuntos();
        Puntos puntos = metodosPuntos.crearPuntos();
        metodosPuntos.mostrarPuntos();
        
    }
    
}
