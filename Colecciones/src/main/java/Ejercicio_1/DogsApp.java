/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import Ejercicio_1.Services.DogServices;

/**
 *
 * @author bolillo Espartano
 */
public class DogsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DogServices dServices = new DogServices();
        dServices.requestOption();
    }
    
}
