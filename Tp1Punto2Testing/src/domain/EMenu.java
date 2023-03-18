package domain;

import java.util.List;

public class EMenu {

	private List<ItemMenu> bebidas;
	private List<ItemMenu> platos;
	
	public EMenu(List<ItemMenu> bebidas, List<ItemMenu> platos) {
		super();
		this.bebidas = bebidas;
		this.platos = platos;
	}
	
	Pedido generarPedido(List<ItemMenu> bebidas, List<ItemMenu> platos){
		Pedido pedido = null;
		pedido= new Pedido(bebidas,platos);
		return pedido;
	}
	
	

}
