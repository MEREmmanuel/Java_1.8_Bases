/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
        this.radio = radio;
    }
    
    public double area(){
        double A;
        A = Math.PI * Math.pow(radio,2);
        
        return A;
    }
    
    public double perimetro(){
        double P;
        P = Math.PI * radio * 2;
        
        return P;
    }
}
