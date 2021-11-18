package co.edu.unbosque.model;

import java.io.Serializable;

public class DTOJuego implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String tipo;
	
	
	public DTOJuego(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "DTOJuego [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	

}