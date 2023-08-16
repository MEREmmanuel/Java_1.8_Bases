/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1.Servicios;

import Ejercicio_1.Entidades.Perro;
import Ejercicio_1.Entidades.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author bolillo Espartano
 */
public class Adopcion {

    private PersonaServicios personaServicios = new PersonaServicios();
    private PerroServicios perroServicios = new PerroServicios();
    private List<Persona> listaAdopciones = new ArrayList();
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    
    public void iniciar() {
        personaServicios.listaPersonasPrevias();
        perroServicios.listaPerrosPrevios();
    }
    
    public void procesoAdopcion() {
        personaServicios.mostrarListaPersonas();
        System.out.println("Ingrese el nombre de la persona que quiere adoptar.");
        String nombrePersona = scanner.nextLine();
        perroServicios.mostrarListaPerros();
        System.out.println("¿Qué perro quiere adoptar?");
        String nombrePerro = scanner.nextLine();
        Persona persona = personaElegida(nombrePersona);
        Perro perro = perroElegido(nombrePerro);
        listaAdopciones.add(personaServicios.asignarPerro(persona, perro));
        eliminarPerroYPersona(persona, perro);
    }
    
    public Persona personaElegida(String nombre) {
        Persona persona = null;
        
        for (Persona per : personaServicios.getListaPersonas()) {
            if (nombre.equals(per.getNombre())) {
                persona = per;
            }
        }
        
        return persona;
    }
    
    public Perro perroElegido(String nombre) {
        Perro perro = null;
        
        for (Perro per : perroServicios.getListaPerros()) {
            if(nombre.equals(per.getNombre())){
                perro = per;
            }
        }
        
        return perro;
    }
    
    public void eliminarPerroYPersona(Persona persona, Perro perro) {
        personaServicios.eliminarPersonaDeLista(persona);
        perroServicios.eliminarPersonaDeLista(perro);
    }
    
    public void mostrarListaAdopciones() {
        for (Persona per : listaAdopciones) {
            System.out.println(per);
        }
    }

    public void menuAdopcion() {
        do {
            procesoAdopcion();            
        } while (personaServicios.getListaPersonas().size()>8);
        mostrarListaAdopciones();
    }
    
}
