package co.edu.unbosque.model;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private String telefono;
	private int saldo;
	private String tipo_Usuario;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String nombre, String apellido, String telefono, int saldo, String tipo_Usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.saldo = saldo;
		this.tipo_Usuario = tipo_Usuario;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public int getSaldo() {
		return saldo;
	}



	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}



	public String getTipo_Usuario() {
		return tipo_Usuario;
	}



	public void setTipo_Usuario(String tipo_Usuario) {
		this.tipo_Usuario = tipo_Usuario;
	}
	
	
	
	

}
