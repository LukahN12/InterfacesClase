package JFrameDialog2;

import javax.swing.SwingUtilities;

public class main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			VentanaDialog ventana = new VentanaDialog();
			 ventana.setVisible(true);
			 });
	}

}
