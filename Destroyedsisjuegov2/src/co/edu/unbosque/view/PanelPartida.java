package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

public class PanelPartida extends JLabel {
	private JLabel labJugador;
	
	
	private JLabel labPuntaje;
	private JLabel labPartida;
	private JLabel labJugador1;
	private JLabel labPuntaje1;
	private JLabel labPuntaje2;
	private JLabel labJugador2;
	private JTextField txtNombre;
	private JTextField txtPuntaje;
	private JTextField txtNombre2;
	private JTextField txtPuntaje1;
	private JTextField txtPuntaje2;
	private JTextField txtTipoPartida;
	private JTextField txtJugador1;
	private JTextField txtJugador2;
	private JButton butEscribir;
	private JButton butLeer;
	public static final String ESCRIBIR = "Escribir";
	public static final String LEER = "Leer";
	
	public PanelPartida(Controller control) {
		setLayout(new GridLayout(8,1));
		TitledBorder border = BorderFactory.createTitledBorder("Datos Partida")	;
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		inicializarComponentes(control);
		
	}


	public void inicializarComponentes(Controller control){
		
		
		labPartida = new JLabel("Ingrese el Tipo Partida");
		txtTipoPartida = new JTextField("");
		labJugador= new JLabel("Ingrese Jugador 1");
		labPuntaje = new JLabel("Su puntuaje es");
		txtNombre = new JTextField("");
		txtNombre2 = new JTextField("");
		txtPuntaje1 = new JTextField("");
		labJugador1= new JLabel("Ingrese Jugador 1");
		labJugador2= new JLabel("Ingrese Jugador 2");
		labPuntaje1 = new JLabel("puntuaje jugador 1");
		labPuntaje2 = new JLabel("puntaje jugador 2");
		txtPuntaje2 = new JTextField("");
		butEscribir = new JButton("Escribir");
		butLeer = new JButton("Leer");
		butEscribir.setActionCommand(ESCRIBIR);
		butLeer.setActionCommand(LEER);
		butEscribir.addActionListener(control);
		butLeer.addActionListener(control);
		
		add(labJugador1);
		add(txtNombre);
		add(labJugador2);
		add(txtNombre2);
		add(labPuntaje1);
		add(txtPuntaje1);
		add(labPuntaje2);
		add(txtPuntaje2);
		add(labPartida);
		add(txtTipoPartida);
		add(butEscribir);
		add(butLeer);
		
	}

	
	public JLabel getLabPartida() {
		return labPartida;
	}


	public void setLabPartida(JLabel labPartida) {
		this.labPartida = labPartida;
	}


	public JTextField getTxtTipoPartida() {
		return txtTipoPartida;
	}


	public void setTxtTipoPartida(JTextField txtTipoPartida) {
		this.txtTipoPartida = txtTipoPartida;
	}


	public static String getEscribir() {
		return ESCRIBIR;
	}




	public JLabel getLabJugador() {
		return labJugador;
	}


	public void setLabJugador(JLabel labJugador) {
		this.labJugador = labJugador;
	}


	public JLabel getLabPuntaje() {
		return labPuntaje;
	}


	public void setLabPuntaje(JLabel labPuntaje) {
		this.labPuntaje = labPuntaje;
	}


	public JLabel getLabJugador1() {
		return labJugador1;
	}


	public void setLabJugador1(JLabel labJugador1) {
		this.labJugador1 = labJugador1;
	}


	public JLabel getLabPuntaje1() {
		return labPuntaje1;
	}


	public void setLabPuntaje1(JLabel labPuntaje1) {
		this.labPuntaje1 = labPuntaje1;
	}


	public JLabel getLabPuntaje2() {
		return labPuntaje2;
	}


	public void setLabPuntaje2(JLabel labPuntaje2) {
		this.labPuntaje2 = labPuntaje2;
	}


	public JLabel getLabJugador2() {
		return labJugador2;
	}


	public void setLabJugador2(JLabel labJugador2) {
		this.labJugador2 = labJugador2;
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}


	public void setTxtPuntaje(JTextField txtPuntaje) {
		this.txtPuntaje = txtPuntaje;
	}


	public JTextField getTxtNombre2() {
		return txtNombre2;
	}


	public void setTxtNombre2(JTextField txtNombre2) {
		this.txtNombre2 = txtNombre2;
	}


	public JTextField getTxtPuntaje1() {
		return txtPuntaje1;
	}


	public void setTxtPuntaje1(JTextField txtPuntaje1) {
		this.txtPuntaje1 = txtPuntaje1;
	}


	public JTextField getTxtJugador1() {
		return txtJugador1;
	}


	public void setTxtJugador1(JTextField txtJugador1) {
		this.txtJugador1 = txtJugador1;
	}


	public JTextField getTxtJugador2() {
		return txtJugador2;
	}


	public void setTxtJugador2(JTextField txtJugador2) {
		this.txtJugador2 = txtJugador2;
	}


	public JButton getButEscribir() {
		return butEscribir;
	}


	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}


	public JButton getButLeer() {
		return butLeer;
	}


	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}


	public JTextField getTxtPuntaje2() {
		return txtPuntaje2;
	}


	public static String getLeer() {
		return LEER;
	}


	public void setTxtPuntaje2(JTextField txtPuntaje2) {
		this.txtPuntaje2 = txtPuntaje2;
	}
	
}