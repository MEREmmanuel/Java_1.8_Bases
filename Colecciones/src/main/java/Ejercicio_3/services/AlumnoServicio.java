package Ejercicio_3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ejercicio_3.entidad.Alumno;

public class AlumnoServicio {

    private List<Alumno> listaAlumnos = new ArrayList<Alumno>();

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void crearAlumno() {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        do {
            List<Integer> listaNotas = new ArrayList<>();
            System.out.println("Vamos a crear un alumno, para ello necesitamos su nombre y sus 3 notas");
            System.out.println("Ingrese el nombre del alumno");
            String nombre = sc.next();
            int[] notas = new int[3];
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                notas[i] = sc.nextInt();
                listaNotas.add(notas[i]);
            }
            Alumno alumno = new Alumno(nombre, listaNotas);
            listaAlumnos.add(alumno);
            System.out.println("Desea crear otro alumno? (S/N)");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("S"));
        System.out.println(listaAlumnos);
    }

    public void notaFinal(Alumno alumno) {
        int contador = 0;
        int sumatoria = 0;
        for (Integer nota : alumno.getListaNotas()) {
            sumatoria += nota;
            contador += 1;
        }
        double promedio = sumatoria / contador;

        System.out.println("El promedio final de las notas de este alumno es: " + promedio);
    }
}
