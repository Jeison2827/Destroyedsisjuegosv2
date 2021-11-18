package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class PanelJuego extends JFrame {
	
	private static final long serialVersionUID=1L;
	private PanelEntradaJuego panelE;
	private PanelRegistroJuego panelReg;


	
	public PanelJuego(Controller control) {
		
		setSize(500,400);
		setResizable(false);
		setTitle("Panel juego");
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	    setLayout(new BorderLayout());
		
	
		panelE =new PanelEntradaJuego(control);
		
		panelReg= new PanelRegistroJuego();
		
		
		add(panelReg,BorderLayout.CENTER);
		add(panelE, BorderLayout.NORTH);
		
	}

	public PanelEntradaJuego getPanelE() {
		return panelE;
	}


	public void setPanelE(PanelEntradaJuego panelE) {
		this.panelE = panelE;
	}


	public PanelRegistroJuego getPanelReg() {
		return panelReg;
	}


	public void setPanelReg(PanelRegistroJuego panelReg) {
		this.panelReg = panelReg;
	}
	
	public void escribirMensaje(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	


}