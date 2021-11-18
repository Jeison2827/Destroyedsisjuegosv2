package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class DAOPartida {
	private ArrayList <DTOPartida> ArrayDtoP;
	private BinariosFile ArchivosPartida;
	
	public DAOPartida() {
		ArrayDtoP= new ArrayList<DTOPartida>();
		ArchivosPartida = new BinariosFile();
	}
	public void agregarEmpleado(DTOPartida Partida){//Operación C - CRUD
		ArrayDtoP = ArchivosPartida.leerArchivoPartida();
		ArrayDtoP.add(Partida);
		ArchivosPartida. escribirArchivoPartida (ArrayDtoP);
		
	}
	
	public ArrayList<DTOPartida> getArrayDto() {
		return ArrayDtoP;
	}

	public void setArrayDto(ArrayList<DTOPartida> arrayDto) {
		ArrayDtoP = arrayDto;
	}

	public BinariosFile getArchivosPartida() {
		return ArchivosPartida;
	}

	public void setArchivosPartida(BinariosFile archivosPartida) {
		ArchivosPartida = archivosPartida;
	}

}
