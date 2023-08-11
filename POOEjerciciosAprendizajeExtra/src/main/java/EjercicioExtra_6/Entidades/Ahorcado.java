/*
Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario.
 */
package EjercicioExtra_6.Entidades;

import java.util.Arrays;

/**
 *
 * @author bolillo Espartano
 */
public class Ahorcado {
    private char[] palabra;
    private int letrasEcontradas;
    private int jugadasMaximas;

    public Ahorcado(char[] palabra, int letrasEcontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.letrasEcontradas = letrasEcontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public Ahorcado() {
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEcontradas() {
        return letrasEcontradas;
    }

    public void setLetrasEcontradas(int letrasEcontradas) {
        this.letrasEcontradas = letrasEcontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", letrasEcontradas=" + letrasEcontradas + ", jugadasMaximas=" + jugadasMaximas + '}';
    }
    
}
