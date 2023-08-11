/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package EjercicioExtra_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bolillo Espartano
 */
public class SerieNumeros {

    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Integer> listaNumeros = new ArrayList();

    public static void main(String[] args) {
        leerNumeros();
        System.out.println("Numero de valores leidos: " + numeroValoresLeidos());
        System.out.println("Suma: " + sumaSerieNumeros());
        System.out.println("Media: " + mediaSerieNumeros());
    }

    public static void leerNumeros() {
        int numero;
        do {
            System.out.println("Ingrese el numero.");
            numero = scanner.nextInt();
            if (numero != -99) {
                listaNumeros.add(numero);
            }
        } while (numero != -99);
    }

    public static int numeroValoresLeidos() {
        return listaNumeros.size();
    }

    public static int sumaSerieNumeros() {
        return listaNumeros.stream().mapToInt(Integer::intValue).sum();
    }

    public static double mediaSerieNumeros() {
        return (double)sumaSerieNumeros()/numeroValoresLeidos();
    }
}
