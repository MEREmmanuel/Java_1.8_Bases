/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1.Servicios;

import Ejercicio_1.Entidades.Perro;
import Ejercicio_1.Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author bolillo Espartano
 */
public class PersonaServicios {

    private Persona persona;
    private List<Persona> listaPersonas = new ArrayList();

    public void listaPersonasPrevias() {
        listaPersonas.add(new Persona("Juan", "Gómez", 25, "Documento1", null));
        listaPersonas.add(new Persona("Maria", "Rodríguez", 30, "Documento2", null));
        listaPersonas.add(new Persona("Carlos", "Pérez", 40, "Documento3", null));
        listaPersonas.add(new Persona("Ana", "Fernández", 22, "Documento4", null));
        listaPersonas.add(new Persona("Luis", "López", 35, "Documento5", null));
        listaPersonas.add(new Persona("Laura", "Martínez", 28, "Documento6", null));
        listaPersonas.add(new Persona("Pedro", "García", 60, "Documento7", null));
        listaPersonas.add(new Persona("Sofia", "Díaz", 42, "Documento8", null));
        listaPersonas.add(new Persona("Diego", "Torres", 29, "Documento9", null));
        listaPersonas.add(new Persona("Valeria", "Sánchez", 50, "Documento10", null));
    }

    public void mostrarListaPersonas() {
        for (Persona per : listaPersonas) {
            System.out.println(per);
        }
    }
    
    public Persona asignarPerro(Persona persona, Perro perro) {
        persona.setPerro(perro);
        return persona;
    }

    public void eliminarPersonaDeLista(Persona persona) {
        listaPersonas.remove(persona);
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

}
