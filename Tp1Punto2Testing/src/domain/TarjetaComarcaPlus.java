package domain;

public class TarjetaComarcaPlus extends Tarjeta {

	private float descuento;

	public TarjetaComarcaPlus(String nombre, float descuento) {
		super(nombre);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}

	@Override
	float pagar(Pedido pedido) {
		// TODO Auto-generated method stub
		float descuento = pedido.costoTotal() - (pedido.costoTotal() * this.descuento);

		return descuento;

	}

}
