/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

        
package EjerciciosAprendizaje;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definimos los numeros enteros
        int num1,num2;
        
        //pedimos los dos numeros
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        
        //imprimimos la suma
        JOptionPane.showMessageDialog(null,"El resultado es: "+(num1+num2));
    }
    
}
