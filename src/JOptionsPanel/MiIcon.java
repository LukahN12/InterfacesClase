package JOptionsPanel;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class MiIcon implements Icon{
public int getIconHeight() {
// TODO Auto-generated method stub
return 37;
}
public int getIconWidth() {
// TODO Auto-generated method stub
return 50;
}
public void paintIcon(Component c, Graphics g, int x, int y) {
try {
Image imagen = ImageIO.read(getClass().getResource("../recursos/lapiz.png"));
g.drawImage(imagen, x, y, c);
} catch (IOException e) {
JOptionPane.showMessageDialog(c, "Imagen No Encontrada", "Atención",
JOptionPane.WARNING_MESSAGE);
}
}
}