package domain;

public class TarjetaMastercard extends Tarjeta {

	private float descuento;

	public TarjetaMastercard(String nombre, float descuento) {
		super(nombre);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	float pagar(Pedido pedido) {
		float descuento = pedido.costoTotalPlatoPrincipal() - (pedido.costoTotalPlatoPrincipal() * this.descuento);

		return descuento;
	}

}
