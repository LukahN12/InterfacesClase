package componentesAtomicosEventos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerDateModel;
import javax.swing.text.MaskFormatter;

public class Panel extends JLabel implements ActionListener{
	
	private JButton button1;
	private JButton button2;
	private JCheckBox check1;
	private JCheckBox check2;
	private JCheckBox check3;
	private JCheckBox check4;
	private JRadioButton radio1;
	private JRadioButton radio2;
	private JRadioButton radio3;
	private JToggleButton toggle1;
	private JTextField ciudadTextField;
	private JComboBox combo;
	private JLabel ciudad;
	private JProgressBar progress;
	private JPasswordField contraseña;
	
	public Panel() {
		this.setLayout(null);
		Color fondoColor = new Color(239,216,215);
		this.setOpaque(true);
		JLabel tituloJLabel = new JLabel();
		tituloJLabel.setText("Componentes atomicos e iniciación de JLabel");
		tituloJLabel.setFont(new Font("ComicSansMS",Font.BOLD,12));
		this.setBounds(50,50,200,100);
		Color tituloColor = new Color(191,22,59);
		this.setForeground(Color.red);
		
		button1 = new JButton();
		button1.setText("Saludo");
		button1.setBounds(400,400,60,60);
		button1.addActionListener(this);
		
		button2 = new JButton();
		button2.setText("Adios");
		button2.setBounds(300,300,60,60);
		button2.addActionListener(this);
		
		
		// CHECKBOX
		check1 = new JCheckBox("chekcbox1");
		check2 = new JCheckBox("chekcbox2");
		check3 = new JCheckBox("chekcbox3");
		check4 = new JCheckBox("chekcbox4");
		
		check1.setBounds(10,30,10,10);
		check2.setBounds(10,100,80,23);
		check3.setBounds(10,150,80,23);
		
		// RadioButtons
		
		radio1 = new JRadioButton("radio1");
		radio2 = new JRadioButton("radio2");
		radio3 = new JRadioButton("radio3");
		
		radio1.setBounds(100,30,80,23);
		radio2.setBounds(100,100,80,23);
		radio3.setBounds(100,150,80,23);
		
		// toggle
		
		toggle1 = new JToggleButton("Toggle1");
		toggle1.setSelected(true);
		toggle1.setBounds(190,20,20,20);
		
		// combo
		
		String[] opciones= {"Opción1", "Op2", "Op3", "Op4", "Op5"};
		combo = new JComboBox<String>(opciones);
		combo.setBounds(260, 10, 50, 20);
		combo.setSelectedItem("Op2");
		
		// Spinner 
		
		JSpinner spinner = new JSpinner(new SpinnerDateModel());
		spinner.setBounds(350, 10, 150, 40);
		spinner.addChangeListener(null);
		
		ImageIcon imagenIcon2=new ImageIcon(getClass().getResource("recursos/imagen1.jpg"));
		JButton boton=new JButton("Logotipo", imagenIcon2);
		boton.setText("Hola");
		boton.setBounds(350,200, 80, 23);

		// ciudad = new JLabel("Ciudad(&c");
		// ciudadTextField.setBounds(100,100,100,100);
		
		// contraseña.setBounds(200,200,50,50);
		
		MaskFormatter mascara;
		JFormattedTextField textoFormateado;
		try {
			mascara = new MaskFormatter("AAA");
			mascara.setPlaceholder(".");
			textoFormateado = new JFormattedTextField(mascara);
			textoFormateado.setFocusLostBehavior(JFormattedTextField.PERSIST);
		} catch (ParseException e) {
			throw new IllegalStateException("Máscara de código postal incorrecta", e);
		}
		textoFormateado.setBounds(200,10,60,60);
		
		JTextArea comentarios = new JTextArea(5,200);
		comentarios.setBounds(getVisibleRect());

		
		this.add(button1);
		this.add(button2);
		this.add(tituloJLabel);
		this.add(check1);
		this.add(check2);
		this.add(radio1);
		this.add(radio2);
		this.add(radio3);
		this.add(combo);
		this.add(spinner);
		this.add(boton);
		// this.add(ciudad);
		// this.add(ciudadTextField);
		// this.add(contraseña);
		this.add(textoFormateado);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			JOptionPane.showMessageDialog(this,"Soy un boton");
		} else if (e.getSource() == button2) {
			String salida = " ";
			salida = validaSalida();
			JOptionPane.showMessageDialog(this,salida);
		}
		
	}
	
	private String validaSalida() {
		String cad = "Seleccionado: \n";
		if(check1.isSelected()){
			cad="check1\n";
		}
		if(check2.isSelected()){
			cad="check2\n";
		}
		if(check3.isSelected()){
			cad="check3\n";
		}
		if(check4.isSelected()){
			cad="check4\n";
		}
		if(radio1.isSelected()){
			cad="radio1\n";
		}
		if(radio2.isSelected()){
			cad="radio2\n";
		}
		if(toggle1.isSelected()){
			cad="toggleButton Activado\n";
		} else {
			cad="toggleButton Desactivado\n";
		}
			cad += combo.getSelectedItem()+"\n";
		
		return cad;
	}
}
