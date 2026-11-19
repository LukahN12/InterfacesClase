package JFrameDialog;

import javax.swing.SwingUtilities;

import JFrameDialog2.VentanaDialog;

public class main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			VentanaDialog ventana = new VentanaDialog();
			 ventana.setVisible(true);
			 });
	}

}
