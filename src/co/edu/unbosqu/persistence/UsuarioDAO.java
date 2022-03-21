package co.edu.unbosqu.persistence;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import co.edu.unbosque.model.Usuario;

public class UsuarioDAO extends ManejoConexion {

	
	private List<Usuario> lstUsuario = new ArrayList<Usuario>();
	
	
	public UsuarioDAO() {
		
		try {		
			establecerConexion();
		} catch (SQLException e) {
			Logger.getLogger(ManejoConexion.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	public void cambiarSaldo(int idUsuario) {
        try {

            if (!conexion.isClosed()) {
                //llamado al procedimiento almacenado pa_cambiarPuntos
                CallableStatement c=conexion.prepareCall("{call cambiar_saldo(?)}"); 
                c.setInt(1, idUsuario);
                c.execute(); 
            } else {
                System.out.print("error en llamado");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoConexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("error conexion");
        }

    }
	
	
	
}
