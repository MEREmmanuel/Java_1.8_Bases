/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package EjerciciosAprendizaje.FuncionesJava;
import javax.swing.JOptionPane;


public class Ejercicio_17 {

    public static void main(String[] args) {
        int tamano;
        tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        int[] vector = new int[tamano];
        llenarVector(vector);
        recorrerVector(vector);
    }
    public static void llenarVector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            do{
                vector[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero "+(i+1)));
            }while(vector[i]>99999);
        }
    }
    public static void recorrerVector(int vector[]){
        int cont=0, aux=0;
        int[] digitos = new int[5];
        for (int i = 0; i < vector.length; i++) {
            aux = vector[i];
            do{
                aux = aux/10;
                cont++;
            }while(aux>0);
            System.out.println(cont);
            for (int j = 0; j < 5; j++) {
                if (cont==j+1){
                    digitos[j]++;
                }
            }
            cont = 0;
        }
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Numeros de "+(i+1)+" digitos: "+digitos[i]);
        }
    }
}
