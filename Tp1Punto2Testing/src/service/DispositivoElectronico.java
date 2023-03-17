package service;

import java.util.List;

import domain.Comensal;
import domain.Factura;
import domain.ItemDeMenu;
import domain.MenuElectronico;
import domain.Mesa;
import domain.Pedido;

public class DispositivoElectronico {

	public static Pedido generarPedido(Mesa mesa, Comensal comensal, MenuElectronico menu, List<ItemDeMenu> platos,
			List<ItemDeMenu> bebidas) {

		return comensal.pedir(mesa, menu, platos, bebidas);
	}

	public static Factura pagar(Comensal comensal, Pedido pedido, double propina) {
		return comensal.pagar(pedido, propina);
	}

	public static void sentarse(Comensal comensal, Mesa mesa) {
		comensal.sentarse(mesa);
	}

}
