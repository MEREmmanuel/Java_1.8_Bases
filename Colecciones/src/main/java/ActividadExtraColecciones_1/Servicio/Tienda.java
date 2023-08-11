/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadExtraColecciones_1.Servicio;

import ActividadExtraColecciones_1.Entidad.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bolillo Espartano
 */
public class Tienda {
    List<Producto> productos;
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Tienda(List<Producto> productos) {
        this.productos = productos;
    }
    
    public boolean venta() {
        System.out.println("Qué producto se venderá.");
        String productoCompra = scanner.nextLine();
        for (Producto p : productos) {
            if (productoCompra.equals(p.getNombre())) {
                p.setCantidad(p.getCantidad() - 1);
                return true;
            }
        }
        return false;
    }

    public void reposicion() {
        System.out.println("Qué producto repondrá.");
        String productoReposicion = scanner.nextLine();
        for (Producto p : productos) {
            if (productoReposicion.equals(p.getNombre())) {
                p.setCantidad(p.getCantidad() + 1);
                System.out.println("Producto repuesto.");
            }
        }
        System.out.println("El producto no existe en el inventario.");
    }

    @Override
    public String toString() {
        return "Tienda{" + "productos=" + productos + '}';
    }
    
}
