/*
- Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
- Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
- Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
- Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
- Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
- Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package EjercicioExtra_6.Servicios;

import EjercicioExtra_6.Entidades.Ahorcado;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class ServiciosAhorcado {

    private Ahorcado ahorcado;

    public Ahorcado crearJuego() {
        String palabra = JOptionPane.showInputDialog(null, "Ingrese la palabra: ");
        char[] caracteresPalabra = palabra.toCharArray();
        int jugadasMaximas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de jugadas: "));

        ahorcado = new Ahorcado(caracteresPalabra, 0, jugadasMaximas);

        return ahorcado;
    }

    public int longitud() {
        return ahorcado.getPalabra().length;
    }

    public int buscar(char letra) {
        System.out.println("\nLongitud de la palabra: " + longitud());
        int encontradas = 0;
        char[] palabra = ahorcado.getPalabra();
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (letra == palabra[i]) {
                encontradas++;
            }
        }
        if (encontradas > 0) {
            System.out.println("La letra pertenece a la palabra.");
        } else {
            System.out.println("La letra no pertenece a la palabra.");
        }
        return encontradas;
    }

    public boolean encontradas(char letra) {
        int LetrasEncontradas = buscar(letra);
        ahorcado.setLetrasEcontradas(ahorcado.getLetrasEcontradas() + LetrasEncontradas);
        int faltantes = longitud() - ahorcado.getLetrasEcontradas();
        if (LetrasEncontradas > 0) {
            System.out.println("Número de letras (encontradas, faltantes): "
                    + "" + "(" + ahorcado.getLetrasEcontradas() + "," + faltantes + ")");
            return true;
        } else {
            System.out.println("Número de letras (encontradas, faltantes): "
                    + "" + "(" + ahorcado.getLetrasEcontradas() + "," + faltantes + ")");
            return false;
        }
    }

    public int intentos(char letra) {
        if (!encontradas(letra)) {
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas() - 1);;
        }
        System.out.println("Número de oportunidades restantes: " + ahorcado.getJugadasMaximas());

        return ahorcado.getJugadasMaximas();
    }

    public void juego() {
        int contador = 0;
        Set<Character> caracteresIngresados = new HashSet<>();

        do {
            String input = JOptionPane.showInputDialog("Ingrese un carácter:");
            char character = input.charAt(0);

            if (caracteresIngresados.contains(character)) {
                JOptionPane.showMessageDialog(null, "¡El carácter ya ha sido ingresado! Ingrese otro carácter.");
            } else {
                caracteresIngresados.add(character);
                contador = intentos(character);
            }
        } while (contador != 0 && ahorcado.getLetrasEcontradas() != longitud());

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Se ha quedado sin intentos.");
        } else {
            JOptionPane.showMessageDialog(null, "¡Felicidades, ha ganado!");
        }
    }
}
