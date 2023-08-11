/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
 */
package EjerciciosAprendizaje.Vectores_Matrices;
import javax.swing.JOptionPane;
public class Ejercicio_14 {

    public static void main(String[] args) {
        double euro = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de euros"));
        convertirEuros(euro);
    }
    
    public static void convertirEuros(double e){
        double[] conversiones = new double[3];
        conversiones[0]= 0.86 * e;
        conversiones[1]= 1.28611 * e;
        conversiones[2]= 129.852 * e;
        
        JOptionPane.showMessageDialog(null,conversiones[0] + " libras es " + e + "E");
        JOptionPane.showMessageDialog(null,conversiones[1] + " $ es " + e + "E");
        JOptionPane.showMessageDialog(null,conversiones[2] + " yenes es " + e + "E");
    }
}
