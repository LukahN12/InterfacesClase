package primeraVentana;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class OtraForma {

	public static void main(String[] args) {
		
		
		JFrame miOtraVentanaFrame = new JFrame("Otra forma de crear ventana");
		
		miOtraVentanaFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		miOtraVentanaFrame.setBounds(50, 50, 700, 500);
		
		miOtraVentanaFrame.setVisible(true);
	}

}
