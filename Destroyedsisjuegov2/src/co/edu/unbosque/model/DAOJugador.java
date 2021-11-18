package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class DAOJugador {
	private ArrayList <DTOJugador> ArrayDto;
	private BinariosFile Archivosjugador;
	
	public DAOJugador() {
		ArrayDto= new ArrayList<DTOJugador>();
		Archivosjugador = new BinariosFile();
	}
	
	public DTOJugador buscarJugador(int identificacion) {
		ArrayDto = Archivosjugador.leerArchivoJugador ();
		for(DTOJugador jugador : ArrayDto) {
			if(jugador.getIdentificacion()==(identificacion)) {
				return jugador;
			}
			
		}
		return null;
	}
	public void agregarEmpleado(DTOJugador jugador){//Operación C - CRUD
		ArrayDto = Archivosjugador.leerArchivoJugador();
		ArrayDto.add(jugador);
		Archivosjugador. escribirArchivoJugador (ArrayDto);
		
	}
	
	public ArrayList<DTOJugador> getArrayDto() {
		return ArrayDto;
	}

	public void setArrayDto(ArrayList<DTOJugador> arrayDto) {
		ArrayDto = arrayDto;
	}

	public BinariosFile getArchivosjugador() {
		return Archivosjugador;
	}

	public void setArchivosjugador(BinariosFile archivosjugador) {
		Archivosjugador = archivosjugador;
	}

}