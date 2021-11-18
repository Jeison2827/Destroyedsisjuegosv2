package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.BinariosFile;

public class ClaseX {
	
	/***
	 * Jugador
	 */
	private DTOJugador jugador;
	
	private DTOJugador jugadorDos;
	
	/**
	 * Juego
	 */
	private DTOJuego pesta�aJuego;
	
	/**
	 * Partida
	 */
	private DTOPartida pesta�aPartida;
	
	private BinariosFile bf;
	
	private DAOJuego j;
	
	
	public ClaseX() {
		
		jugador = new DTOJugador();
		
		jugadorDos = new DTOJugador();
		
		pesta�aJuego = new DTOJuego("","");
		
		pesta�aPartida = new DTOPartida();
		
		bf= new BinariosFile();
	}
	
	/**
	 * ==========================================
	 *			METODOS JUGADOR
	 *	=========================================
	 */
	
	
	/**
	 * Almacenar variables para jugador 1
	 * @param nombre
	 * @param edad
	 * @param genero
	 * @param puntaje
	 * @param txtidentificacion1
	 * @return
	 */
	public DTOJugador setDatosJugadorUno( String nombre , int edad, String genero, double puntaje, int txtidentificacion1 ) {
		
		jugador.setTodosLosDatos(nombre, edad, genero, puntaje, txtidentificacion1);

		return this.jugador;
	}
	
	/**
	 * Almacenar variables para jugador 2
	 * @param nombre
	 * @param edad
	 * @param genero
	 * @param puntaje
	 * @param txtidentificacion2
	 * @return
	 */
	public DTOJugador setDatosJugadorDos( String nombre , int edad, String genero, double puntaje, int txtidentificacion2 ) {
		
		jugadorDos.setTodosLosDatos(nombre, edad, genero, puntaje, txtidentificacion2);

		return this.jugadorDos;
	}

	
	/**
	 * =========================
	 * GETTER Y SETTER DTOJugador
	 * =========================
	 */
	public DTOJugador getJugador() {
		return jugador;
	}


	public DTOJugador getJugadorDos() {
		return jugadorDos;
	}
	
	
	/**
	 * =========================
	 * GETTER Y SETTER DTOjuego
	 * =========================
	 */
	
	public DTOJuego getPesta�aJuego() {
		return pesta�aJuego;
	}

	public DTOJuego insertarDatosDTOJuego( String pNombre, String pTipo ) {
		
		this.pesta�aJuego.setNombre(pNombre);
		this.pesta�aJuego.setTipo(pTipo);
		
		return getPesta�aJuego();
	}
	
	/**
	 * =========================
	 * GETTER Y SETTER DTOjuego
	 * =========================
	 */
	
	public DTOPartida getTipoPartida() {
		return pesta�aPartida;
	}

	
	public DTOPartida insertarDatosDTOPartida( String pTipoPartida, DTOJugador pJugador1, DTOJugador pJugador2 ) {
		
		this.pesta�aPartida.setTipoPartida(pTipoPartida);
		this.pesta�aPartida.setJugador1(pJugador1);
		this.pesta�aPartida.setJugador2(pJugador2);
		
		return getTipoPartida();
	}
	
	
	
	
	
	public void setJugador(DTOJugador jugador) {
		this.jugador = jugador;
	}

	
	
	
	public void setJugadorDos(DTOJugador jugadorDos) {
		this.jugadorDos = jugadorDos;
	}



	public BinariosFile getBf() {
		return bf;
	}

	public void setBf(BinariosFile bf) {
		this.bf = bf;
	}

	public DAOJuego getJ() {
		return j;
	}

	public void setJ(DAOJuego j) {
		this.j = j;
	}
	
	
	
	

	
}
