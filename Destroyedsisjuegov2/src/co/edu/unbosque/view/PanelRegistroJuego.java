package co.edu.unbosque.view;

import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelRegistroJuego extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextArea txtResultados;
	private JLabel labArchivo;
	
	public PanelRegistroJuego() {
		setLayout(new GridLayout(1,2));
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Archivos");
		border.setTitleColor(Color.black);
		setBorder(border);
		labArchivo= new JLabel("REGISTROS");
		txtResultados= new JTextArea("");
		txtResultados.setForeground(Color.BLACK);
		txtResultados.setBackground(Color.WHITE);
		
	
		add(txtResultados);
		
	}

	public JTextArea getTxtResultados() {
		return txtResultados;
	}

	public void setTxtResultados(JTextArea txtResultados) {
		this.txtResultados = txtResultados;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}