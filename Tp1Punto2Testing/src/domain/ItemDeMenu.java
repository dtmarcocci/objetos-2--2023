package domain;

public abstract class ItemDeMenu {

	private String descripcion;
	private float price;

	public ItemDeMenu(String descripcion, float price) {
		super();
		this.descripcion = descripcion;
		this.price = price;
	}

	String getDescripcion() {
		return descripcion;
	}

	float price() {
		return this.price;
	}
	abstract String tipo();

}
