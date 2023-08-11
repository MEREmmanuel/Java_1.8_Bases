/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra_1.Entidades;


/**
 *
 * @author bolillo Espartano
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String anho;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String anho, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
