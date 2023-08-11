/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package EjerciciosAprendizaje;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definimos el entero;
        int entero;
        
        //pedimos el numero
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero entero"));
        
        //imprimimos los resultados, yo hice los procesos en la misma impresion
        JOptionPane.showMessageDialog(null, "El doble de "+entero+" es "+(entero*2));
        JOptionPane.showMessageDialog(null, "El triple de "+entero+" es "+(entero*3));
        JOptionPane.showMessageDialog(null, "La raiz cuadrada de "+entero+" es "+(Math.sqrt(entero)));
    }
    
}
