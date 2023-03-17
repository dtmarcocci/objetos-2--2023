package service;

import java.util.List;

import domain.ItemDeMenu;
import domain.Menu;
import domain.Pedido;

public class DispositivoElectronico {

	public static Pedido generarPedido(Menu menu, List<ItemDeMenu> items,Tarjeta tarjeta) {
		Pedido pedido = null;
		menu.verifyItem(items);
		pedido = new Pedido();
		return pedido;
	}

}
