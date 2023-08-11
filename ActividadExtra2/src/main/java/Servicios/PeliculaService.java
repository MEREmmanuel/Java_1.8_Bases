/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Data.ListaPeliculas;
import Entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author epile
 */
public class PeliculaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingresa el ID de la película:");
        pelicula.setidPelicula(leer.nextInt());
        System.out.println("Ingresa el título de la película:");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingresa el género de la película:");
        pelicula.setGenero(leer.next());
        System.out.println("Ingresa el año de la película:");
        pelicula.setAnio(leer.nextInt());
        System.out.println("Ingresa la duración de la película:");
        pelicula.setDuracion(leer.nextInt());
        return pelicula;
    }

    public static void listarPeliculas(){
        for (int i = 0; i < ListaPeliculas.listaPeliculas.length; i++) {
            System.out.println(ListaPeliculas.listaPeliculas[i]);
        }
    }
}
