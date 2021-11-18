package co.edu.unbosque.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

/**
 * Clase corresponde al Modelo del MVCZ
 *
 */

public class DAOJuego {

	private ArrayList<DTOJuego> ArrayDTOJ;
	private BinariosFile archivoJuego;

	public DAOJuego() {
		ArrayDTOJ = new ArrayList<DTOJuego>();
		archivoJuego = new BinariosFile();
	}
	
	public DTOJuego buscarJuego(String nombre) {
		ArrayDTOJ= archivoJuego.leerArchivoJuego();
		for(DTOJuego juego : ArrayDTOJ) {
			if(juego.getNombre().equals(nombre)) {
				return juego;
			}
		}
		return null;
	}
	
	public void agregarJuego(DTOJuego juego){
		ArrayDTOJ = archivoJuego.leerArchivoJuego();
		ArrayDTOJ.add(juego);
		archivoJuego.escribirArchivoJuego(ArrayDTOJ);
	}

	
	public ArrayList<DTOJuego> getArrayDTOJ() {
		return ArrayDTOJ;
	}

	public void setArrayDTOJ(ArrayList<DTOJuego> arrayDTOJ) {
		ArrayDTOJ = arrayDTOJ;
	}

	public BinariosFile getArchivoJuego() {
		return archivoJuego;
	}

	public void setArchivoJuego(BinariosFile archivoJuego) {
		this.archivoJuego = archivoJuego;
	}

	
}