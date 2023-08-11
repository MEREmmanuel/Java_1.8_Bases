/*
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
Después borra objetos de la Lista, el Conjunto y el Mapa.
 */
package Ejercicio_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/**
 *
 * @author bolillo Espartano
 */
public class App {
    public static void main(String[] args) {
        //Listas:
        ArrayList<Integer> numerosA = new ArrayList<>();
        //Conjuntos:
        HashSet<Integer> numerosB = new HashSet();
        //Mapas:
        HashMap<Integer, String> alumnos = new HashMap();

        //Llenamos 5 objetos en listas, conjuntos y mapas.
        for (int i = 0; i < 5; i++) {
            numerosA.add(i + 1);
            numerosB.add(i + 6);
            alumnos.put(i, "Alumno " + (i + 1));
        }
        
        System.out.println("---AÑADIMOS 5 ELEMENTOS---\n");
        System.out.println("Lista.\n");
        for (Integer numeros : numerosA) {
            System.out.println(numeros);
        }
        System.out.println("\nConjunto.\n");
        for (Integer numeros : numerosB) {
            System.out.println(numeros);
        }
        System.out.println("\nMapa.\n");
        for (Map.Entry<Integer,String> entry: alumnos.entrySet()) {
            System.out.println("Llave: "+entry.getKey()+" Nombre: "+entry.getValue());
        }
        
        //Borramos objetos de las listas, conjuntos y mapas.
        numerosA.remove(0);//Borramos la posicion 0 del ArrayList numerosA
        Integer cinco = 5;
        numerosA.remove(cinco);//Borramos el elemento que contenga el valor 5 (no la posicion 5) de numerosA
        
        numerosB.remove(cinco+1);//Borramos el elemento que contenga el valor 6 (no la posicion 6) de numerosB
        
        alumnos.remove(cinco-1);//Borramos el elemento con la llave 4 del HashMap
        
        System.out.println("\n---BORRAMOS ELEMENTOS---\n");
        System.out.println("Lista.\n");
        numerosA.forEach(numeros -> {
            System.out.println(numeros);
        });
        System.out.println("\nConjunto.\n");
        numerosB.forEach(numeros -> {
            System.out.println(numeros);
        });
        System.out.println("\nMapa.\n");
        alumnos.entrySet().forEach(entry -> {
            System.out.println("Llave: "+entry.getKey()+" Nombre: "+entry.getValue());
        });
    }
}
