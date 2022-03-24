package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosqu.persistence.UsuarioDAO;

public class Controller {
	
	UsuarioDAO usu= new UsuarioDAO();
	
	public Controller() {
		
		int idUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Id de Usuario"));
		usu.cambiarSaldo(idUsuario);
		System.out.println("Operacion finalizada");
	}
	
}
