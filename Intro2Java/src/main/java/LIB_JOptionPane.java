/*
 */
import javax.swing.JOptionPane;
/**
 */
public class LIB_JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el int"));
        long num2 = Long.parseLong(JOptionPane.showInputDialog(null,"Ingresa el long")); ;
        double num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el double"));;
        float num4 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa el float"));;
        String palabra = JOptionPane.showInputDialog(null,"Ingresa el String");
        
        JOptionPane.showMessageDialog(null, "int " + num1);
        JOptionPane.showMessageDialog(null, "long " + num2);
        JOptionPane.showMessageDialog(null, "double " + num3);
        JOptionPane.showMessageDialog(null, "float " + num4);
        JOptionPane.showMessageDialog(null, "String " + palabra);
    }
    
}
