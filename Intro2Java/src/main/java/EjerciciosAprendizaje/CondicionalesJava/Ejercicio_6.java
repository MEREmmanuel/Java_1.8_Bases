/*
Crear un programa que dado un numero determine si es par o impar.
 */
package EjerciciosAprendizaje.CondicionalesJava;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        
        
        if (parImpar(numero)){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es impar");
        }
        
    }
    
    public static boolean parImpar(int num){
    boolean valor;
    valor = num % 2 == 0;
    return valor;
}
}