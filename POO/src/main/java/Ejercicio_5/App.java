/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

import Ejercicio_5.Entidades.Cuenta;
import Ejercicio_5.Servicios.CuentaServicios;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaServicios cue = new CuentaServicios();
        Cuenta c1 = cue.crearCuenta();
        System.out.println(c1.getSaldoActual());
        cue.ingresar(c1);
        System.out.println(c1.getSaldoActual());
        cue.retirar(c1);
        System.out.println(c1.getSaldoActual());
    }
    
}
