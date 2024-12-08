package modeloBD;

import java.sql.*;


public class conexionBD {
	
	Connection myConec = null;
	
	public conexionBD(){
		
	}
	
	public Connection conexion() {
		try {
			myConec = DriverManager.getConnection( "jdbc:mysql://localhost:3306/concesionaria", "root","Lozada1998");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return myConec;
	}
	
	public void closeConnection() {
	    if (myConec != null) {
	        try {
	            myConec.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

}