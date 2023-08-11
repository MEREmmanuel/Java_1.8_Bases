/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 */
package EjerciciosAprendizaje.Bucles_SentenciasDeSaltoBreakContinue;
import javax.swing.JOptionPane;

public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elementos = pedirElementos();
        System.out.println(elementos);
        String[][] matriz = new String[elementos][elementos];
        System.out.println(matriz.length);
        llenarMatriz(matriz,elementos);
        mostrarMatriz(matriz,elementos);
    }
    
    public static int pedirElementos(){
        int element = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de elementos"));
        return element;
    }
    
    public static void llenarMatriz(String[][] matriz, int elementos){
        for (int i = 0; i < elementos ; i++) {
            for (int j = 0; j < elementos; j++) {
                if ((i==0) || (i>0 && j==0) || (i>0 && j==(elementos-1)) || (i==elementos-1) ){
                matriz[i][j] = "*";
                }else{
                matriz[i][j] = " ";
                }
            }
        }
        }

    
    public static void mostrarMatriz(String[][] matriz, int elementos){
        for (int i = 0; i < elementos ; i++) {
            for (int j = 0; j < elementos; j++) {
                System.out.print(" " + matriz[i][j]);
            }
        System.out.println(" ");
        System.out.println("");
        }
    }
}
