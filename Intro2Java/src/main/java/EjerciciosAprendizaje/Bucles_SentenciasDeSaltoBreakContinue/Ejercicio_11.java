package EjerciciosAprendizaje.Bucles_SentenciasDeSaltoBreakContinue;
import javax.swing.JOptionPane;
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        num1 = pedirNumeros();
        num2 = pedirNumeros();
        
        menu(num1,num2);
    }
    
    public static int menu(int num1, int num2){
        int opcion=0;
        
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menú. \n"
                + "1. Sumar \n"
                + "2. Restar \n"
                + "3. Multiplicar \n"
                + "4. Dividir \n"
                + "5. Salir \n"
                + "Elija una opción:"));
        realizarCasos(opcion, num1, num2);
        }while(opcion != 5);
        return opcion;
    }
    
    public static int pedirNumeros(){
        int num = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero"));
        return num;
    }
    
    public static void realizarCasos(int opcion, int num1,int num2){
        switch(opcion) {
        case 1:
          JOptionPane.showMessageDialog(null, "La suma es: " + (num1+num2));
          break;
        case 2:
          JOptionPane.showMessageDialog(null, "La resta es: " + (num1-num2));
          break;
        case 3:
          JOptionPane.showMessageDialog(null, "El producto es: " + (num1*num2));
          break;
        case 4:
          double a = num1;
          double b = num2;
          JOptionPane.showMessageDialog(null, "El cociente es: " + (a/b));
          break;
        case 5:
            int result = JOptionPane.showConfirmDialog(null, 
            "Estás seguro de salir?",null, JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }else{
                menu(num1,num2);
            }
          break;
        default:
          JOptionPane.showMessageDialog(null, "Esta opción no es válida");
      }
    }
}
