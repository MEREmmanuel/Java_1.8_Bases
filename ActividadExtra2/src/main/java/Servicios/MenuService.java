package Servicios;

import java.util.Scanner;

public class MenuService {
    public static void mostrarMenu(){
        System.out.println("Menu de Opciones");
        System.out.println("Escoga un número de una opción valida. ");
        System.out.println("1. Crear Pelicula");
        System.out.println("2. Crear Alquiler");
        System.out.println("3. Listar Peliculas disponibles");
        System.out.println("4. Listar los alquileres");
        System.out.println("5. Buscar Pelicula por titulo");
        System.out.println("6. Buscar Pelicula por genero");
        System.out.println("7. Buscar un alquiler por fecha");
        System.out.println("8. Calcular ingreso total por el servicio");
        System.out.println("9. Salir");

        opcionEscogida();
    }

    private static void opcionEscogida(){
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                PeliculaService peliculaService = new PeliculaService();
                peliculaService.crearPelicula();
                break;

            case 2:
                AlquilerService alquilerService = new AlquilerService();
                alquilerService.crearAlquiler();
                break;

            case 3:
                PeliculaService.listarPeliculas();
                break;

            case 4:
                System.out.println("Por implementar");
                break;

            case 5:
                System.out.println("Por implementar");
                break;

            case 6: 
                System.out.println("Por implementar");
                break;

            case 7:
                System.out.println("Por implementar");
                break;
            
            case 8: 
                System.out.println("Por implementar");
                break;
        
            case 9:
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
            default:
                System.out.println("Opcion invalida");
                mostrarMenu();
                break;
        }

        scanner.close();
    }
}
