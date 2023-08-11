/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_12.Servicios;

import Ejercicio_12.Entidades.Persona;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class personaServicios {
    private Persona persona;
    public Persona crearPersona() {
        String nombre = JOptionPane.showInputDialog(null, "Nombre de la persona: ");
        int anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Año de la persona: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes de la persona: "));
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia de la persona: "));
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        persona = new Persona(nombre, fecha);
        return persona;
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        Date fecha = persona.getFecha();
        int edad = fechaActual.getYear() - fecha.getYear();

        if (fechaActual.getMonth() < fecha.getMonth() || (fechaActual.getMonth() == fecha.getMonth() && fechaActual.getDate() < fecha.getDate())) {
            edad--; // Restar 1 a la edad si todavía no ha cumplido años en el año actual
        }
        
        return edad;
    }
    
    public boolean menorQue(int edad){
        int edadPersona = calcularEdad();
        if(edadPersona < edad){
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarPersona(){
        JOptionPane.showMessageDialog(null,"Esta persona se llama "+persona.getNombre()
                + " y tiene "+calcularEdad()+" años."+" Por lo tanto, \n"
                        + "su fecha de nacimiento es, "+persona.getFecha());
    }
}
