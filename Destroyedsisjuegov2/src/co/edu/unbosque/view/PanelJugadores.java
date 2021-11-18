package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class PanelJugadores extends JFrame {
	
	private static final long serialVersionUID=1L;
	private PanelJugador panelJugador;
	private PanelResultados panelResultados;


	
	public PanelJugadores(Controller control) {
		
		setSize(500,400);
		setResizable(false);
		setTitle("titulo de la Ventana Principal MVC");
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	    setLayout(new GridLayout());
		
	
	    panelJugador= new PanelJugador(control);
		panelResultados = new PanelResultados();
		
		
		add(panelJugador);
		add(panelResultados);
		
	}



	public PanelJugador getPanelJugador() {
		return panelJugador;
	}



	public void setPanelJugador(PanelJugador panelJugador) {
		this.panelJugador = panelJugador;
	}



	public PanelResultados getPanelResultados() {
		return panelResultados;
	}



	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}