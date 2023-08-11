package javacollectionsejer5;

import java.util.Scanner;
import javacollectionsejer5.service.PaiseService;

public class JavaCollectionsEjer5 {

    /*
    Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
    conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    los servicios en la clase correspondiente)
    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    cómo se ordena un conjunto.
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    al usuario.
     */
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        PaiseService ps = new PaiseService();

        while (true)
        {
            System.out.println("Ingrese un país");
            String p = leer.next();
            ps.agregarPais(p);
            System.out.println("desea continuar 's' ");
            if (!leer.next().equals("s"))
            {
                break;
            }
        }
        System.out.println("Lista completa");
        ps.mostrar();
        
        ps.eliminar("Peru");
        
        System.out.println("eliminar");
        ps.mostrar();
    }

}
