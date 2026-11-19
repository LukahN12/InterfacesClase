package JFrameDialog;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaDialog extends JFrame {
	private JPanel miPanel;
	private JButton miBoton;

	public VentanaDialog() {
		super("Ventana Principal - JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 250);
		setLocationRelativeTo(null);
		iniciarComponentes();
	}

	private void iniciarComponentes() {

		miPanel = new JPanel();
		miBoton = new JButton("Abrir diálogo modal");
		// Evento mediante expresión lambda.
		miBoton.addActionListener(e -> {
			VentanaConfirmacion dialogo = new VentanaConfirmacion(this, true);
			dialogo.setVisible(true);
		});
		miPanel.add(miBoton);
		add(miPanel);

	}
}
