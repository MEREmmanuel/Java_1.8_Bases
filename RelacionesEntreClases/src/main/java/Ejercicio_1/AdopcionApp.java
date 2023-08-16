/*
Realizar un programa para que una Persona pueda adoptar un Perro.
 */
package Ejercicio_1;

import Ejercicio_1.Servicios.Adopcion;
import Ejercicio_1.Servicios.PerroServicios;
import Ejercicio_1.Servicios.PersonaServicios;

/**
 *
 * @author bolillo Espartano
 */
public class AdopcionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adopcion adopcion = new Adopcion();
        adopcion.iniciar();
        adopcion.menuAdopcion();
    }
    
}
