package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import models.AuthModel;

public class AuthView extends JFrame{

	public AuthView() {
	}


public void  login() {
	JFrame ventana = new JFrame();
	
	//this.setVisible(true);
	ventana.setSize(1000, 1000);
	ventana.setLocationRelativeTo(null);

	ventana.setTitle("Login");

	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ventana.setMaximumSize(new Dimension(800, 800));
	ventana.setMinimumSize(new Dimension(300, 300));

	ventana.setResizable(true);

	/*ImageIcon user = new ImageIcon(
			"C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\user.png");
	Image img = user.getImage();
	Image imgScaled = img.getScaledInstance(25, 35, Image.SCALE_SMOOTH);
	ImageIcon imgIcon = new ImageIcon(imgScaled);*/
	

	JPanel panel = new JPanel();
	
	panel.setBackground(Color.PINK);
	panel.setOpaque(true);
	panel.setSize(1000, 1000);
	panel.setLocation(0, 0);
	panel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 10));

	panel.setLayout(null);
	
	JLabel fondo = new JLabel();
	//fondo.setIcon(imgIcon);
	fondo.setBounds(290, 155, 200, 200);        
	fondo.setOpaque(false);
	ventana.add(fondo);

	/*ImageIcon contra = new ImageIcon(
			"C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\contra2.png");
	Image imgContra = contra.getImage();
	Image imgScaledContra = imgContra.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
	ImageIcon imgIconContra = new ImageIcon(imgScaledContra);*/

	JLabel contra1 = new JLabel();
	//contra1.setIcon(imgIconContra);
	contra1.setBounds(290, 275, 200, 200);
	contra1.setOpaque(false);
	panel.add(contra1);

	/*ImageIcon flecha = new ImageIcon(
			"C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\flecha.png");
	Image imgflecha = flecha.getImage();
	Image scaledFlecha = imgflecha.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	ImageIcon imgIconFlecha = new ImageIcon(scaledFlecha);*/

	JLabel flecha1 = new JLabel();
	//flecha1.setIcon(imgIconFlecha);
	flecha1.setBounds(570, 425, 200, 200);
	flecha1.setOpaque(false);
	panel.add(flecha1);

	/*
	 * ImageIcon fondo1 = new
	 * ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\fondologin.jpg"
	 * ); Image imgfondo1=fondo1.getImage(); Image
	 * saledFondo=imgfondo1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	 * ImageIcon iconFondo = new ImageIcon(saledFondo)
	 * 
	 * JLabel fondo2 = new JLabel(); fondo2.setIcon(iconFondo); fondo2.setBounds(0,
	 * 0, 100, 100); fondo2.setOpaque(false); panel.add(fondo2);
	 */

	 // Poder colocar las cosas donde nosotros queramos

	JLabel titulo = new JLabel("Bienvenidos");
	titulo.setSize(400, 80);
	// titulo.setOpaque(true);
	// titulo.setBackground(Color.WHITE);
	titulo.setLocation(290, 30);
	titulo.setHorizontalAlignment(JLabel.CENTER);
	titulo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
	titulo.setFont(new Font("Broadway", Font.BOLD, 50));
	panel.add(titulo);

	JLabel correo = new JLabel("Ingrese su correo");
	correo.setSize(200, 30);
	correo.setLocation(390, 200);
	correo.setFont(new Font("Broadway", Font.BOLD, 20));
	correo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
	panel.add(correo);

	JTextField escribeCorreo = new JTextField();
	escribeCorreo.setSize(350, 30);
	escribeCorreo.setLocation(315, 240);
	escribeCorreo.setFont(new Font("Broadway", Font.BOLD, 15));
	panel.add(escribeCorreo);

	JLabel contraseña = new JLabel("Ingrese su contraseña");
	contraseña.setSize(255, 30);
	contraseña.setLocation(360, 320);
	contraseña.setFont(new Font("Broadway", Font.BOLD, 20));
	contraseña.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
	panel.add(contraseña);

	JPasswordField ecribeContraseña = new JPasswordField();
	ecribeContraseña.setSize(350, 30);
	ecribeContraseña.setLocation(315, 360);
	ecribeContraseña.setFont(new Font("Broadway", Font.BOLD, 20));
	panel.add(ecribeContraseña);

	JLabel olvido = new JLabel("¿Olvido su contraseña?");
	olvido.setSize(250, 30);
	olvido.setLocation(420, 390);
	olvido.setHorizontalAlignment(JLabel.RIGHT);
	olvido.setFont(new Font("Broadway", Font.BOLD, 13));
	panel.add(olvido);

	// olvido.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

	JCheckBox recordar = new JCheckBox("Recordarme");
	recordar.setSize(200, 30);
	recordar.setLocation(310, 390);
	recordar.setOpaque(false);
	recordar.setHorizontalAlignment(JLabel.LEFT);
	recordar.setFont(new Font("Broadway", Font.BOLD, 13));
	panel.add(recordar);

	JButton acceder = new JButton();
	acceder.setText("Acceder");
	acceder.setOpaque(true);
	acceder.setBackground(Color.CYAN);
	acceder.setBounds(390, 500, 200, 50);
	acceder.setFont(new Font("Broadway", Font.BOLD, 30));

	acceder.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			Boolean flag1 = false, flag2 = false;

			if (escribeCorreo.getText().equals("")) {
				escribeCorreo.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
			} else {
				escribeCorreo.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				flag1 = true;
			}
			String pass = new String(ecribeContraseña.getPassword());
			if (pass.equals("")) {
				ecribeContraseña.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

			} else {
				ecribeContraseña.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				flag2 = true;
			}

			if (flag1 && flag2) {
				
				AuthModel am = new AuthModel();
				boolean is_login = am.login(escribeCorreo.getText(), pass);
				
				
				if (is_login) {
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
				} else {
					JOptionPane.showMessageDialog(null, "Error en el acceso", "Hello", JOptionPane.ERROR_MESSAGE);

				}
			}

		}
	});

	panel.add(acceder);

	JButton ir_registro = new JButton();
	ir_registro.setText("Ir al registro");
	ir_registro.setOpaque(true);
	ir_registro.setBackground(Color.CYAN);
	ir_registro.setBounds(390, 600, 200, 50);
	ir_registro.setFont(new Font("Broadway", Font.BOLD, 20));
	ir_registro.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			ventana.dispose();
			AuthView.this.register();

		//	router("registro");
		}

	});

	panel.add(ir_registro);
	
	ventana.add(panel);
	ventana.repaint();
	ventana.revalidate();
	ventana.setVisible(true);


}


