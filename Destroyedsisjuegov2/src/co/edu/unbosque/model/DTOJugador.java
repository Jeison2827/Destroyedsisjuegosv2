package co.edu.unbosque.model;

import java.io.Serializable;

public class DTOJugador implements Serializable {
	
	private String nombre;
	private int edad;
	private String genero;
	private double puntaje;
	private int identificacion;

	public DTOJugador() {
		
		nombre = "";
		edad = 0;
		genero = "";
		puntaje = 0;
		identificacion =0;
	}

	
	public DTOJugador( String pNombre , int pEdad, String pGenero, double pPuntaje, int pIdentificacion ) {
		nombre = pNombre;
		edad = pEdad;
		genero = pGenero;
		puntaje = pPuntaje;
		identificacion = pIdentificacion;
	}
	

	@Override
	public String toString() {
		return "DTOJugador [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", puntaje=" + puntaje
				+ ", identificacion=" + identificacion + "]";
	}



	public int getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public void setTodosLosDatos( String pNombre , int pEdad, String pGenero, double pPuntaje, int pIdentificacion ) {
		nombre = pNombre;
		edad = pEdad;
		genero = pGenero;
		puntaje = pPuntaje;
		identificacion = pIdentificacion;
	}
	
}