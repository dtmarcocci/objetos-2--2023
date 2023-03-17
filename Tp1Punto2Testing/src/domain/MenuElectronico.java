package domain;

import java.util.List;

public class MenuElectronico {

	private List<ItemDeMenu> platosPrincipales;
	private List<ItemDeMenu> bebidas;

	public MenuElectronico(List<ItemDeMenu> platosPrincipales, List<ItemDeMenu> bebidas) {
		super();
		this.platosPrincipales = platosPrincipales;
		this.bebidas = bebidas;
	}

	private void verificarBebidas(List<ItemDeMenu> bebidas) {

		for (ItemDeMenu i : bebidas) {
			if (!this.bebidas.contains(i)) {
				throw new RuntimeException("La bebida: " + i.getDescripcion() + " sin stock");
			}
		}

	}

	private void verificarPlatos(List<ItemDeMenu> platosPrincipales) {

		for (ItemDeMenu p : platosPrincipales) {
			if (!this.platosPrincipales.contains(p)) {
				throw new RuntimeException("La bebida: " + p.getDescripcion() + " sin stock");
			}
		}

	}

	public Pedido generarPedido(Mesa mesa,List<ItemDeMenu> platosPrincipales, List<ItemDeMenu> bebidas) {
		Pedido pedido = null;
		verificarBebidas(bebidas);
		verificarPlatos(platosPrincipales);
		pedido = new Pedido(mesa,platosPrincipales, bebidas);
		return pedido;

	}

	

}
