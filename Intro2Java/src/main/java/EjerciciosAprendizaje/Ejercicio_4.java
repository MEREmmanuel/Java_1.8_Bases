/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package EjerciciosAprendizaje;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //definimos centigrados y fahrenheit
        int centigrados;
        float fahrenheint;
        
        //pedimos los grados centígrados
        centigrados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los grados C"));
        
        //formula para convertir a fahrenheit
        fahrenheint = 32 + (9*centigrados/5);
        
        //imprimimos los grados fahrenheit
        JOptionPane.showMessageDialog(null,centigrados + " C equivalen a " 
                + fahrenheint + " F.");
    }
    
}
