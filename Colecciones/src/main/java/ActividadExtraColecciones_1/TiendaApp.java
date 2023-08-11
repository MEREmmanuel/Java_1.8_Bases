/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadExtraColecciones_1;

import ActividadExtraColecciones_1.Entidad.Producto;
import java.util.ArrayList;
import ActividadExtraColecciones_1.Servicio.Tienda;
import java.util.Scanner;

/**
 *
 * @author bolillo Espartano
 */
public class TiendaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el ArrayList de productos
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int input;

        // Agregamos algunos productos al ArrayList
        productos.add(new Producto("Camiseta", "Ropa", 25.99, 50));
        productos.add(new Producto("Zapatos deportivos", "Calzado", 59.99, 30));
        productos.add(new Producto("Teléfono móvil", "Electrónica", 349.99, 15));

        // Creamos la tienda y le pasamos la lista de productos
        Tienda tienda = new Tienda(productos);
        do {
            System.out.println("\n"+tienda);
            System.out.println("\n1. Venta.\n"
                    + "2. Reponer.\n"
                    + "3. Salir.\n");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("¿Producto vendido? -> "+tienda.venta());
                    break;
                case 2:
                    tienda.reposicion();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error en la opción.");
            }
        } while (input != 3);

    }

}
