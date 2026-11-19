package componentesAtomicosEventos;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana() {
		super("Ventana sobre la que insertamos JOptionPane-Paneles de opción");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 600, 450);
		
		Panel miPanel = new Panel();
		this.add(miPanel);
		this.setVisible(true);
	}
}
