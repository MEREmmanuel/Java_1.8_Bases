/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package EjerciciosAprendizaje.Bucles_SentenciasDeSaltoBreakContinue;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valorLim, numero, suma;
        suma = 0;
        
        valorLim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el límite"));
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            suma = sumaNumeros(numero,suma);
            if (suma<=valorLim){
                JOptionPane.showMessageDialog(null, "Suma -> "+suma);
            }
        }while (suma<=valorLim);
        JOptionPane.showMessageDialog(null, "La suma: "+suma+ " ya superó el límite incial: "+valorLim);
    }
    
    public static int sumaNumeros(int num, int suma){
        int aux;
        aux = suma;
        suma = aux + num;
        
        return suma;
    }
}
