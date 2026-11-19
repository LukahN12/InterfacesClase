package JOptionsPanel;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ventana extends JFrame{
	
	private PanelShowMessageDialog psmd;
//	private PanelShowImputDialog psid;
//	private PanelShowConfirmDialog pscd;
//	private PanelShowOptionDialog psod;
	
	public Ventana() {
		super("Ventana sobre la que insertamos JOptionPane-Paneles de opción");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 600, 450);
		psmd = new PanelShowMessageDialog();
		this.add(psmd);
//		psid = new PanelShowImputDialog();
//		this.add(psid);
//		pscd = new PanelShowConfirmDialog();
//		this.add(pscd);
//		psod = new PanelShowOptionDialog();
//		this.add(psod);
		 this.setVisible(true);
	}

}
