/*

 */
package EjercicioExtra_5;

import EjercicioExtra_5.Entidades.Meses;
import EjercicioExtra_5.Servicios.ServiciosMeses;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosMeses metodosMeses = new ServiciosMeses();
        
        Meses claseMeses = metodosMeses.crearMeses();
        
        metodosMeses.resultado();
    }
    
}
