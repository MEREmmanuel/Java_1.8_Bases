/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rutina;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author bolillo Espartano
 */
public class ServicioRutina {
    private List<Rutina> rutinas = new ArrayList<>();

    public void crearRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    public List<Rutina> obtenerRutinas() {
        return rutinas;
    }

    public void actualizarRutina(UUID id, String nombre, int duracion, int nivelDificultad, String descripcion) {
        for (Rutina rutina : rutinas) {
            if (rutina.getUuid().equals(id)) {
                rutina.setNombre(nombre);
                rutina.setDuracion(duracion);
                rutina.setNivelDificultad(nivelDificultad);
                rutina.setDescripcion(descripcion);
                break;
            }
        }
    }

    public void eliminarRutina(UUID id) {
        rutinas.removeIf(rutina -> rutina.getUuid().equals(id));
    }
}
