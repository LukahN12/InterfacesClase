package JFrameDialog2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaConfirmacion extends JDialog {
	public VentanaConfirmacion(VentanaDialog ventanaPrincipal, boolean modal) {
		// Establece el JFrame propietario y la modalidad.
		super(ventanaPrincipal, modal);
		setTitle("Diálogo Modal - JDialog");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(300, 150);
		setLocationRelativeTo(ventanaPrincipal);
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		JLabel lblMensaje = new JLabel("Este es un diálogo modal", SwingConstants.CENTER);
		JButton btnCerrar = new JButton("Cerrar");
		// Evento mediante expresión lambda.
		btnCerrar.addActionListener(e -> dispose());
		JPanel panelBotones = new JPanel();
		panelBotones.add(btnCerrar);
		add(lblMensaje, BorderLayout.CENTER);
		add(panelBotones, BorderLayout.SOUTH);
		// ENTER activa el botón Cerrar.
		getRootPane().setDefaultButton(btnCerrar);
	}
}
