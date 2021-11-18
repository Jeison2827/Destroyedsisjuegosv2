package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class PanelPartidas extends JFrame {
	
	private static final long serialVersionUID=1L;
	private PanelPartida panelPartida;
	private PanelResultados panelResultados;


	
	public PanelPartidas(Controller control) {
		
		setSize(500,400);
		setResizable(false);
		setTitle("titulo de la Ventana Principal MVC");
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	    setLayout(new GridLayout());
		
	
	    panelPartida= new PanelPartida(control);
	    panelResultados = new PanelResultados();
		
		
		add(panelPartida);
		add(panelResultados);
		
	}


	
	public PanelResultados getPanelResultados() {
		return panelResultados;
	}



	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}



	public PanelPartida getPanelPartida() {
		return panelPartida;
	}



	public void setPanelPartida(PanelPartida panelPartida) {
		this.panelPartida = panelPartida;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}