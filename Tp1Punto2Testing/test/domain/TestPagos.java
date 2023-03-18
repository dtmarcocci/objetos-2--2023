package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import service.Dispositivo;

public class TestPagos {

	@Test
	public void targeTaVisa() {
		// set up
		List<ItemMenu> platos = Arrays.asList(new ItemMenu("Pollo", 250), new ItemMenu("fideos", 100));
		List<ItemMenu> bebidas = Arrays.asList(new ItemMenu("Cerveza", 50), new ItemMenu("Vino", 100));
		EMenu menu = new EMenu(bebidas, platos);
		Comensal comensal = new Comensal("Dalmiro", "Marcocci", new TarjetaVisa(0.03));
		Pedido pedido = Dispositivo.generarPedido(comensal, menu, bebidas, platos);
		double valorEsperado = 510.5;
		// Excercise
		Factura factura = Dispositivo.generarFactura(comensal, pedido, 0.03);
		// Verify

		assertEquals(factura.costoFinal(), valorEsperado);
	}

	@Test
	public void targeMastercard() {
		// set up
		List<ItemMenu> platos = Arrays.asList(new ItemMenu("Pollo", 250), new ItemMenu("fideos", 100));
		List<ItemMenu> bebidas = Arrays.asList(new ItemMenu("Cerveza", 50), new ItemMenu("Vino", 100));
		EMenu menu = new EMenu(bebidas, platos);
		Comensal comensal = new Comensal("Dalmiro", "Marcocci", new TarjetaMastercard(0.02));
		Pedido pedido = Dispositivo.generarPedido(comensal, menu, bebidas, platos);
		double valorEsperado = 508;
		// Excercise
		Factura factura = Dispositivo.generarFactura(comensal, pedido, 0.03);
		// Verify

		assertEquals(factura.costoFinal(), valorEsperado);
	}

	@Test
	public void targeComarcaPlus() {
		// set up
		List<ItemMenu> platos = Arrays.asList(new ItemMenu("Pollo", 250), new ItemMenu("fideos", 100));
		List<ItemMenu> bebidas = Arrays.asList(new ItemMenu("Cerveza", 50), new ItemMenu("Vino", 100));
		EMenu menu = new EMenu(bebidas, platos);
		Comensal comensal = new Comensal("Dalmiro", "Marcocci", new TarjetaComarcaPlus(0.02));
		Pedido pedido = Dispositivo.generarPedido(comensal, menu, bebidas, platos);
		double valorEsperado = 505;
		// Excercise
		Factura factura = Dispositivo.generarFactura(comensal, pedido, 0.03);
		// Verify

		assertEquals(factura.costoFinal(), valorEsperado);
	}

	@Test
	public void targeViedma() {
		// set up
		List<ItemMenu> platos = Arrays.asList(new ItemMenu("Pollo", 250), new ItemMenu("fideos", 100));
		List<ItemMenu> bebidas = Arrays.asList(new ItemMenu("Cerveza", 50), new ItemMenu("Vino", 100));
		EMenu menu = new EMenu(bebidas, platos);
		Comensal comensal = new Comensal("Dalmiro", "Marcocci", new TarjetaViedma(0));
		Pedido pedido = Dispositivo.generarPedido(comensal, menu, bebidas, platos);
		double valorEsperado = 515;
		// Excercise
		Factura factura = Dispositivo.generarFactura(comensal, pedido, 0.03);
		// Verify

		assertEquals(factura.costoFinal(), valorEsperado);
	}

}
