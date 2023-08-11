/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;
import Ejercicio_4.Entidades.Rectangulo;
import Ejercicio_4.Servicios.RectanguloServicios;
/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicios rec = new RectanguloServicios();
        Rectangulo r1 = rec.crearRectangulo();
        //System.out.println("Base: "+r1.getBase()+ " Altura : "+r1.getAltura());
        System.out.println("Area -> " + rec.calcularArea(r1));
        System.out.println("Perimetro -> " + rec.calcularPerimetro(r1));
        rec.dibujarRectangulo(r1);        
        System.out.println(r1.toString());
    }
}
