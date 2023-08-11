/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Ejercicio_6.Services;

import Ejercicio_6.Entities.Producto;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class Tienda {

    private Producto producto;
    private HashMap<String, Double> listaProductos = new HashMap();

    public void añadirProducto() {
        String nombre = JOptionPane.showInputDialog(null, "Nombre del producto:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio del producto:"));
        producto = new Producto(nombre, precio);
        listaProductos.put(nombre, precio);
    }

    public void modificarPrecio() {
        String nombre = JOptionPane.showInputDialog(null, "Nombre del producto:");
        listaProductos.entrySet().stream().filter(entry -> (entry.getKey().equals(nombre))).forEachOrdered(entry -> {
            double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio del producto:"));
            listaProductos.replace(entry.getKey(), precio);
        });
    }

    public void eliminarProducto() {
        boolean exist = false;
        String nombre = JOptionPane.showInputDialog(null, "Nombre del producto:");
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            if (entry.getKey().equals(nombre)) {
                exist = true;
            }
        }
        if (exist) {
            listaProductos.remove(nombre);
        }
    }

    public void mostrarProductos() {
        listaProductos.entrySet().forEach(entry -> {
            JOptionPane.showMessageDialog(null, "clave=" + entry.getKey() + ", valor=" + entry.getValue());
        });
    }

    public void menu() {
        int input;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1. Agregar Producto.\n"
                    + "\n2. Modificar Precio.\n"
                    + "\n3. Eliminar Producto\n."
                    + "\n4. Salir."));
            switch (input) {
                case 1:
                    añadirProducto();
                    mostrarProductos();
                    break;
                case 2:
                    modificarPrecio();
                    mostrarProductos();
                    break;
                case 3:
                    eliminarProducto();
                    mostrarProductos();
                    break;
                case 4:
                    break;
                default:
            }
        } while (input != 4);

    }
}
