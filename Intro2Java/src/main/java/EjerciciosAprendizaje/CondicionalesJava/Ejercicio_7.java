/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package EjerciciosAprendizaje.CondicionalesJava;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        
        frase = JOptionPane.showInputDialog("Ingrese la frase");
        
        if (validarIgual(frase)){
            JOptionPane.showMessageDialog(null, "La frase es correcta");
        } else{
            JOptionPane.showMessageDialog(null, "La frase es incorrecta");
        }
    }
    
    public static boolean validarIgual(String frase){
        boolean resultado;
        
        resultado = "eureka".equals(frase);
        
        return resultado;
    }
}
