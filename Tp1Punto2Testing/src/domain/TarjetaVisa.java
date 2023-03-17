package domain;

public class TarjetaVisa extends Tarjeta {

	private float descuento;

	public TarjetaVisa(String nombre, float descuento) {
		super(nombre);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float pagar(Pedido pedido) {
		// TODO Auto-generated method stub

		float descuento = pedido.costoTotalBebidas() - (pedido.costoTotalBebidas() * this.descuento);

		return descuento;
	}

}
