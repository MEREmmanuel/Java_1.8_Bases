/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8.Servicios;

import Ejercicio_8.Entidades.Cadena;

/**
 *
 * @author bolillo Espartano
 */
public class cadenaServicios {

    public Cadena crearCadena() {

        return new Cadena();
    }

    public boolean esVocal(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }

    public int mostrarVocales(Cadena c) {
        int vocales = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            char letraActual = c.getFrase().charAt(i);
            if (esVocal(letraActual)) {
                vocales++;
            }
        }
        return vocales;
    }

    public StringBuilder invertirFrase(Cadena c) {
        StringBuilder fraseInvertida = new StringBuilder(c.getFrase());
        fraseInvertida.reverse();
        return fraseInvertida;
    }

    public int vecesRepetido(Cadena c, char caracter) {
        int contarCaracter = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            if (caracter == c.getFrase().charAt(i)) {
                contarCaracter++;
            }
        }

        return contarCaracter;
    }

    public boolean compararLongitud(Cadena c, String cadena) {
        return c.getLongitud() == cadena.length();
    }

    public String unirFrases(Cadena c, String cadena) {
        return c.getFrase().concat(cadena);
    }

    public String reemplazar(Cadena c, char caracter) {
        return c.getFrase().replace('a', caracter);
    }

    public boolean contiene(Cadena c, char caracter) {
        int posicion = c.getFrase().indexOf(caracter);
        return posicion != -1;
    }
}
