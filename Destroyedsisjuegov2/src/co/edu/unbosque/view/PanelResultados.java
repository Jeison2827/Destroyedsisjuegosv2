package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
  private static final long serialVersionUID =1L;
  private JLabel labResultado;
  private JTextField txtResultado;
  
  public PanelResultados () {
	 
	  setLayout (new GridLayout (2,1));
	  TitledBorder border = BorderFactory.createTitledBorder("Resultados");
	  border.setTitleColor(Color.BLACK);
	  setBorder(border);
	  labResultado = new JLabel("El Resultado es :");
	  txtResultado = new JTextField ("");
	  txtResultado.setForeground(Color.BLACK);
	  txtResultado.setBackground(Color.WHITE);
	  
	  add(labResultado);
	  add(txtResultado);
	  
  }

public JLabel getLabResultado() {
	return labResultado;
}

public void setLabResultado(JLabel labResultado) {
	this.labResultado = labResultado;
}

public JTextField getTxtResultado() {
	return txtResultado;
}

public void setTxtResultado(JTextField txtResultado) {
	this.txtResultado = txtResultado;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
  
}
