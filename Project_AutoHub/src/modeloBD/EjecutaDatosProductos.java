package modeloBD;

import java.sql.*;
import Interfaz_usuario.*;


public class EjecutaDatosProductos {

    private conexionBD myConexion;
    private productos myProductos;
    private InterfazUser itemsDatos;

    public EjecutaDatosProductos(InterfazUser itemsDatos) {
       
        if (itemsDatos == null) {
            throw new IllegalArgumentException("El parámetro 'itemsDatos' no puede ser null.");
        }
        this.itemsDatos = itemsDatos;
        this.myConexion = new conexionBD();
        this.myProductos = new productos();
    }

    public void datosProductos() {
        String datos = (String) itemsDatos.opcionMenu.getSelectedItem(); 
        if (datos == null) {
            System.out.println("No se seleccionó ninguna marca.");
            return;
        }

        String query = "SELECT * FROM cars WHERE brand = ?";
        try (Connection conn = myConexion.conexion();
             PreparedStatement myQuery = conn.prepareStatement(query)) {

            
            myQuery.setString(1, datos);

            try (ResultSet rs = myQuery.executeQuery()) {
                itemsDatos.textOut.setText(""); 

               
                while (rs.next()) {
                    myProductos.setBrand(rs.getString("brand"));
                    myProductos.setModel(rs.getString("model"));
                    myProductos.setPrice(rs.getString("price"));

                    
                    itemsDatos.textOut.append("\nMarca: " + myProductos.getBrand());
                    itemsDatos.textOut.append("\nModelo: " + myProductos.getModel());
                    itemsDatos.textOut.append("\nPrecio R$: " + myProductos.getPrice() + "\n");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
