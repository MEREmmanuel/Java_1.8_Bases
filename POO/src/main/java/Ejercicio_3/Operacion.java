/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero 2"));
    }
    
    public int sumar(){
        int suma;
        suma = numero1 + numero2;
        return suma;
    }
    
    public int restar(){
        int resta;
        resta = numero1+numero2;
        return resta;
    }
    
    public int multiplicar(){
        int producto;
        
        while (numero2<=0) {
            numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero 2"));
        }
        producto=numero1*numero2;
        
        return producto;
    }
    
    public double dividir(){
        double dividir;
        
        while (numero2<=0) {
            numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero 2"));
        }
        dividir = ((double)numero1/(double)numero2);
        
        return dividir;
    }
}
