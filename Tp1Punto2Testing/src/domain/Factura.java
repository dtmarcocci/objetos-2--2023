package domain;

public class Factura {

	private Comensal comensal;
	private Pedido pedido;
	private double precioInicial;
	private double precioFinal;

	public Factura(Comensal comensal,Pedido pedido, double precioInicial, double precioFinal) {
		super();
		this.pedido = pedido;
		this.comensal=comensal;
		this.precioInicial = precioInicial;
		this.precioFinal = precioFinal;
	}

	public double precioFinal() {
		return this.precioFinal;
	}

}