public void register() {
	JFrame ventana = new JFrame();
	
	ventana.setTitle("DISEÑO");
	ventana.setVisible(true);
	ventana.setSize(1000,1000);
	ventana.setLayout(null);
	ventana.setLocationRelativeTo(null);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Font fuente = new Font("Arial",Font.BOLD,12);
	JPanel mipanel = new JPanel();
	
	mipanel.setBackground(Color.PINK);
	mipanel.setOpaque(true);
	mipanel.setSize(1000,1000);
	mipanel.setLocation(0,0);
	mipanel.setLayout(null); 
	//TITULO
	JLabel titulo = new JLabel("REGISTRO DE USUARIO");
	titulo.setSize(600, 60);
	titulo.setOpaque(false);
	titulo.setLocation(186, 70);
	titulo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
	titulo.setHorizontalAlignment(JLabel.CENTER);
	titulo.setFont(new Font("Broadway",Font.BOLD,40));
	mipanel.add(titulo);
	
	JLabel email = new JLabel("Correo Electrónico");
	email.setFont(new Font("Broadway", Font.BOLD, 16));
	email.setBounds(23, 199, 223, 40);
	email.setOpaque(false);
	email.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	mipanel.add(email);
	
	JTextField emailField = new JTextField();
	emailField.setFont(fuente);
	emailField.setBounds(23, 263, 265, 32);
	mipanel.add(emailField);
	emailField.setColumns(10);
	
	JLabel contra_alta = new JLabel("Contraseña");
	contra_alta.setOpaque(false);
	contra_alta.setFont(new Font("Broadway", Font.BOLD, 16));
	contra_alta.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	contra_alta.setBounds(23, 322, 223, 40);
	mipanel.add(contra_alta);
	
	JPasswordField nueva_contraField = new JPasswordField();
	nueva_contraField.setBounds(23, 384, 265, 32);
	nueva_contraField.setFont(fuente);
	mipanel.add(nueva_contraField);
	
	JLabel nombre = new JLabel("Nombre Completo");
	nombre.setOpaque(false);
	nombre.setFont(new Font("Broadway", Font.BOLD, 16));
	nombre.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	nombre.setBounds(362, 199, 223, 40);
	mipanel.add(nombre);
	
	JTextField nombre_field = new JTextField();
	nombre_field.setColumns(10);
	nombre_field.setFont(fuente);
	nombre_field.setBounds(362, 263, 265, 32);
	mipanel.add(nombre_field);
	
	JButton aceptar = new JButton("APLICAR Y ACEPTAR");
	aceptar.setSize(310, 65);
	aceptar.setLocation(530, 638);
	aceptar.setOpaque(true);
	aceptar.setBackground(Color.CYAN);
	aceptar.setHorizontalAlignment(JLabel.CENTER);
	aceptar.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	aceptar.setFont(new Font("Broadway", Font.BOLD, 18));
	mipanel.add(aceptar);
	
	
	
	JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
	lblNombreDeUsuario.setOpaque(false);
	lblNombreDeUsuario.setFont(new Font("Broadway", Font.BOLD, 16));
	lblNombreDeUsuario.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	lblNombreDeUsuario.setBounds(362, 322, 223, 40);
	mipanel.add(lblNombreDeUsuario);
	
	JTextField usuario_field = new JTextField();
	usuario_field.setColumns(10);
	usuario_field.setFont(fuente);
	usuario_field.setBounds(362, 384, 265, 32);
	mipanel.add(usuario_field);
	
	
	JLabel nacimiento = new JLabel("Fecha de Nacimiento");
	nacimiento.setOpaque(false);
	nacimiento.setFont(new Font("Broadway", Font.BOLD, 16));
	nacimiento.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	nacimiento.setBounds(710, 322, 223, 40);
	mipanel.add(nacimiento);
	
	JComboBox dia = new JComboBox(new Object[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"});
	dia.setFont(new Font("Broadway", Font.PLAIN, 17));
	dia.setBounds(710, 384, 59, 32);
	mipanel.add(dia);
	
	JComboBox mes = new JComboBox(new Object[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"});
	mes.setFont(new Font("Broadway", Font.PLAIN, 17));
	mes.setBounds(779, 384, 59, 32);
	mipanel.add(mes);
	
	JComboBox año = new JComboBox(new Object[]{"2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997"});
	año.setFont(new Font("Broadway", Font.PLAIN, 17));
	año.setBounds(848, 384, 85, 32);
	mipanel.add(año);
	
	JButton btn_login = new JButton("IR A LOGIN");
	btn_login.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ventana.dispose();
			AuthView.this.login();
		}
	});
	btn_login.setHorizontalAlignment(SwingConstants.CENTER);
	btn_login.setFont(new Font("Broadway", Font.BOLD, 18));
	btn_login.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	btn_login.setBackground(Color.CYAN);
	btn_login.setBounds(166, 638, 310, 65);
	mipanel.add(btn_login);
	
	JLabel verificar_contra = new JLabel("Verificar Contraseña");
	verificar_contra.setOpaque(false);
	verificar_contra.setFont(new Font("Broadway", Font.BOLD, 16));
	verificar_contra.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	verificar_contra.setBounds(23, 445, 223, 40);
	mipanel.add(verificar_contra);
	
	
	JPasswordField passwordField = new JPasswordField();
	passwordField.setFont(fuente);
	passwordField.setBounds(23, 507, 265, 32);
	mipanel.add(passwordField);
	
	JLabel empresa = new JLabel("Empresa");
	empresa.setOpaque(false);
	empresa.setFont(new Font("Broadway", Font.BOLD, 16));
	empresa.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	empresa.setBounds(362, 445, 223, 40);
	mipanel.add(empresa);
	
	JTextField empresa_field = new JTextField();
	empresa_field.setColumns(10);
	empresa_field.setFont(fuente);
	empresa_field.setBounds(362, 507, 265, 32);
	mipanel.add(empresa_field);
	
	JLabel ambito_empresa = new JLabel("Ámbito de la Empresa");
	ambito_empresa.setOpaque(false);
	ambito_empresa.setFont(new Font("Broadway", Font.BOLD, 16));
	ambito_empresa.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
	ambito_empresa.setBounds(710, 445, 223, 40);
	mipanel.add(ambito_empresa);
	
	JComboBox ambito_comboBox = new JComboBox(new Object[]{"Tecnología", "Salud", "Educación", "Comercio", "Otro"});
	ambito_comboBox.setFont(new Font("Broadway", Font.PLAIN, 17));
	ambito_comboBox.setBounds(710, 507, 223, 32);
	mipanel.add(ambito_comboBox);
	
	JRadioButton terms1 = new JRadioButton("Acepto los términos y condiciones", true);
	terms1.setSize(240,40);
	terms1.setFont(fuente);
	terms1.setLocation(226,589);
	terms1.setOpaque(false);
	mipanel.add(terms1);
	
	JRadioButton terms2 = new JRadioButton("No acepto los términos y condiciones");
	terms2.setSize(240,40);
	terms2.setFont(fuente);
	terms2.setLocation(530, 589);
	terms2.setOpaque(false);
	mipanel.add(terms2);
	
	ButtonGroup terms_group = new ButtonGroup();
	terms_group.add(terms1);
	terms_group.add(terms2);
	
	aceptar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
	        String nombre = nombre_field.getText();
	        String email = emailField.getText();
	        String usuario = usuario_field.getText();
	        String password = new String(nueva_contraField.getPassword());
	        String confirmPassword = new String(passwordField.getPassword());
	        String empresa = empresa_field.getText();

	        if (nombre.isEmpty() || email.isEmpty() || usuario.isEmpty() || 
	            password.isEmpty() || empresa.isEmpty()) {
	            JOptionPane.showMessageDialog(ventana, 
	                "Todos los campos son obligatorios.", 
	                "Error", 
	                JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        if (!password.equals(confirmPassword)) {
	            JOptionPane.showMessageDialog(ventana, 
	                "Las contraseñas no coinciden.", 
	                "Error", 
	                JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        if (usuario.contains(" ")) {
	            JOptionPane.showMessageDialog(ventana, 
	                "El nombre de usuario no puede contener espacios.", 
	                "Error", 
	                JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        AuthModel modelo = new AuthModel();
	        boolean registroExitoso = modelo.registrarUsuario(nombre, email, usuario, password, empresa);

	        if (registroExitoso) {
	            JOptionPane.showMessageDialog(ventana, 
	                "¡Registro exitoso!", 
	                "Éxito", 
	                JOptionPane.INFORMATION_MESSAGE);
	            ventana.dispose(); 
	            login(); 
	        } else {
	            JOptionPane.showMessageDialog(ventana, 
	                "Error al guardar los datos.", 
	                "Error", 
	                JOptionPane.ERROR_MESSAGE);
	        }
	    }
	});
	

	
	ventana.add(mipanel);
	ventana.repaint();
	ventana.revalidate();
}


}


		
