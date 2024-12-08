package conecciones;

import java.awt.event.*;
import java.util.List;

import Interfaz_usuario.*;
import modeloBD.*;


public class ControladorCargaMarcas extends WindowAdapter {
	
	public ControladorCargaMarcas(InterfazUser myItemsMenu) {
		this.myItemsMenu = myItemsMenu;
	}
	
	
	@SuppressWarnings("unchecked")
	public void windowOpened(WindowEvent event) {
		
		try {
			
			List<String> marcas =   myConn.ejecutarConsultas();
			
			 for (String marca : marcas) {
		            myItemsMenu.opcionMenu.addItem(marca);
		        }
			 
			myConn.rs.close();
			
		}catch(Exception ex) {
			
			System.out.println("Error: " + ex.getLocalizedMessage());
		}
		
		
	}
	
	consultaMarcasBox myConn = new consultaMarcasBox();
	private InterfazUser myItemsMenu;
}