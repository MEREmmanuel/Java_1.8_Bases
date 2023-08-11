/*
El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto.
 */
package EjercicioExtra_5.Servicios;

import EjercicioExtra_5.Entidades.Meses;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class ServiciosMeses {

    private Meses meses;

    public Meses crearMeses() {
        meses = new Meses();
        return meses;
    }

    public String ingresarMes() {
        String mes = JOptionPane.showInputDialog(null, "Adivine el mes secreto.\n"
                + "Introduzca el nombre del mes en minúsculas: ");
        return mes;
    }
    
    public boolean validarMes(){
        String mesIngresado = ingresarMes();
        return mesIngresado == null ? meses.getMesSecreto() == null : mesIngresado.equals(meses.getMesSecreto());
    }
    
    public void resultado(){
        boolean validacion = validarMes();
        if (validacion) {
            int input = JOptionPane.showConfirmDialog(null, 
                "Ha acertado el mes secreto: "+meses.getMesSecreto(), "Felicidades!", JOptionPane.DEFAULT_OPTION);
        }
        else{
            JOptionPane.showMessageDialog(null, "No lo ha logrado.");
            resultado();
        }
    }
}
