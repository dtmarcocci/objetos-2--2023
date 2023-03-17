package domain;

import java.util.List;

public class Mesa {

	int capacidad;
	List<Comensal> comensales;

	public Mesa(int capacidad, List<Comensal> comensales) {
		super();
		this.capacidad = capacidad;
		this.comensales = comensales;
	}

	public void sentarComensal(Comensal comensal) {
		if (this.comensales.size() >= capacidad) {
			throw new RuntimeException("La capacidad de la mesa esta llena");
		} else
			this.comensales.add(comensal);
	}

	private void estaSentado(Comensal comensal) {
		if (!comensales.contains(comensal)) {
			throw new RuntimeException("El comensal no pertenece a esta mesa");
		}
	}

	public Pedido generarPedido(Comensal comensal, MenuElectronico menu, List<ItemDeMenu> platos,
			List<ItemDeMenu> bebidas) {
		this.estaSentado(comensal);
		return menu.generarPedido(this, platos, bebidas);
	}

	

	
	

}
