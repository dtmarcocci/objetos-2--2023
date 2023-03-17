package domain;

public class ItemDeMenu {

	private String descripcion;
	private double price;

	public ItemDeMenu(String descripcion, double price) {
		super();
		this.descripcion = descripcion;
		this.price = price;
	}

	String getDescripcion() {
		return descripcion;
	}

	double price() {
		return this.price;
	}

}
