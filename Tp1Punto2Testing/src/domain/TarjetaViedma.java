package domain;

public class TarjetaViedma extends Tarjeta {

	public TarjetaViedma(String nombre) {
		super(nombre);

	}

	@Override
	double pagar(Pedido pedido, double propina) {
		double pago = (pedido.costoTotal() * propina) + pedido.costoTotal();
		return pago;
	}

}
