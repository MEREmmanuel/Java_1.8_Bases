/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

        
package EjerciciosAprendizaje;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definimos el nombre como String
        String nombre;
        
        //pedimos el nombre
        nombre =JOptionPane.showInputDialog("Ingrese su nombre.");
        
        //imprimos el nombre
        JOptionPane.showMessageDialog(null,"Su nombre es: "+ nombre);
    }
    
}