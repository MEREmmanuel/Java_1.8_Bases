/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

import Ejercicio_6.Services.Tienda;

/**
 *
 * @author bolillo Espartano
 */
public class TiendaApp {

    static Tienda tienda = new Tienda();
    
    public static void main(String[] args) {
        tienda.menu();
    }
    
}
