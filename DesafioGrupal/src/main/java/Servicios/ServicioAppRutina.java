/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Rutina;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
/**
 *
 * @author bolillo Espartano
 */
public class ServicioAppRutina {
    private ServicioRutina servicioRutina = new ServicioRutina();
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public void registrarRutinaApp() {
        System.out.println("Ingrese los datos de la rutina:");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Duracion: ");
        int duracion = scanner.nextInt();
        System.out.println("Nivel dificultad: ");
        int nivelDificultad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Descripción: ");
        String descripcion = scanner.nextLine();

        Rutina rutina = new Rutina(nombre, duracion, nivelDificultad, descripcion);

        servicioRutina.crearRutina(rutina);

        System.out.println("Rutina creada exitosamente.");
    }
    
    public void obtenerRutinasApp(){
        List <Rutina> rutinas = servicioRutina.obtenerRutinas();
        
        if (rutinas.isEmpty()) {
            System.out.println("No hay rutinas creadas.");
        }else{
            System.out.println("Lista de rutinas.");
            for (Rutina rutina : rutinas) {
                System.out.println(rutina);
            }
        }
    }
    
    public void actualizarRutinaApp(){
        System.out.println("Ingrese el ID de la rutina a actualizar:");
        UUID id = UUID.fromString(scanner.nextLine());
        System.out.println("Ingrese los nuevos datos de la rutina:");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Duracion: ");
        int duracion = scanner.nextInt();
        System.out.println("Nivel dificultad: ");
        int nivelDificultad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Descripción: ");
        String descripcion = scanner.nextLine();
        
        servicioRutina.actualizarRutina(id, nombre, duracion, nivelDificultad, descripcion);
        
        System.out.println("Rutina actualizada exitosamente.");
    }
    
    public void eliminarRutina(){
        System.out.println("Ingrese el ID de la rutina a eliminar:");
        UUID id = UUID.fromString(scanner.nextLine());
        
        servicioRutina.eliminarRutina(id);
    }
}
