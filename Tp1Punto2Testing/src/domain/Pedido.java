package domain;

import java.util.List;

public class Pedido {

	private List<ItemDeMenu> items;

	public Pedido(List<ItemDeMenu> items) {
		super();
		this.items = items;

	}

	float costoTotal() {

		float costo = 0;
		for (ItemDeMenu i : this.items) {

			costo = costo + i.price();

		}
		return costo;
	}

	float costoTotalBebidas() {
		float costo = 0;
		for (ItemDeMenu i : this.items) {
			if (i.tipo() == "Bebida") {
				costo = costo + i.price();
			}
		}
		return costo;
	}

	float costoTotalPlatoPrincipal() {
		float costo = 0;
		for (ItemDeMenu i : this.items) {
			if (i.tipo() == "Plato Principal") {
				costo = costo + i.price();
			}
		}
		return costo;
	}

}
