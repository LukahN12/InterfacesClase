package primeraVentana;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana(){
		
		super("Otra forma de ponere nombre a la ventana");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		this.setSize(800, 500);
//		this.setLocation(150, 200);
		
		
		// Los dos de arriba en 1 comando
		this.setBounds(50, 50, 700, 500);
		
		//Activa o desactiva la pantalla completa
		this.setResizable(false);
		
		//Determina si la ventana se abre maximizada
		this.setExtendedState(MAXIMIZED_BOTH);
		
//		this.setTitle("Mi primera ventana en Swing");
		
		// la visibilidad siempre lo ultimo
		this.setVisible(true);
	}
}
