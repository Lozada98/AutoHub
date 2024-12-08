package Interfaz_usuario;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import modeloBD.*;
import conecciones.*;



public class InterfazUser extends JFrame{

	public InterfazUser() {
		
		setBounds(200,100,300,400);
		setTitle("Autos Miguel");

		setLayout(new BorderLayout());
		
		opcionMenu = new JComboBox();
		opcionMenu.setEditable(false);
		
		add(opcionMenu, BorderLayout.NORTH);
		JButton buttonQuery = new JButton("Consultar");
		buttonQuery.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				datosProductos.datosProductos();
				
			}
			
		});
		add(buttonQuery, BorderLayout.SOUTH);
		
		textOut = new JTextArea(15, 30);
		add(textOut, BorderLayout.CENTER);
		
		addWindowListener(new ControladorCargaMarcas(this));
		
		setVisible(true);

	}
	
	
	public JTextArea textOut;
	EjecutaDatosProductos datosProductos = new EjecutaDatosProductos(this);
	public JComboBox opcionMenu;

	
}    