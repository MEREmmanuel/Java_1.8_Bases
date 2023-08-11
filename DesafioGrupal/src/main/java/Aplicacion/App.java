/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Servicios.ServicioAppCliente;
import Servicios.ServicioAppRutina;
import java.util.Scanner;


/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAppCliente servicioAppCliente = new ServicioAppCliente();
        ServicioAppRutina servicioAppRutina = new ServicioAppRutina();
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 9) {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Obtener clientes.");
            System.out.println("3. Actualizar cliente.");
            System.out.println("4. Eliminar cliente.");
            System.out.println("5. Crear rutina.");
            System.out.println("6. Obtener rutinas.");
            System.out.println("7. Actualizar rutina.");
            System.out.println("8. Eliminar rutina.");
            System.out.println("9. Salir.");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    servicioAppCliente.registrarClienteApp();
                    break;
                case 2:
                    servicioAppCliente.obtenerClientesApp();
                    break;
                case 3:
                    servicioAppCliente.actualizarClienteApp();
                    break;
                case 4:
                    servicioAppCliente.eliminarClienteApp();
                    break;
                case 5:
                    servicioAppRutina.registrarRutinaApp();
                    break;
                case 6:
                    servicioAppRutina.obtenerRutinasApp();
                    break;
                case 7:
                    servicioAppRutina.actualizarRutinaApp();
                    break;
                case 8:
                    servicioAppRutina.eliminarRutina();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        }
        scanner.close();
    }
}

