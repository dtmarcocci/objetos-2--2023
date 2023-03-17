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

	public void addComensal(Comensal comensal) {
		if (this.comensales.size() >= capacidad) {
			throw new RuntimeException("La capacidad de la mesa esta llena");
		}
		else
			this.comensales.add(comensal);
	}

	
	
}
