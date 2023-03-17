package domain;

public class TarjetaViedma extends Tarjeta {

	public TarjetaViedma(String nombre, double descuento) {
		super(nombre, descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	float pagar(Pedido pedido) {
		// TODO Auto-generated method stub
		return 0;
	}

}
