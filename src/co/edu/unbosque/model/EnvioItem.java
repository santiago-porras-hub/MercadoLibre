package co.edu.unbosque.model;

public class EnvioItem {
	
	private int id;
	private int idItem;
	private int idEnvio;
	
	public EnvioItem(int id, int idItem, int idEnvio) {
		super();
		this.id = id;
		this.idItem = idItem;
		this.idEnvio = idEnvio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public int getIdEnvio() {
		return idEnvio;
	}

	public void setIdEnvio(int idEnvio) {
		this.idEnvio = idEnvio;
	}

}
