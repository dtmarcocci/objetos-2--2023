package domain;

public class Factura {

	private Pedido pedido;
	private float precioSinDescuento;
	private float precioConDescuento;

	public Factura(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	public void precioFinal(Tarjeta tarjeta) {

	}

}
