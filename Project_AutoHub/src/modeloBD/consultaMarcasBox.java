package modeloBD;

import java.sql.*;
import java.util.*;


public class consultaMarcasBox {

	public consultaMarcasBox() {
		myConect  = new conexionBD();
		
	}
	
	public List<String> ejecutarConsultas() {
		
		productos myProductos = null;
		List<String> marcas = new ArrayList<>();
		Connection conn = myConect.conexion();
		
		try {
		
			Statement st = conn.createStatement();
			
			rs = st.executeQuery("SELECT DISTINCTROW brand FROM cars");
			
			while(rs.next()) {
				
				myProductos = new productos();
				myProductos.setBrand(rs.getString(1));
				marcas.add(rs.getString(1));
				
			}
			
			rs.close();
			
		}catch(Exception e){
			
			System.out.println("Error: " + e.getLocalizedMessage());
		}
		
		return marcas;

	}
	
	conexionBD myConect;
	public ResultSet rs;
	
	
}    