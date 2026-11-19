package JOptionsPanel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelShowMessageDialog extends JPanel{
public PanelShowMessageDialog() {
// static void showMessageDialog(Component parentComponent, Object message)
// al ser static son métodos de clase podemos implementarlos directamente con la clase
JOptionPane.showMessageDialog(null, "Operacion Realizada Correctamente - 2 Argumentos");
JOptionPane.showMessageDialog(null, "Mensaje ERROR_MESSAGE", "Mensaje en la barra de título",
JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null, "Mensaje INFORMATION_MESSAGE", "Mensaje en la barra de título",
JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Mensaje WARNING_MESSAGE", "Mensaje en la barra de título",
JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog(null, "Mensaje QUESTION_MESSAGE", "Mensaje en la barra de título",
JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "Mensaje PLAIN_MESSAGE", "Mensaje en la barra de título",
JOptionPane.PLAIN_MESSAGE);
MiIcon icon = new MiIcon();
JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo",
JOptionPane.DEFAULT_OPTION, icon);
}
} 