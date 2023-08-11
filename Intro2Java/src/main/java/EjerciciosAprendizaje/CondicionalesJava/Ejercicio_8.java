/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package EjerciciosAprendizaje.CondicionalesJava;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        
        do {
            frase = JOptionPane.showInputDialog("Ingrese la frase");
            if (determinarLongitud(frase)==8){
                JOptionPane.showMessageDialog(null, "Correcto");
            }else{
                JOptionPane.showMessageDialog(null, "Incorrecto");
            }
        } while (determinarLongitud(frase) != 8);
        
    }

    public static int determinarLongitud(String frase){
        int longitud;
        
        longitud = frase.length();
        
        return longitud;
    }
}