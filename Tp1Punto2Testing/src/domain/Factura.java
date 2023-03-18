package domain;

import java.time.LocalDateTime;

public class Factura {

	@SuppressWarnings("unused")
	private Pedido pedido;
	@SuppressWarnings("unused")
	private double costoInicial;
	@SuppressWarnings("unused")
	private double costoFinal;
	@SuppressWarnings("unused")
	private LocalDateTime fecha;

	public Factura(Pedido pedido, double costoInicial, double costoFinal) {
		super();
		this.pedido = pedido;
		this.costoInicial = costoInicial;
		this.costoFinal = costoFinal;
		this.fecha = LocalDateTime.now();
	}

	double costoFinal() {
		return costoFinal;
	}

}
