/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_13;

import Ejercicio_13.Entidades.Curso;
import Ejercicio_13.Servicios.cursoServicios;
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
        cursoServicios metodos  = new cursoServicios();
        Curso curso = metodos.crearCurso();
        System.out.println(curso);
        JOptionPane.showMessageDialog(null, "El curso genera una ganancia semanal de: $"+metodos.calcularGananciaSemanal());
    }
    
}
