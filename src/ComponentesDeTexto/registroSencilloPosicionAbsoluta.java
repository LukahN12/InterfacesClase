package ComponentesDeTexto;

	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.event.FocusAdapter;
	import java.awt.event.FocusEvent;
	import java.util.Arrays;
	import java.text.ParseException;
	import javax.swing.*;
	import javax.swing.text.MaskFormatter;
	/** Registro sencillo: etiquetas con atajos y validación al salir del campo. */
public class registroSencilloPosicionAbsoluta extends JFrame {
	  private final JTextField nombre = new JTextField(20);
	    private final JTextField correo = new JTextField(20);
	    private final JPasswordField clave = new JPasswordField(20);
	    private final JFormattedTextField codigoPostal = crearCodigoPostal();
	    public registroSencilloPosicionAbsoluta() {
	        super("Registro sencillo con posiciones absolutas");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JPanel panel = new JPanel();
	        panel.setLayout(null); // Los controles se colocan con setBounds(x, y, ancho, alto).
	        panel.setPreferredSize(new Dimension(500, 270));
	        setContentPane(panel);
	        agregarCampo(panel, "Nombre (&N):", 'N', nombre, 25);
	        agregarCampo(panel, "Correo (&C):", 'C', correo, 70);
	        agregarCampo(panel, "Contraseña (&P):", 'P', clave, 115);
	        agregarCampo(panel, "Código postal (&D):", 'D', codigoPostal, 160);
	        nombre.setToolTipText("El nombre es obligatorio.");
	        correo.setToolTipText("Ejemplo: ana@correo.es");
	        clave.setToolTipText("Escribe al menos 6 caracteres. Usa una contraseña de prueba.");
	        codigoPostal.setToolTipText("Escribe los 5 dígitos del código postal.");
	        JButton registrar = new JButton("Registrarse (&R)");
	        registrar.setMnemonic('R');
	        registrar.addActionListener(e -> {
	            // Evaluamos todos los campos, aunque alguno sea incorrecto.
	            boolean nombreCorrecto = validar(nombre);
	            boolean correoCorrecto = validar(correo);
	            boolean claveCorrecta = validar(clave);
	            boolean codigoCorrecto = validar(codigoPostal);
	            JOptionPane.showMessageDialog(this,
	                    nombreCorrecto && correoCorrecto && claveCorrecta && codigoCorrecto
	                            ? "Registro comprobado. Este ejemplo no guarda datos."
	                            : "Revisa los campos rojos. Pasa el ratón para ver la ayuda.");
	        });
	        registrar.setBounds(210, 210, 250, 30);
	        panel.add(registrar);
	        pack();
	        setResizable(false);
	        setLocationRelativeTo(null);
	}
private static JFormattedTextField crearCodigoPostal() {
	  try {
	        // Cada # admite un dígito. Los huecos pendientes se muestran con _.
	        MaskFormatter mascara = new MaskFormatter("#####");
	        mascara.setPlaceholderCharacter('_');
	        JFormattedTextField campo = new JFormattedTextField(mascara);
	        // Conserva lo escrito aunque la máscara esté incompleta al salir.
	        campo.setFocusLostBehavior(JFormattedTextField.PERSIST);
	        return campo;
	    } catch (ParseException e) {
	        throw new IllegalStateException("Máscara de código postal incorrecta", e);
	    }
	}
	private void agregarCampo(JPanel panel, String texto, char atajo, JTextField campo, int y) {
	    JLabel etiqueta = new JLabel(texto);
	    etiqueta.setDisplayedMnemonic(atajo);
	    etiqueta.setLabelFor(campo); // Alt + letra lleva al campo.
	    etiqueta.setBounds(20, y, 180, 30);
	    campo.setBounds(210, y, 250, 30);
	    panel.add(etiqueta);
	    panel.add(campo);
	    campo.addFocusListener(new FocusAdapter() {
	        @Override
	        public void focusLost(FocusEvent e) {
	            if (!e.isTemporary()) validar(campo);
	        }
	    });
	}
	private boolean validar(JTextField campo) {
	    boolean correcto;
	    if (campo == nombre) {
	        correcto = !nombre.getText().trim().isEmpty();
	    } else if (campo == correo) {
	        // Comprobación básica para este ejemplo de clase.
	        correcto = correo.getText().trim().matches("[^\\s@]+@[^\\s@]+\\.[^\\s@]+");
	    } else if (campo == codigoPostal) {
		correcto = codigoPostal.getText().matches("[0-9]{5}");
		 } else {
		char[] caracteres = clave.getPassword();
		correcto = caracteres.length >= 6;
		        Arrays.fill(caracteres, '\0');
		 }
		         campo.setBorder(BorderFactory.createLineBorder(
		        correcto ? new Color(0, 128, 0) : Color.RED, 2));
		        return correcto;
		 }
		public static void main(String[] args) {
		    SwingUtilities.invokeLater(() -> new
		            registroSencilloPosicionAbsoluta().setVisible(true));
	 }
	}
