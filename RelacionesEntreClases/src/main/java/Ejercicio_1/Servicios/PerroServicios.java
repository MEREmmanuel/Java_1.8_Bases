/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1.Servicios;

import Ejercicio_1.Entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author bolillo Espartano
 */
public class PerroServicios {

    private Perro perro;
    private List<Perro> listaPerros = new ArrayList();

    public void listaPerrosPrevios() {
        listaPerros.add(new Perro("Max", "Labrador Retriever", 3, "Mediano"));
        listaPerros.add(new Perro("Buddy", "German Shepherd", 2, "Grande"));
        listaPerros.add(new Perro("Rocky", "Golden Retriever", 5, "Grande"));
        listaPerros.add(new Perro("Bailey", "Bulldog", 1, "Pequeño"));
        listaPerros.add(new Perro("Lucy", "Poodle", 4, "Mediano"));
        listaPerros.add(new Perro("Charlie", "Yorkshire Terrier", 6, "Pequeño"));
        listaPerros.add(new Perro("Daisy", "Beagle", 2, "Pequeño"));
        listaPerros.add(new Perro("Lola", "Bulldog", 3, "Mediano"));
        listaPerros.add(new Perro("Sadie", "Poodle", 7, "Mediano"));
        listaPerros.add(new Perro("Molly", "Golden Retriever", 4, "Grande"));
    }

    public void mostrarListaPerros() {
        for (Perro per : listaPerros) {
            System.out.println(per);
        }
    }
    
    public void eliminarPersonaDeLista(Perro perro) {
        listaPerros.remove(perro);
    }

    public List<Perro> getListaPerros() {
        return listaPerros;
    }
    
}
