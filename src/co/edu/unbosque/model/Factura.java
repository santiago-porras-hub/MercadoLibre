package co.edu.unbosque.model;

public class Factura {

	private int id;
	private int idProducto;
	private int cantidad;
	private float iva;
	private float total;
	private int idPago;
	
	public Factura(int id, int idProducto, int cantidad, float iva, float total, int idPago) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.iva = iva;
		this.total = total;
		this.idPago = idPago;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}
	
	
}
