package domain;

public class TarjetaComarcaPlus extends Tarjeta {

	private double descuento;

	public TarjetaComarcaPlus(String nombre,  double descuento) {
		super(nombre);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	double pagar(Pedido pedido, double propina) {
		// TODO Auto-generated method stub
		double pago = (pedido.costoTotal() * propina) + pedido.costoTotal() - (pedido.costoTotal() * this.descuento);
		return pago;

	}

}
