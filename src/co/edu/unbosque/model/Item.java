package co.edu.unbosque.model;

public class Item {
	
	private int serial;
	private String nombre;
	private int idProducto;
	
	public Item(int serial, String nombre, int idProducto) {
		super();
		this.serial = serial;
		this.nombre = nombre;
		this.idProducto = idProducto;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
}
