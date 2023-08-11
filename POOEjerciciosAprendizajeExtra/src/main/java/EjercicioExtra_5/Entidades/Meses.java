/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9].
 */
package EjercicioExtra_5.Entidades;

import java.util.Arrays;

/**
 *
 * @author bolillo Espartano
 */
public class Meses {

    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "octubre", "novembre", "diciembre"};
    private String mesSecreto = mes[2];

    public Meses() {
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    @Override
    public String toString() {
        return "Meses{" + "mes=" + Arrays.toString(mes) + ", mesSecreto=" + mesSecreto + '}';
    }

}
