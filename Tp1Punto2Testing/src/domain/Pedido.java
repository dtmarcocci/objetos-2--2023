package domain;

import java.util.List;

public class Pedido {

	private Mesa mesa;
	private List<ItemDeMenu> platosPrincipales;
	private List<ItemDeMenu> bebidas;

	public Pedido(Mesa mesa, List<ItemDeMenu> platosPrincipales, List<ItemDeMenu> bebidas) {
		super();
		this.mesa = mesa;
		this.platosPrincipales = platosPrincipales;
		this.bebidas = bebidas;

	}

	double costoTotal() {

		return this.costoTotalBebidas() + this.costoTotalPlatoPrincipal();
	}

	double costoTotalBebidas() {
		double costo = 0;
		for (ItemDeMenu i : this.bebidas) {

			costo = costo + i.price();

		}
		return costo;
	}

	double costoTotalPlatoPrincipal() {
		double costo = 0;
		for (ItemDeMenu i : this.platosPrincipales) {

			costo = costo + i.price();

		}
		return costo;
	}

}
