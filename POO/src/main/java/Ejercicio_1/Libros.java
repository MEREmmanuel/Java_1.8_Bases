/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class Libros {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;
    
    public Libros() {
    }

    public Libros(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    public void pedirDatos(){
        ISBN=(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese ISBN")));
        titulo=JOptionPane.showInputDialog(null, "Ingrese el titulo");
        autor=JOptionPane.showInputDialog(null, "Ingrese el autor");
        numPag=(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cuántas páginas tiene")));
    }
    
    @Override
    public String toString() {
        return "Libros{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
    
}
