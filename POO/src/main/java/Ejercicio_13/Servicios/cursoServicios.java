/*
- Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.

- Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos.

- Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Ejercicio_13.Servicios;

import Ejercicio_13.Entidades.Curso;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class cursoServicios {

    private Curso curso;

    public Curso crearCurso() {
    String nombreCurso = JOptionPane.showInputDialog(null,"¿Cuál es el nombre del curso?");
    int cantidadHorasPorDia = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántas horas dura el curso al día?"));
    int cantidadDiasPorSemana = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántos días está disponible a la semana?"));
    boolean turno;
    int result = JOptionPane.showConfirmDialog(null, 
            "¿El horario del curso es matutino?",null, JOptionPane.YES_NO_OPTION);
    turno = result == JOptionPane.YES_OPTION;
    double precioPorHora = Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cuál es el costo en $ del curso por hora?"));
    String[] alumnos = cargarAlumnos();
    return curso = new Curso (nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora,alumnos) ;
}

public String[] cargarAlumnos(){
        String[] nombresAlumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            nombresAlumnos[i] = JOptionPane.showInputDialog(null,"Ingrese el nombre del alumno "+(i+1)+": ");
        }
        
        return nombresAlumnos;
    }

public double calcularGananciaSemanal(){
    double gananciaSemanal;
    gananciaSemanal = curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getAlumnos().length*curso.getCantidadDiasPorSemana();
    return gananciaSemanal;
}
}
