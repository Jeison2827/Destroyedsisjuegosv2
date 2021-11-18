package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

public class PanelJugador extends JLabel {
	private JLabel labJugador;
	private JLabel labEdad;
	private JLabel labGenero;
	private JLabel labPuntaje;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtGenero;
	private JTextField txtPuntaje;
	private JLabel labJugador2;
	private JLabel labEdad2;
	private JLabel labGenero2;
	private JLabel labPuntaje2;
	private JTextField txtNombre2;
	private JTextField txtEdad2;
	private JTextField txtGenero2;
	private JTextField txtPuntaje2;
	private JLabel labIdentificacion;
	private JTextField txtIdentificacion;
	private JLabel labIdentificacion2;
	private JTextField txtIdentificacion2;
	private JButton butEscribir;
	private JButton butLeer;
	public static final String ESCRIBIR = "EscribirP";
	public static final String LEER = "LeerP";
	
	public PanelJugador(Controller control) {
		setLayout(new GridLayout (12,10));
		TitledBorder border = BorderFactory.createTitledBorder("Datos Jugador")	;
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		inicializarComponentes(control);
	}


	public void inicializarComponentes(Controller control){
		
		
		labJugador= new JLabel("Ingrese Jugador 1");
		labEdad = new JLabel("Ingrese Edad");
		labGenero = new JLabel("Ingrese genero");
		labPuntaje = new JLabel("Su puntuaje es");
		labIdentificacion = new JLabel("Identificacion Jugador 1");
		txtNombre = new JTextField("");
		txtEdad = new JTextField("");
		txtGenero =new JTextField("");
		txtPuntaje = new JTextField("");
		txtIdentificacion = new JTextField("");
		labJugador2= new JLabel("Ingrese Jugador 2");
		labEdad2 = new JLabel("Ingrese Edad");
		labGenero2 = new JLabel("Ingrese genero");
		labPuntaje2 = new JLabel("Su puntuaje es");
		labIdentificacion2 = new JLabel("Identificacion Jugador 2");
		txtNombre2 = new JTextField("");
		txtEdad2 = new JTextField("");
		txtGenero2 =new JTextField("");
		txtPuntaje2 = new JTextField("");
		txtIdentificacion2= new JTextField("");
		butEscribir = new JButton("Escribir");
		butLeer = new JButton("Leer");
		butEscribir.setActionCommand(ESCRIBIR);
		butLeer.setActionCommand(LEER);
		butEscribir.addActionListener(control);
		butLeer.addActionListener(control);
//		txtNombre.setActionCommand("txtNombre");
//		txtEdad.setActionCommand("txtEdad");
//		txtGenero.setActionCommand("txtGenero");
//		txtPuntaje.setActionCommand("txtPuntaje");
//		txtNombre2.setActionCommand("txtNombre2");
//		txtEdad2.setActionCommand("txtEdad2");
//		txtGenero2.setActionCommand("txtGenero2");
//		txtPuntaje2.setActionCommand("txtPuntaje2");
		
		add(labJugador);
		add(txtNombre);
		add(labEdad);
		add(txtEdad);
		add(labGenero);
		add(txtGenero);
		add(labPuntaje);
		add(txtPuntaje);
		add(labJugador2);
		add(txtNombre2);
		add(labEdad2);
		add(txtEdad2);
		add(labGenero2);
		add(txtGenero2);
		add(labPuntaje2);
		add(txtPuntaje2);
		add(labIdentificacion);
		add(txtIdentificacion);
		add(labIdentificacion2);
		add(txtIdentificacion2);
		add(butEscribir);
		add(butLeer);
		
	}


	public JLabel getLabIdentificacion() {
		return labIdentificacion;
	}


	public void setLabIdentificacion(JLabel labIdentificacion) {
		this.labIdentificacion = labIdentificacion;
	}


	public JTextField getTxtIdentificacion() {
		return txtIdentificacion;
	}


	public void setTxtIdentificacion(JTextField txtIdentificacion) {
		this.txtIdentificacion = txtIdentificacion;
	}


	public JLabel getLabIdentificacion2() {
		return labIdentificacion2;
	}


	public void setLabIdentificacion2(JLabel labIdentificacion2) {
		this.labIdentificacion2 = labIdentificacion2;
	}


	public JTextField getTxtIdentificacion2() {
		return txtIdentificacion2;
	}


	public void setTxtIdentificacion2(JTextField txtIdentificacion2) {
		this.txtIdentificacion2 = txtIdentificacion2;
	}


	public static String getEscribir() {
		return ESCRIBIR;
	}


	public static String getLeer() {
		return LEER;
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


	public JLabel getLabJugador() {
		return labJugador;
	}


	public void setLabJugador(JLabel labJugador) {
		this.labJugador = labJugador;
	}


	public JLabel getLabEdad() {
		return labEdad;
	}


	public void setLabEdad(JLabel labEdad) {
		this.labEdad = labEdad;
	}


	public JLabel getLabGenero() {
		return labGenero;
	}


	public void setLabGenero(JLabel labGenero) {
		this.labGenero = labGenero;
	}


	public JLabel getLabPuntaje() {
		return labPuntaje;
	}


	public void setLabPuntaje(JLabel labPuntaje) {
		this.labPuntaje = labPuntaje;
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtEdad() {
		return txtEdad;
	}


	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}


	public JTextField getTxtGenero() {
		return txtGenero;
	}


	public void setTxtGenero(JTextField txtGenero) {
		this.txtGenero = txtGenero;
	}


	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}


	public void setTxtPuntaje(JTextField txtPuntaje) {
		this.txtPuntaje = txtPuntaje;
	}


	public JLabel getLabJugador2() {
		return labJugador2;
	}


	public void setLabJugador2(JLabel labJugador2) {
		this.labJugador2 = labJugador2;
	}


	public JLabel getLabEdad2() {
		return labEdad2;
	}


	public void setLabEdad2(JLabel labEdad2) {
		this.labEdad2 = labEdad2;
	}


	public JLabel getLabGenero2() {
		return labGenero2;
	}


	public void setLabGenero2(JLabel labGenero2) {
		this.labGenero2 = labGenero2;
	}


	public JLabel getLabPuntaje2() {
		return labPuntaje2;
	}


	public void setLabPuntaje2(JLabel labPuntaje2) {
		this.labPuntaje2 = labPuntaje2;
	}


	public JTextField getTxtNombre2() {
		return txtNombre2;
	}


	public void setTxtNombre2(JTextField txtNombre2) {
		this.txtNombre2 = txtNombre2;
	}


	public JTextField getTxtEdad2() {
		return txtEdad2;
	}


	public void setTxtEdad2(JTextField txtEdad2) {
		this.txtEdad2 = txtEdad2;
	}


	public JTextField getTxtGenero2() {
		return txtGenero2;
	}


	public void setTxtGenero2(JTextField txtGenero2) {
		this.txtGenero2 = txtGenero2;
	}


	public JTextField getTxtPuntaje2() {
		return txtPuntaje2;
	}


	public void setTxtPuntaje2(JTextField txtPuntaje2) {
		this.txtPuntaje2 = txtPuntaje2;
	}
	
}