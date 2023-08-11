/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5.Servicios;

import Ejercicio_5.Entidades.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class CuentaServicios {
    public Cuenta crearCuenta(){
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de cuenta: "));
        long DNI = Long.parseLong(JOptionPane.showInputDialog(null,"DNI: "));
        int saldoActual = Integer.parseInt(JOptionPane.showInputDialog(null,"Saldo actual: "));
       return new Cuenta(numeroCuenta,DNI, saldoActual);
    }
    
    public double ingresar(Cuenta c){
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad a ingresar"));
        c.setSaldoActual((int) (c.getSaldoActual()+cantidad));
        return c.getSaldoActual();
    }
    
    public double retirar(Cuenta c){
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad a retirar"));
        if (c.getSaldoActual()>cantidad) {
            c.setSaldoActual((int) (c.getSaldoActual()-cantidad));
        }
        else{
            c.setSaldoActual(0);
        }        
        return c.getSaldoActual();
    }
}
