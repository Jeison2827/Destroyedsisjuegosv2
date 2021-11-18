package co.edu.unbosque.controller;

import java.awt.event.*;
import java.util.ArrayList;
import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.DAOJuego;
import co.edu.unbosque.model.DTOJuego;
import co.edu.unbosque.model.DTOJugador;
import co.edu.unbosque.model.DTOPartida;
import co.edu.unbosque.model.persistence.BinariosFile;
import co.edu.unbosque.view.PanelEntrada;
import co.edu.unbosque.view.PanelJugador;
import co.edu.unbosque.view.PanelPartida;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
		
	
	/**
	 * Clases
	 * */
	private ClaseX mClaseFachada;
	
	/**
	 * Vistas
	 */
	private View gui;
	
	/**
	 * Archivos
	 */
	private BinariosFile binarios = new BinariosFile();
	
	
	private static DAOJuego m;
	
	//Variables jugador 1
	private String txtnombre1="";
	private int txtedad1=0;
	private String txtgenero1="";
	private int txtpuntaje1 =0;
	private int txtidentificacion1=0;
	
	// Variables jugador 2
	private String txtnombre2 = "";
	private int txtedad2= 0;
	private String txtgenero2="";
	private int txtpuntaje2=0;
	private int txtidentificacion2=0;
	
	// Variables para pestaña juego
	public String txtNombre ="";
	public String txtTipo="";
	
	
	public String txtTipoPartida="";
	public String mensaje ="";
	

	
	public String datos="";
	
	
	public Controller() {
		mClaseFachada = new ClaseX();
		gui = new View (this);
		gui.setVisible(true);
		m = new DAOJuego();
	}

	
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
			
			case "Partidas":
				gui.setVisible(false);
				gui.getPanelPartidas().setVisible(true);
			break;
			
			
			case "Jugadores":
				gui.setVisible(false);
				gui.getPanelJugadores().setVisible(true);
			break;
			
			
			case "Juego":
				gui.setVisible(false);
				gui.getPanelJuego().setVisible(true);
			break;
			
			
			case PanelJugador.ESCRIBIR:
				guardarDatosJugadores();
			break;
			
			case PanelJugador.LEER:
				leerJugadores();
			break;
			
			
			case "EscribirB":
				guardarDatosJuego();
			break;
			
			case "LeerB":
				leerDatosJuego();
			break;
			
			case PanelPartida.ESCRIBIR:
				guardarArchivoPartida();
			break;
			
			case PanelPartida.LEER:
				leerArchivoPartida();
			break;
		}
		

		//gui.getPanelJugador();
		
		if(e.getActionCommand().equals(PanelPartida.LEER)) {
			
			if(e.getActionCommand().equals(PanelJugador.LEER)) {
			//	//Jugador registro = new Jugador();
				System.out.println( );
				System.out.println( );
				
				String mensajeJugadorUno = binarios.leerArchivoJugador().toString();
				 
				 String mensajeJugadorDos = binarios.leerArchivoJugador().toString();
				 
				 String mensajeCompleto = "J1 => " + mensajeJugadorUno + " | J2 => " + mensajeJugadorDos;
				 gui.getPanelJugadores().getPanelResultados().getTxtResultado().setText(mensajeCompleto);
			
			
		}
		
		
		}
	}
	
	
	/**
	 * Archivo para Jugadores
	 */
	
	private void guardarDatosJugadores() {
		
		//Jugador Uno
		 txtnombre1= gui.getPanelJugadores().getPanelJugador().getTxtNombre().getText();
		 txtedad1= Integer.parseInt(gui.getPanelJugadores().getPanelJugador().getTxtEdad().getText());
		 txtgenero1= gui.getPanelJugadores().getPanelJugador().getTxtGenero().getText();
		 txtpuntaje1= Integer.parseInt(gui.getPanelJugadores().getPanelJugador().getTxtPuntaje().getText());
		 txtidentificacion1 = Integer.parseInt(gui.getPanelJugadores().getPanelJugador().getTxtIdentificacion().getText());
		 
		 //Jugador Dos
		 txtnombre2=gui.getPanelJugadores().getPanelJugador().getTxtNombre2().getText();
		 txtedad2=Integer.parseInt(gui.getPanelJugadores().getPanelJugador().getTxtEdad2().getText());
		 txtgenero2=gui.getPanelJugadores().getPanelJugador().getTxtGenero2().getText();
		 txtpuntaje2=Integer.parseInt(gui.getPanelJugadores().getPanelJugador().getTxtPuntaje2().getText());
		 txtidentificacion2 = Integer.parseInt(gui.getPanelJugadores().getPanelJugador().getTxtIdentificacion2().getText());
		 
		
		 String mensajeJugadorUno = mClaseFachada.setDatosJugadorUno(txtnombre1, txtedad1, txtgenero1, txtpuntaje1, txtidentificacion1).toString() ;
		 String mensajeJugadorDos = mClaseFachada.setDatosJugadorDos(txtnombre2, txtedad2, txtgenero2, txtpuntaje2, txtidentificacion2).toString() ;
		 String mensajeCompleto = "J1 => " + mensajeJugadorUno + " | J2 => " + mensajeJugadorDos;
		 
		 ArrayList<DTOJugador> listJugadores = new ArrayList<>();
		 listJugadores.add(mClaseFachada.getJugador());
		 listJugadores.add(mClaseFachada.getJugadorDos());
		 
		 gui.getPanelJugadores().getPanelResultados().getTxtResultado().setText(mensajeCompleto);
		 
		 if ( binarios.escribirArchivoJugador(listJugadores) ) {
			 gui.mostrarResultados("Se guardaron los datos exitosamente ");
		 }else {
			 gui.mostrarResultados("Error al guardar los datos ");
		 }
		 
		
	}
	
	private void leerJugadores() {

		ArrayList<DTOJugador> listJugadores = binarios.leerArchivoJugador();
		
		String mensajeCompleto = "";
		
		if(listJugadores == null) {
			
			mensajeCompleto = "No existe el archivo";
			
		} else {
			
			if(listJugadores.size() > 0) {
				
				String mensajeJugadorUno = listJugadores.get(0).toString();
				String mensajeJugadorDos = listJugadores.get(1).toString();
				mensajeCompleto = "J1 => " + mensajeJugadorUno + " | J2 => " + mensajeJugadorDos;
				 
			} else {
				
				mensajeCompleto = "No hay datos para leer";
				
			}
			
		}
		
		 gui.getPanelJugadores().getPanelResultados().getTxtResultado().setText(mensajeCompleto);
		
	}
	
	/**
	 * Archivo para Juego
	 */
	private void guardarDatosJuego() {
		
		 txtNombre = gui.getPanelJuego().getPanelE().getTxtNombre().getText();
		 txtTipo = gui.getPanelJuego().getPanelE().getTxtTipo().getText();
		 
		 DTOJuego registroJ =  mClaseFachada.insertarDatosDTOJuego(txtNombre, txtTipo);
		 
		 ArrayList<DTOJuego> listJuego = new ArrayList<>();
		 
		 listJuego.add(registroJ);
		 
		 if ( binarios.escribirArchivoJuego(listJuego) ) {
			 gui.mostrarResultados("Se guardaron los datos exitosamente ");
			 gui.getPanelJuego().getPanelReg().getTxtResultados().setText(registroJ.toString());
		 }else {
			 gui.mostrarResultados("Error al guardar los datos ");
			 gui.getPanelJuego().escribirMensaje("Error al gurdar los datos");
		 }
		 
		 
		 
	}
	
	private void leerDatosJuego() {
		
		ArrayList<DTOJuego> registroJ = binarios.leerArchivoJuego();
		
		String mensajeCompleto = "";
		
		if(registroJ == null) {
			
			mensajeCompleto = "No existe el archivo";
			
		} else {
			
			if(registroJ.size() > 0) {
				
				for( DTOJuego x :  registroJ ) {
					mensajeCompleto += x.toString() + " || ";
				}

			} else {
				mensajeCompleto = "No hay datos para leer";
			}
			
		}
		
		
		gui.getPanelJuego().getPanelReg().getTxtResultados().setText(mensajeCompleto);
	}

	/**
	 * Archivo partida
	 */
	
	private void guardarArchivoPartida() {
		
		 txtTipoPartida = gui.getPanelPartidas().getPanelPartida().getTxtTipoPartida().getText();
		 
		 DTOJugador jugador1 = mClaseFachada.getTipoPartida().getJugador1();
		 jugador1.setNombre(gui.getPanelPartidas().getPanelPartida().getTxtNombre().getText());
		 jugador1.setPuntaje(Integer.parseInt( gui.getPanelPartidas().getPanelPartida().getTxtPuntaje1().getText() ));
		 
		 DTOJugador jugador2 = mClaseFachada.getTipoPartida().getJugador2();
		 jugador2.setNombre(gui.getPanelPartidas().getPanelPartida().getTxtNombre2().getText());
		 jugador2.setPuntaje(Integer.parseInt(gui.getPanelPartidas().getPanelPartida().getTxtPuntaje2().getText()));
		 
		 DTOPartida partida =  mClaseFachada.insertarDatosDTOPartida(txtTipoPartida, jugador1 , jugador2);
		 
		 ArrayList<DTOPartida> listPartida = new ArrayList<>();
		 
		 listPartida.add(partida);
		 
		 if ( binarios.escribirArchivoPartida(listPartida) ) {
			 gui.mostrarResultados("Se guardaron los Resultados Exitosamente");
			 gui.getPanelPartidas().getPanelResultados().getTxtResultado().setText(partida.toString());
		 }else {
			 gui.mostrarResultados("Error al guardar los datos ");
			 gui.getPanelJuego().escribirMensaje("Error al gurdar los datos");
		 }

		
	}
	
	private void leerArchivoPartida() {
		
		ArrayList<DTOPartida> listPartida = binarios.leerArchivoPartida();
		
		String mensajeCompleto = "";
		
		if(listPartida == null) {
			
			mensajeCompleto = "No existe el archivo";
			
		} else {
			
			if(listPartida.size() > 0) {
				
				mensajeCompleto = listPartida.get(0).toString();
				 
			} else {
				
				mensajeCompleto = "No hay datos para leer";
				
			}
			
		}
		
		 gui.getPanelPartidas().getPanelResultados().getTxtResultado().setText(mensajeCompleto);
		
		
	}
	
}
