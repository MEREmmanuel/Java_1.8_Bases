/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4.Servicios;
import Ejercicio_4.Entidades.Rectangulo;
import javax.swing.JOptionPane;
/**
 *
 * @author bolillo Espartano
 */
public class RectanguloServicios {
    public Rectangulo crearRectangulo(){
        double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Altura: "));
        return new Rectangulo(base, altura);
    }
    
    public double calcularArea(Rectangulo m){
        double area;        
        area = m.getAltura()*m.getBase();
        JOptionPane.showMessageDialog(null,"Area: "+area);
        return area;
    }
    
    public double calcularPerimetro(Rectangulo m){
        double perimetro;       
        perimetro = (m.getBase()+m.getAltura())*2;
        JOptionPane.showMessageDialog(null,"Perimetro: "+perimetro);
        return perimetro;
    }
    
    public void dibujarRectangulo(Rectangulo m){
        for (int i = 0; i < m.getBase() ; i++) {
            for (int j = 0; j < m.getAltura(); j++) {
                System.out.print(" " + "*");
            }
        System.out.println(" ");
        System.out.println("");
        }
    }
}
