package VentanaCerrada;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ventana extends JFrame {
	public Ventana() {
		super("Ventana Cerrada");
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
//		this.setBounds(50, 50, 700, 500);

		Toolkit miPantallaToolkit = Toolkit.getDefaultToolkit();
		
		Dimension proporcionScreen = miPantallaToolkit.getScreenSize();
		
//		System.out.println(proporcionScreen);
		
		int ScreenHeight = proporcionScreen.height;
		
		int ScreenWidht = proporcionScreen.width;
		
//		this.setSize(ScreenWidht, ScreenHeight);
		
		this.setVisible(true);
	}
}
