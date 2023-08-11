/*
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package EjercicioExtra_2;

import EjercicioExtra_2.Entities.CantanteFamoso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bolillo Espartano
 */
public class CantantesFamososApp {

    static List<CantanteFamoso> listaCantantesFamosos = new ArrayList();
    static Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    static CantanteFamoso cantanteFamoso;

    public static void main(String[] args) {
        agregarCantantes(5);
        mostrarCantantes();
        menu();
    }

    public static void agregarCantantes(int cantidadFamosos) {
        String nombre;
        String discoConMasVentas;
        for (int i = 0; i < cantidadFamosos; i++) {
            System.out.println("Nombre del cantante " + (i + 1));
            nombre = entrada.nextLine();
            System.out.println("Cual es su disco con más ventas ");
            discoConMasVentas = entrada.nextLine();
            cantanteFamoso = new CantanteFamoso(nombre, discoConMasVentas);
            listaCantantesFamosos.add(cantanteFamoso);
        }
    }

    public static void mostrarCantantes() {
        listaCantantesFamosos.forEach(cantante -> {
            System.out.println(cantante);
        });
    }

    public static void agregarCantante() {
        System.out.println("Nombre del cantante: ");
        String nombre = entrada.nextLine();
        System.out.println("Cual es su disco con más ventas: ");
        String discoConMasVentas = entrada.nextLine();
        cantanteFamoso = new CantanteFamoso(nombre, discoConMasVentas);
        listaCantantesFamosos.add(cantanteFamoso);
    }

    public static void eliminarCantante() {
        System.out.println("Nombre del cantante: ");
        String nombre = entrada.nextLine();
        cantanteFamoso = null;
        boolean existe = false;
        for (CantanteFamoso cantante : listaCantantesFamosos) {
            if (cantante.getNombre().equals(nombre)) {
                existe = true;
                cantanteFamoso = cantante;
                break;
            }
        }

        if (existe) {
            listaCantantesFamosos.remove(cantanteFamoso);
        } else {
            System.out.println("El cantante no existe en la lista.");
        }
    }
    
    public static void elegirOpcion(int opcion){
        switch (opcion) {
                case 1: {
                    System.out.println("...Agregando Cantante...");
                    agregarCantante();
                    break;
                }
                case 2: {
                    System.out.println("...Mostrando Cantantes...");
                    mostrarCantantes();
                    break;
                }
                case 3: {
                    System.out.println("...Eliminando Cantante...");
                    eliminarCantante();
                    break;
                }
                case 4: {
                    System.out.println("...Saliendo...");
                    break;
                }
                default: {
                    System.out.println("...Opcion incorrecta...");
                }
            }
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("1. Agregar Cantante.\n"
                    + "2. Mostrar Cantantes.\n"
                    + "3. Eliminar Cantante.\n"
                    + "4. Salir.");
            opcion = entrada.nextInt();
            entrada.nextLine();
            elegirOpcion(opcion);
        } while (opcion != 4);
    }
}
