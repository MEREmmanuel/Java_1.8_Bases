/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

import Ejercicio_7.Entidades.Persona;
import Ejercicio_7.Servicios.personaServicios;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int abajo = 0, ideal = 0, arriba = 0;
        int mayor = 0, menor = 0;

        personaServicios[] personas = new personaServicios[4];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new personaServicios();
        }

        Persona[] per = new Persona[4];

        for (int i = 0; i < per.length; i++) {
            per[i] = personas[i].crearPersona();
        }

        for (int i = 0; i < per.length; i++) {
            if (personas[i].calcularIMC(per[i]) < 0) {
                abajo++;
            } else if (personas[i].calcularIMC(per[i]) == 0) {
                ideal++;
            } else {
                arriba++;
            }
            if (personas[i].mayorEdad(per[i]) == true) {
                mayor++;
            } else {
                menor++;
            }
        }

        JOptionPane.showMessageDialog(null, ((double) abajo / (double) per.length) * 100 + "% están abajo de su peso ideal.\n"
                + ((double) ideal / (double) per.length) * 100 + "% están en su peso ideal.\n"
                + ((double) arriba / (double) per.length / arriba) * 100 + "% están en su peso ideal.\n");
        JOptionPane.showMessageDialog(null, (mayor / per.length) * 100 + " son mayores de edad.\n"
                + (menor / per.length) * 100 + " son menores de edad.");
    }

}
