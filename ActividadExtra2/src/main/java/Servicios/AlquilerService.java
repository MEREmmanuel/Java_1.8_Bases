/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Data.ListaAlquiler;
import Data.ListaPeliculas;
import Entidades.Alquiler;
import Entidades.Pelicula;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author bolillo Espartano
 */
public class AlquilerService {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Alquiler crearAlquiler(){
        Alquiler alquiler = new Alquiler();
        
        System.out.println("Ingrese el ID de la pelicula");
        PeliculaService.listarPeliculas();
        int id = leer.nextInt();
        Pelicula pelicula = buscarID(id);
        alquiler.setPelicula(pelicula);
        alquiler.setFechaInicio(LocalDate.now());
        System.out.println("Cuantos días durará su alquiler.");
        int diasPlus = leer.nextInt();
        alquiler.setFechaFin(alquiler.getFechaInicio().plusDays(diasPlus));
        System.out.println("Ingrese el precio.");
        alquiler.setPrecio(10);
        return alquiler;
    }
    
    public Pelicula buscarID(int id){
        for (int i = 0; i < ListaPeliculas.listaPeliculas.length; i++) {
            if (id == ListaPeliculas.listaPeliculas[id].getidPelicula()) {
                return ListaPeliculas.listaPeliculas[id];
            }
        }
        return null;
    }
    
    public static void listarAlquiler() {
        for (int i = 0; i < ListaAlquiler.listaAlquileres.length; i++) {
            System.out.println(ListaAlquiler.listaAlquileres[i]);
        }
    }
}
