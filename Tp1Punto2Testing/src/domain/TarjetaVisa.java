package domain;

public class TarjetaVisa extends Tarjeta {

	private double descuento;

	public TarjetaVisa(String nombre,double descuento) {
		super(nombre);
		this.descuento = descuento;

		// TODO Auto-generated constructor stub
	}

	@Override
	public double pagar(Pedido pedido, double propina) {
		// TODO Auto-generated method stub

		double pago = (pedido.costoTotal() * propina) + pedido.costoTotal()
				- (pedido.costoTotalBebidas() * this.descuento);

		return pago;
	}

}
