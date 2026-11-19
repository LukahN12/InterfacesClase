package Swing_p04_MeleroGarciaLucas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	private PanelSimpleBoxLayoutBox psboxlbox;
public Ventana(){
	
	super("Ventana sobre la que aplicamos Layouts");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// Tamaños recomendados
	this.setMinimumSize(new Dimension(400, 300));

	psboxlbox = new PanelSimpleBoxLayoutBox();
	psboxlbox.setBorder(BorderFactory.createTitledBorder("PanelSimpleBoxLayoutBox"));
	this.add(psboxlbox);
	
	setLocationRelativeTo(null);
	this.setVisible(true);
	}
}
