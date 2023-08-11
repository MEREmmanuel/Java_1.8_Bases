/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsejer5.service;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author USER
 */
public class PaiseService {

    private TreeSet<String> paises = new TreeSet<>();

    public void agregarPais(String pais) {
        paises.add(pais);
    }

    public void mostrar() {
        paises.forEach((e) -> System.out.println(e));
    }

    public void eliminar(String o) {
        Iterator<String> it = paises.iterator();

        while (it.hasNext())
        {
            if (it.next().equals(o))
            {
                it.remove();
            }
        }

    }
}
