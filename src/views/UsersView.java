package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controllers.UsersController;
import models.AuthModel;
import models.User;
import models.UsersModel;

public class UsersView {

	protected int phone;
	protected String role;
	protected String correo;
	protected String name;

	public UsersView() {
		
	}
	
	
	public void index(List usuarios)
	{
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);
		ventana.setSize(930, 600);
		ventana.setLocationRelativeTo(null); 
		ventana.setTitle("Login"); 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		ventana.setResizable(true);  
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		//this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600); 
		
		JLabel lblNewLabel = new JLabel("UABCS - DASC\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
		lblNewLabel.setBounds(107, 35, 210, 26);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);
		
		
		String[] columnas = {"ID", "Nombre", "Email", "Rol", "Teléfono","Create_At","Update_at"};
	    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
	    JTable tabla = new JTable(modelo);

	    for (Object user : usuarios) {
	        User usuario = (User) user;
	        Object[] fila = {
	            usuario.id,
	            usuario.name,
	            usuario.email,
	            usuario.role,
	            usuario.phone
	        };
	        modelo.addRow(fila);
	    }

	    JScrollPane scrollpane = new JScrollPane(tabla);
	    scrollpane.setBounds(50, 80, 800, 300); 	    panel.add(scrollpane);

	   
	    int y = 400;
	    

	        JButton delete = new JButton("Eliminar ");
	        delete.setBounds(50, y, 200, 30);
	        delete.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	            	int seleccionFila = tabla.getSelectedRow();
	            	
	                if (seleccionFila != -1) { 
	                    int id = (int) tabla.getValueAt(seleccionFila, 0); 

	                UsersModel um = new UsersModel();
	                um.remove(id);
	                ventana.dispose();
	                UsersController us = new UsersController();
	                us.index();
	            }}
	            
	        });
	        panel.add(delete);
	        
	    
		    

	        JButton añadir = new JButton("Añadir ");
	        añadir.setBounds(650, 400, 200, 30);
	        añadir.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	UsersModel um = new UsersModel();
	            	
	            	String nombre = "reni";
	            	String email = "reni@gmail.com";
	            	String role = "Clieent";
	            	int phone = 612456799;
	           
	                um.insert(y, name, correo, role, phone);
	                ventana.dispose();
	                UsersController us = new UsersController();
	                us.index();
	            }
	            
	        });
	        panel.add(añadir);
	        
	        JButton edit = new JButton("Editar ");
	        edit.setBounds(260, y, 100, 30);
	        edit.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int seleccionFila = tabla.getSelectedRow();
	                if (seleccionFila != -1) {
	                    int id = (int) tabla.getValueAt(seleccionFila, 0);
	                    String nombre = (String) tabla.getValueAt(seleccionFila, 1);
	                    String email = (String) tabla.getValueAt(seleccionFila, 2);
	                    String rol = (String) tabla.getValueAt(seleccionFila, 3);
	                    int telefono = (int) tabla.getValueAt(seleccionFila, 4);

	                    User usuarioSeleccionado = new User();

	                    editarUsuario(ventana, usuarioSeleccionado);
	                } else {
	                    JOptionPane.showMessageDialog(ventana, "Selecciona un usuario para editar.");
	                }
	            }
	        });
	        panel.add(edit);


	       
	        panel.add(edit);
		 
		
		ventana.add(panel);
		ventana.repaint();
		ventana.revalidate();
	}
	
	private void editarUsuario(JFrame parentFrame, User usuario) {
	    JFrame formulario = new JFrame("Editar Usuario");
	    formulario.setSize(400, 400);
	    formulario.setLocationRelativeTo(parentFrame);
	    formulario.setLayout(null);

	    JPanel panel = new JPanel();
	    panel.setLayout(null);
	    panel.setBounds(0, 0, 400, 400);

	    JTextField txtNombre = new JTextField(usuario.name);
	    txtNombre.setBounds(130, 20, 200, 25);

	    JTextField txtEmail = new JTextField(usuario.email);
	    txtEmail.setBounds(130, 60, 200, 25);

	    JTextField txtRol = new JTextField(usuario.role);
	    txtRol.setBounds(130, 100, 200, 25);

	    JTextField txtTelefono = new JTextField(usuario.phone);
	    txtTelefono.setBounds(130, 140, 200, 25);

	    JButton btnGuardar = new JButton("Guardar Cambios");
	    btnGuardar.setBounds(150, 200, 150, 30);
	    btnGuardar.addActionListener(e -> {
	        String nombre = txtNombre.getText();
	        String email = txtEmail.getText();
	        String rol = txtRol.getText();
	        String telefono = txtTelefono.getText();

	        UsersModel um = new UsersModel();
	        boolean exito = um.update(usuario.id, nombre, email, rol, telefono); // UPDATE

	        if (exito) {
	            JOptionPane.showMessageDialog(formulario, "Usuario actualizado");
	            formulario.dispose();
	            parentFrame.dispose();
	            new UsersController().index();
	        }
	    });
	    panel.add(new JLabel("Nombre:")).setBounds(20, 20, 100, 25);
	    panel.add(txtNombre);
	    formulario.add(btnGuardar);
	    formulario.add(panel);
	    formulario.setVisible(true);
	}
	
	
	



}
