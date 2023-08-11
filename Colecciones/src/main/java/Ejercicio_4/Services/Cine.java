/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Ejercicio_4.Services;

import Ejercicio_4.Entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class Cine {

    private Pelicula pelicula;
    private ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public Pelicula crearPelicula() {
        String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo: ");
        String director = JOptionPane.showInputDialog(null, "Ingrese el director: ");
        double duracion = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la duracion en horas: "));
        pelicula = new Pelicula(titulo, director, duracion);
        return pelicula;
    }

    public void agregarListaPeliculas() {
        listaPeliculas.add(pelicula);
    }

    public void mostrarTodas() {
        listaPeliculas.forEach(peliculas -> {
            System.out.println(peliculas);
        });
    }

    public void mostrarMayorHora() {
        listaPeliculas.forEach(peliculas -> {
            if (peliculas.getDuracion() > 1) {
                System.out.println(peliculas);
            }
        });
    }

    public void ordenarDuracionMayorAMenor(){
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		return Double.compare(p2.getDuracion(), p1.getDuracion());
	}
        });
        mostrarTodas();
    }
    
    public void ordenarDuracionMenorAMayor(){
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		return Double.compare(p1.getDuracion(), p2.getDuracion());
	}
        });
        mostrarTodas();
    }
    
    public void ordenarPorTitulo(){
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		return (p1.getTitulo().compareTo(p2.getTitulo()));
	}
        });
        mostrarTodas();
    }
    
    public void ordenarPorDirector(){
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		return (p1.getDirector().compareTo(p2.getDirector()));
	}
        });
        mostrarTodas();
    }

    public void menu() {
        int n;
        do {
            crearPelicula();
            agregarListaPeliculas();
            n = JOptionPane.showConfirmDialog(
                    null,
                    "Desea ingresar otra pelicula?",
                    "Si dice que no, se mostraran las peliculas enlistadas.",
                    JOptionPane.YES_NO_OPTION);
        } while (n == JOptionPane.YES_OPTION);
        System.out.println("\nTodas las peliculas:");
        mostrarTodas();
        System.out.println("\nPeliculas que duran más de 1 hora:");
        mostrarMayorHora();
        System.out.println("\nDe mayor a menor duracion:");
        ordenarDuracionMayorAMenor();
        System.out.println("\nDe menor a mayor duracion:");
        ordenarDuracionMenorAMayor();
        System.out.println("\nOrdenar por titulo alfabeticamente:");
        ordenarPorTitulo();
        System.out.println("\nOrdenar por director alfabeticamente:");
        ordenarPorDirector();
    }
}
