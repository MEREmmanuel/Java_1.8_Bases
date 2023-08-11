/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra_1;

import EjercicioExtra_1.Entidades.Vehiculo;
import EjercicioExtra_1.Servicios.serviciosVehiculo;

/**
 *
 * @author bolillo Espartano
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serviciosVehiculo auto = new serviciosVehiculo();
        serviciosVehiculo moto = new serviciosVehiculo();
        serviciosVehiculo bici = new serviciosVehiculo();

        int[] segundos = new int[4];
        segundos[0] = 5;
        segundos[1] = 10;
        segundos[2] = 60;
        segundos[3] = 60 * 5;

        Vehiculo v1 = auto.crearVehiculo("toyota", "rojo", "2020", "automovil");
        Vehiculo v2 = moto.crearVehiculo("italika", "blaco", "2021", "motocicleta");
        Vehiculo v3 = bici.crearVehiculo("apache", "verde", "2022", "bicicleta");

        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                System.out.println("\nAvance en " + segundos[i] + " Segundos");
                System.out.println(v1.getTipo()+" : " + auto.moverse(v1, segundos[i])
                        + " s");
                System.out.println(v2.getTipo()+" : " + moto.moverse(v2, segundos[i])
                        + " s");
                System.out.println(v3.getTipo()+" : " + bici.moverse(v3, segundos[i])
                        + " s");
            } else {
                System.out.println("\nAvance en " + segundos[i] + " Segundos");
                System.out.println(v1.getTipo()+" avanzó: " + (auto.moverse(v1, segundos[i])+auto.frenar(v1))
                        + " s");
                System.out.println(v2.getTipo()+" avanzó: " + (moto.moverse(v2, segundos[i])+moto.frenar(v2))
                        + " s");
                System.out.println(v1.getTipo()+" avanzó: " + (bici.moverse(v3, segundos[i])+bici.frenar(v3))
                        + " s");
            }
        }

    }

}
