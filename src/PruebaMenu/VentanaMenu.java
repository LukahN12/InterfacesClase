package PruebaMenu;

import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class VentanaMenu extends JFrame{
	private JMenuBar barraMenu;
	private JMenu archivo,edicion,herramientas,opciones;
	private JMenuItem itemNuevo,itemAbrir,itemGuardar,itemGuardarComo,itemSalir,itemCortar,itemCopiar,itemPegar,itemOpcion1,itemOpcion2,itemGeneralesItem;
	public VentanaMenu() {
			
		super("Prueba Vetana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(500,400));
		this.setLocationRelativeTo(null);
		this.iniciarMenu();
		
		
		this.pack();
		this.setVisible(true);
	}
	
	private void iniciarMenu() {
		barraMenu = new JMenuBar();
		archivo = new JMenu("Archivo");
		edicion = new JMenu("Edicion");
		herramientas = new JMenu("Herramientas");
		opciones = new JMenu("Opciones");
	
	//items
		
		itemNuevo = new JMenuItem("Nuevo");
		itemAbrir = new JMenuItem("Abrir");
		itemGuardar = new JMenuItem("Guardar");
		itemGuardarComo = new JMenuItem("Guardar como");
		itemSalir = new JMenuItem("Salir");
		itemCortar = new JMenuItem("Cortar");
		itemCopiar = new JMenuItem("Copiar");
		itemPegar = new JMenuItem("Pegar");
		itemOpcion1 = new JMenuItem("Opcion 1");
		itemOpcion2 = new JMenuItem("Opcion 2");
		itemGeneralesItem = new JMenuItem("Generales");
		
		
		archivo.setMnemonic(KeyEvent.VK_A);
		herramientas.setMnemonic(KeyEvent.VK_H   );
		edicion.setMnemonic(KeyEvent.VK_E);
		
		// aceleradores
		
		itemNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		itemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
		itemGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
		itemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,InputEvent.ALT_DOWN_MASK));
		itemGuardarComo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		
		//añadimos
		
		barraMenu.add(archivo);
		barraMenu.add(edicion);
		barraMenu.add(herramientas);
		
		//añadimos los items a sus respectivos menus
		
		archivo.add(itemNuevo);
		archivo.add(itemAbrir);  
		archivo.add(itemSalir);
		archivo.add(itemGuardar);
		archivo.add(itemGuardarComo);
		archivo.add(itemSalir);
		
		edicion.add(itemCortar);
		edicion.add(itemPegar);
		edicion.add(itemCopiar);
		edicion.addSeparator();
		edicion.add(opciones);
		
		herramientas.add(itemGeneralesItem);
	
		opciones.add(itemOpcion1);
		opciones.add(itemOpcion2);
		
		
		itemAbrir.addActionListener(e -> abrirArchivoNativo());
		 itemGuardarComo.addActionListener( e -> guardarComoNativo() );
		itemSalir.addActionListener(e -> this.dispose());
		
		//añadimos la barra al JFrame
		
		this.setJMenuBar(barraMenu);
	}
	
	private void abrirArchivo() {
		JFileChooser selector = new JFileChooser();
		selector.setDialogTitle("Abrir archivo");
		int resultado = selector.showOpenDialog(this);
		if (resultado == JFileChooser.APPROVE_OPTION) {
			File archivo = selector.getSelectedFile();
			System.out.println("Archivo seleccionado: " + archivo.getAbsolutePath());
		}
	}

	private void guardarComo() {
		JFileChooser selector = new JFileChooser();
		selector.setDialogTitle("Guardar como...");
		selector.setSelectedFile(new File("documento.txt"));
		int resultado = selector.showSaveDialog(this);
		if (resultado == JFileChooser.APPROVE_OPTION) {
			File archivo = selector.getSelectedFile();
			System.out.println("Guardar como: " + archivo.getAbsolutePath());
		}
	}
	
	private void abrirArchivoNativo() {
		FileDialog dialogo = new FileDialog(this, "Abrir archivo", FileDialog.LOAD);
		dialogo.setVisible(true);
		if (dialogo.getFile() != null) {
		File archivo = new File(dialogo.getDirectory(), dialogo.getFile());
		System.out.println("Archivo seleccionado: " + archivo.getAbsolutePath());
		}
		}
		// Diálogo nativo para guardar un archivo
		private void guardarComoNativo() {
		FileDialog dialogo = new FileDialog(this, "Guardar como...", FileDialog.SAVE);
		dialogo.setFile("documento.txt");
		dialogo.setVisible(true);
		if (dialogo.getFile() != null) {
		File archivo = new File(dialogo.getDirectory(), dialogo.getFile());
		System.out.println("Guardar como: " + archivo.getAbsolutePath());
		}
		}
}
