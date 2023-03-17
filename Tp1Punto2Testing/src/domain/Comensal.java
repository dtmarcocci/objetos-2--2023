package domain;

import java.util.List;
import java.util.Objects;

public class Comensal {

	private String nombre;
	private String apellido;
	private Tarjeta tarjeta;

	public Comensal(String nombre, String apellido, Tarjeta tarjeta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjeta = tarjeta;
	}

	public void sentarse(Mesa mesa) {
		mesa.sentarComensal(this);
	}

	public Pedido pedir(Mesa mesa, MenuElectronico menu, List<ItemDeMenu> platos, List<ItemDeMenu> bebidas) {
		return mesa.generarPedido(this, menu, platos, bebidas);
	}

	public Factura pagar(Pedido pedido, double propina) {
		Factura factura = new Factura(this, pedido, pedido.costoTotal(), tarjeta.pagar(pedido, propina));
		return factura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comensal other = (Comensal) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}
	
	

}
