/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra_1.Servicios;

import EjercicioExtra_1.Entidades.Vehiculo;

/**
 *
 * @author bolillo Espartano
 */
public class serviciosVehiculo {

    public Vehiculo crearVehiculo(String marca,String modelo, String anho, String tipo){
        
        return new Vehiculo(marca,modelo,anho,tipo);
    }

    public double moverse(Vehiculo v, int segundos) {
        double metros;
        if ("automovil".equals(v.getTipo())) {
            metros = segundos*3;
        }
        else if ("motocicleta".equals(v.getTipo())){
            metros = segundos*2;
        }
        else{
            metros = segundos*1;
        }
        
        return metros;
    }

    public double frenar(Vehiculo v) {
        double metros;
        if ("automovil".equals(v.getTipo())) {
            metros = 2;
        }
        else if ("motocicleta".equals(v.getTipo())){
            metros = 2;
        }
        else{
            metros = 0;
        }
        return metros;
    }
}
