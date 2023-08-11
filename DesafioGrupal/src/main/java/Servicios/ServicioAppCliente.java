/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import Entidades.Cliente;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
/**
 *
 * @author bolillo Espartano
 */
public class ServicioAppCliente {
    private ServicioCliente servicioCliente = new ServicioCliente();
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void registrarClienteApp() {
        System.out.println("Ingrese los datos del cliente:");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Objetivo: ");
        String objetivo = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, edad, altura, peso, objetivo);

        servicioCliente.registrarCliente(cliente);

        System.out.println("Cliente registrado exitosamente.");
    }

    public void obtenerClientesApp() {
        List<Cliente> clientes = servicioCliente.obtenerClientes();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public void actualizarClienteApp() {
        System.out.println("Ingrese el ID del cliente a actualizar:");
        UUID id = UUID.fromString(scanner.nextLine());
        System.out.println("Ingrese los nuevos datos del cliente:");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Objetivo: ");
        String objetivo = scanner.nextLine();

        servicioCliente.actualizarCliente(id, nombre, edad, altura, peso, objetivo);

        System.out.println("Cliente actualizado exitosamente.");
    }

    public void eliminarClienteApp() {
        System.out.println("Ingrese el ID del cliente a eliminar:");
        UUID id = UUID.fromString(scanner.nextLine());

        servicioCliente.eliminarCliente(id);

        System.out.println("Cliente eliminado exitosamente.");
    }

}
