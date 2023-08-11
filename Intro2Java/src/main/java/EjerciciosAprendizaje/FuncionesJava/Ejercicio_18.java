/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package EjerciciosAprendizaje.FuncionesJava;

public class Ejercicio_18 {


    public static void main(String[] args) {
        int[][] matriz= new int[4][4];
        llenarMatriz(matriz);
        System.out.println("\n Matriz A \n");
        mostrarMatriz(matriz);
        System.out.println("\n Matriz B \n");
        obtenerTraspuesta(matriz);
    }
    public static void llenarMatriz(int matriz[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void obtenerTraspuesta(int matriz[][]){
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j]=matriz[j][i];
                System.out.print(" " + traspuesta[i][j]);
            }
        System.out.println(" ");
        System.out.println("");
        }
    }
    public static void mostrarMatriz(int matriz[][]){
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matriz[i][j]);
            }
        System.out.println(" ");
        System.out.println("");
        }
    }
}
