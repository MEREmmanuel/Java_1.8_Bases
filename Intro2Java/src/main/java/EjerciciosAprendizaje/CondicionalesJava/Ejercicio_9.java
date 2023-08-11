/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package EjerciciosAprendizaje.CondicionalesJava;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        
        frase = JOptionPane.showInputDialog("Ingrese la frase");
        
        
        if (validarLetra(frase)){
            JOptionPane.showMessageDialog(null,"Correcto");
        }else{
            JOptionPane.showMessageDialog(null, "Incorrecto");
        }
    }
    
    public static boolean validarLetra(String frase){
        boolean val;
        
        val = "A".equals(frase.substring(0,1));
        
        return val;
    }
}
