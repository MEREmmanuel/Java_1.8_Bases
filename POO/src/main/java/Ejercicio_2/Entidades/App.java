/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2.Entidades;

import Ejercicio_2.Circunferencia;
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
        Circunferencia c1 = new Circunferencia(0);
        c1.crearCircunferencia(Double.parseDouble(JOptionPane.showInputDialog(null,"Radio: ")));
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
    }
    
}
