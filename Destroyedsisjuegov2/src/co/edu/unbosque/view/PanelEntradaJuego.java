package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

public class PanelEntradaJuego extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labNombre;
	private JTextField txtNombre;
	private JLabel labTipo;
	private JTextField txtTipo;
	private JButton butLeerB; 
	private JButton butEscribirB;

	public PanelEntradaJuego(Controller control) {
		setLayout(new GridLayout (4,4));
		TitledBorder border = BorderFactory.createTitledBorder("Datos Juego");
		border.setTitleColor(Color.black);
		setBorder(border);
		labNombre= new JLabel("Nombre del juego");
		labTipo= new JLabel("Tipo de juego");
		txtNombre= new JTextField("");
		txtTipo= new JTextField("");
		butLeerB= new JButton("Leer");
		butLeerB.setActionCommand("LeerB");
		butLeerB.addActionListener(control);
		butEscribirB= new JButton("Escribir");
		butEscribirB.setActionCommand("EscribirB");
		butEscribirB.addActionListener(control);
		
		add(labNombre);
		add(txtNombre);
		add(labTipo);
		add(txtTipo);
		add(butEscribirB);
		add(butLeerB);
		
		
	}

	public JLabel getLabNombre() {
		return labNombre;
	}

	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}

	public JLabel getLabTipo() {
		return labTipo;
	}

	public void setLabTipo(JLabel labTipo) {
		this.labTipo = labTipo;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}

	public JButton getButLeerB() {
		return butLeerB;
	}

	public void setButLeerB(JButton butLeerB) {
		this.butLeerB = butLeerB;
	}

	public JButton getButEscribirB() {
		return butEscribirB;
	}

	public void setButEscribirB(JButton butEscribirB) {
		this.butEscribirB = butEscribirB;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
	
}