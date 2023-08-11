/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package EjerciciosAprendizaje;
import java.util.Scanner;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        
        //definimos la frase como String
        String frase;
        
        //pedimos la frase y la guardamos
        System.out.println("Ingrese la frase");
        frase = sc.nextLine();
        
        //imprimimos la frase en mayusculas
        System.out.println(frase.toUpperCase());
        //imprimimos la frase en minusculas
        System.out.println(frase.toLowerCase());
    }
    
}
