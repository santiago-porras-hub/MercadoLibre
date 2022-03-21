package co.edu.unbosque.model;

import java.sql.Date;

public class Envio {

	private int id;
	private String nombre;
	private int idCiudad;
	private String direccion;
	private String tiempo;
	private Date fecha;
	private int idFactura;
	
	public Envio(int id, String nombre, int idCiudad, String direccion, String tiempo, Date fecha, int idFactura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idCiudad = idCiudad;
		this.direccion = direccion;
		this.tiempo = tiempo;
		this.fecha = fecha;
		this.idFactura = idFactura;
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

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	
}
