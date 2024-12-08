package Interfaz_usuario;

import javax.swing.JFrame;

public class init_app {

	public static void main(String[] args) {
		
		InterfazUser myApp = new InterfazUser();
		myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myApp.setVisible(true);
	}

}  