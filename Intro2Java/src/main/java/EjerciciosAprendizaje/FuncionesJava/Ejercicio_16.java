/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package EjerciciosAprendizaje.FuncionesJava;
import javax.swing.JOptionPane;
public class Ejercicio_16 {

    public static void main(String[] args) {
        int tamano, numero;
        tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        int[] vector = new int[tamano];
        llenarVector(vector);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño el numero a buscar"));
        buscarNumero(vector, numero);
    }
    public static void llenarVector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10);
        }
    }
    public static void buscarNumero(int vector[], int numero){
        int cont=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" está en la posicion "+i);
                cont++;
            }
        }
        if (cont>1){
        JOptionPane.showMessageDialog(null,"El numero está repetido "+cont+" veces" );
        }
    }
}
