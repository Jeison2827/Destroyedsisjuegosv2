package co.edu.unbosque.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.DTOJuego;
import co.edu.unbosque.model.DTOJugador;
import co.edu.unbosque.model.DTOPartida;

import javax.swing.*;

public class View extends JFrame{
	
	private static final long serialVersionUID=1L;
	private PanelJugadores panelJugadores;
	private PanelJuego panelJuego;
	private PanelPartidas panelPartidas;
	JButton b1,b2,b3,b4;
	
	public View(Controller control) {
		setSize(500,400);
		setResizable(true);
		setTitle("Categoria");
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2,2 )); 
		panelJuego = new PanelJuego(control);
		panelPartidas = new PanelPartidas(control);
		panelJugadores = new PanelJugadores(control);
		b1 = new JButton("Jugadores");
		b1.setActionCommand("Jugadores");
		b1.addActionListener(control);
		b2 = new JButton("Juego");
		b2.setActionCommand("Juego");
		b2.addActionListener(control);
		b3 = new JButton("Partidas");
		b3.setActionCommand("Partidas");
		b3.addActionListener(control);
		b4 = new JButton("Torneos");
		b4.setActionCommand("Torneos");
		b4.addActionListener(control);
	    add(b1);
	    add(b2);
	    add(b3);
	    add(b4);
	}
	public void imprimirNomina(ArrayList < DTOJugador >  ArrayDTO ) 
	{
		for(DTOJugador regnomina: ArrayDTO ) 
		{
			System.out.println("Nombre :" + regnomina.getNombre());
			System.out.println("Edad :" + regnomina.getEdad());
			System.out.println("Genero :" + regnomina.getGenero());
			System.out.println("Puntaje :" + regnomina.getPuntaje());
		}
	}
	public void imprimirNominaJ(ArrayList < DTOJuego >  ArrayDTO ) 
	{
		for(DTOJuego regnomina: ArrayDTO ) 
		{
			System.out.println("Nombre :" + regnomina.getNombre());
			System.out.println("Edad :" + regnomina.getTipo());

		}
	}
	public void imprimirNominaP(ArrayList < DTOPartida>  ArrayDTO ) 
	{
		for(DTOPartida regnomina: ArrayDTO ) 
		{

		}
	}
	public void mostrarResultados(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato);
	}

	public PanelPartidas getPanelPartidas() {
		return panelPartidas;
	}
	
	public void setPanelPartidas(PanelPartidas panelPartidas) {
		this.panelPartidas = panelPartidas;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public JButton getB1() {
		return b1;
	}
	public void setB1(JButton b1) {
		this.b1 = b1;
	}
	public JButton getB2() {
		return b2;
	}
	public void setB2(JButton b2) {
		this.b2 = b2;
	}
	public JButton getB3() {
		return b3;
	}
	public void setB3(JButton b3) {
		this.b3 = b3;
	}
	public JButton getB4() {
		return b4;
	}
	public void setB4(JButton b4) {
		this.b4 = b4;
	}
	public PanelJuego getPanelJuego() {
		return panelJuego;
	}
	public void setPanelJuego(PanelJuego panelJuego) {
		this.panelJuego = panelJuego;
	}
	public PanelJugadores getPanelJugadores() {
		return panelJugadores;
	}
	public void setPanelJugadores(PanelJugadores panelJugadores) {
		this.panelJugadores = panelJugadores;
	}
	

 
	
	
}