/*
Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
package EjercicioExtra_2.Servicios;

import EjercicioExtra_2.Entidades.Puntos;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class ServiciosPuntos {

    private Puntos puntos;

    public Puntos crearPuntos() {
        double x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese X del punto 1"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Y del punto 1"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese X del punto 2"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Y del punto 2"));
        puntos = new Puntos(x1, y1, x2, y2);
        return puntos;
    }

    public double devolverDistancia() {
        return Math.round(Math.sqrt(Math.pow(puntos.getX2() - puntos.getX1(), 2) + Math.pow(puntos.getY2() - puntos.getY1(), 2)));
    }
    
    public void mostrarPuntos(){
        JOptionPane.showMessageDialog(null, "Para los puntos:\n"
                + "A( "+puntos.getX1()+" : "+puntos.getY1()+" )\n"
                        + "B( "+puntos.getX2()+" : "+puntos.getY2()+" )\n"
                                + "\nLa distancia corresponde a:\n"
                                + devolverDistancia());
    }
}
