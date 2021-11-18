package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.DTOJuego;
import co.edu.unbosque.model.DTOJugador;
import co.edu.unbosque.model.DTOPartida;


public class BinariosFile {
	
	
	private String nombreArchivoJugadores = "./data/jugadores.dat";
	private String nombreArchivoPartida = "./data/partida.dat";
	private String nombreArchivoJuego = "./data/juego.dat";

	private File fi;
	

	public  boolean  escribirArchivoJugador ( ArrayList < DTOJugador >  ArrayDTO ) {
		
		File file = new File(nombreArchivoJugadores) ;
			
		try {
			
			FileOutputStream fos = new FileOutputStream(file);
			
			ObjectOutputStream salida =  new  ObjectOutputStream ( fos );
			salida.writeObject(ArrayDTO);
			salida.close();
			fos.close();
		} catch ( IOException e) {
			e.printStackTrace();
			return false ;
		}
		return  true ;
	}
	
	
	public  ArrayList < DTOJugador >  leerArchivoJugador () {
		ArrayList < DTOJugador > archivojugador =  null ;
		try {
			ObjectInputStream in =  new  ObjectInputStream ( new FileInputStream (nombreArchivoJugadores));
			archivojugador = ( ArrayList < DTOJugador > ) in.readObject ();
			in.close();
		} catch ( IOException  |  ClassNotFoundException e) {
		
			return  null ;
		}
		return archivojugador;
	}
	
	
	public  boolean  escribirArchivoPartida ( ArrayList < DTOPartida >  ArrayDTO ) {
		
		File file = new File(nombreArchivoPartida) ;
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			
			ObjectOutputStream salida =  new  ObjectOutputStream ( fos );
			salida.writeObject(ArrayDTO);
			salida.close();
			fos.close();
		} catch ( IOException e) {
			
			return false ;
		}
		return  true ;
	}
	
	public  ArrayList < DTOPartida >  leerArchivoPartida () {
		ArrayList < DTOPartida > archivoPartida =  null ;
		try {
			ObjectInputStream in =  new  ObjectInputStream ( new FileInputStream (nombreArchivoPartida));
			archivoPartida = ( ArrayList < DTOPartida > ) in.readObject ();
			in.close();
		} catch ( IOException  |  ClassNotFoundException e) {
		
			return  null ;
		}
		return archivoPartida;
	}
	public  boolean  escribirArchivoJuego (  ArrayList < DTOJuego > ArrayDTOJ ) {
		try {
			ObjectOutputStream salida =  new  ObjectOutputStream ( new  FileOutputStream (nombreArchivoJuego));
			salida.writeObject(ArrayDTOJ);
			salida.close();
		} catch ( IOException e) {
			
			return false ;
		}
		return  true ;
	}
	public  ArrayList < DTOJuego >  leerArchivoJuego () {
		ArrayList < DTOJuego > ArrayDTOJ =  null ;
		try {
			ObjectInputStream in =  new  ObjectInputStream ( new FileInputStream (nombreArchivoJuego));
			ArrayDTOJ = (ArrayList < DTOJuego > ) in.readObject ();
			in.close();
		} catch ( IOException  |  ClassNotFoundException e) {
		
			return  null ;
		}
		return ArrayDTOJ;
	}
	public String getNombreArchivoJugador() {
		return nombreArchivoJugadores;
	}
	public void setNombreArchivoJugador(String nombreArchivoJugador) {
		this.nombreArchivoJugadores = nombreArchivoJugador;
	}

}


