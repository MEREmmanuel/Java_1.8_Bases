/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7.Servicios;

import Ejercicio_7.Entidades.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class personaServicios {

    public Persona crearPersona() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad: "));
        String sexo;
        do {
            sexo = JOptionPane.showInputDialog(null, "Ingrese el sexo. \n"
                    + "H. Hombre. \n"
                    + "M. Mujer. \n"
                    + "O. Otro");
        } while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el peso: "));


        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona p) {
        double IMC;
        int retornoIMC;

        IMC = (p.getAltura() / Math.pow(p.getPeso(), 2));
        if (IMC < 20) {
            retornoIMC = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            retornoIMC = 0;
        } else {
            retornoIMC = 1;
        }

        return retornoIMC;
    }
    
    public boolean mayorEdad(Persona p){
        if (p.getEdad()>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
