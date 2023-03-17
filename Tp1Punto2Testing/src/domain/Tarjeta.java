package domain;

public abstract class Tarjeta {

	protected String nombre;
	

	public Tarjeta(String nombre) {
		super();
		this.nombre = nombre;
		

	}

	abstract double pagar(Pedido pedido, double propina);

}
