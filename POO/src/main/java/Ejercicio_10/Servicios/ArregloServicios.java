/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10.Servicios;

import Ejercicio_10.Entidades.Arreglo;
import java.util.Arrays;
/**
 *
 * @author bolillo Espartano
 */
public class ArregloServicios {
    public Arreglo crearArreglo(int dimension){
        double[] vector = new double[dimension];
        return new Arreglo(vector);
    }
    
    public double[] iniciarArreglo(Arreglo a){
        double[] vector = new double[a.getVector().length];
        for (int i = 0; i < vector.length; i++) {
            vector[i] =  (Math.random()*50 + 1);
        }
        a.setVector(vector);
        
        return a.getVector();
    }
    
    public double[] ordenarArreglo(Arreglo a){
        double[] vector;
        vector = a.getVector();
        
        Arrays.sort(vector);
        a.setVector(vector);
        
        return a.getVector();
    }
    
    public double[] ArregloB(Arreglo a, Arreglo b){
        double[] subVector = Arrays.copyOfRange(a.getVector(), 0, 10);
        double[] vector = new double[20];
        Arrays.fill(vector, 10, 20, 0.5);
        
        for (int i = 0; i < 10; i++) {
            vector[i] = subVector[i];
        }
        b.setVector(vector);
        
        return b.getVector();
    }
}
