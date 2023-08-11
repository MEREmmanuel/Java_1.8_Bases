package Ejercicio_3.entidad;

import java.util.List;

public class Alumno {

	private String nombre;
	private List<Integer> listaNotas;
	
	public Alumno() {
	}

	public Alumno(String nombre, List<Integer> listaNotas) {
		this.nombre = nombre;
		this.listaNotas = listaNotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Integer> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Integer> listaNotas) {
		this.listaNotas = listaNotas;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", listaNotas=" + listaNotas + "]";
	}
	
}
