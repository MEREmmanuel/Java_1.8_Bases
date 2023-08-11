package Data;

import Entidades.Alquiler;
import java.time.LocalDate;

public class ListaAlquiler {

    public static final Alquiler[] listaAlquileres
            = {
                new Alquiler(ListaPeliculas.listaPeliculas[0], LocalDate.now(), LocalDate.now().plusDays(5), 10),
                new Alquiler(ListaPeliculas.listaPeliculas[2], LocalDate.now(), LocalDate.now().plusDays(7), 10),
                new Alquiler(ListaPeliculas.listaPeliculas[4], LocalDate.now(), LocalDate.now().plusDays(3), 10)
            };
    public static final int maxListaAlquiler = 3;
    public static final int precio = 10;
}
