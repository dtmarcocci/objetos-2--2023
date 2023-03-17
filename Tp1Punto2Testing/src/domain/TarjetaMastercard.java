package domain;

public class TarjetaMastercard extends Tarjeta {

	private double descuento;

	public TarjetaMastercard(String nombre,  double descuento) {
		super(nombre);
		this.descuento = descuento;

		// TODO Auto-generated constructor stub
	}

	@Override
	double pagar(Pedido pedido, double propina) {
		double pago = (pedido.costoTotal() * propina) + pedido.costoTotal()
				- (pedido.costoTotalPlatoPrincipal() * this.descuento);
		return pago;
	}

}
