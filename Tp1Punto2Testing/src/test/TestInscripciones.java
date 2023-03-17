package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import domain.Comensal;
import domain.Factura;
import domain.ItemDeMenu;
import domain.MenuElectronico;
import domain.Mesa;
import domain.Pedido;
import domain.TarjetaComarcaPlus;
import domain.TarjetaMastercard;
import domain.TarjetaViedma;
import domain.TarjetaVisa;
import service.DispositivoElectronico;

public class TestInscripciones {

	@Test
	public void pagoTarjetaVisa() {
		// set up
		Comensal comensal = new Comensal("Dalmiro", "Apellido", new TarjetaVisa("Visa", 0.03));
		List<ItemDeMenu> platosPrincipales = new ArrayList<ItemDeMenu>(
				Arrays.asList(new ItemDeMenu("Fideos", 150), new ItemDeMenu("Pollo", 200)));
		List<ItemDeMenu> bebidas = new ArrayList<ItemDeMenu>(
				Arrays.asList(new ItemDeMenu("cerveza", 50), new ItemDeMenu("Vino", 100)));
		MenuElectronico menu = new MenuElectronico(platosPrincipales, bebidas);
		Mesa mesa = new Mesa(5, new ArrayList<Comensal>());
		DispositivoElectronico.sentarse(comensal, mesa);

		Pedido pedido = DispositivoElectronico.generarPedido(mesa,comensal, menu, platosPrincipales, bebidas);
		Factura factura = DispositivoElectronico.pagar(comensal, pedido, 0.03);
		/*
		 * Calculo; 500= 350 (platos) + 150 (bebidas) + 15 = 500 * 0.03 (propina) 4.5 =
		 * 150 * 0.03 (descuento de bebidas) Cuenta total = 500+15-4.5 = 510,5
		 */
		double valorEsperado = 510.5;
		// exercise

		// verify
		// El 0 equivale a la cantidad de digitos en los cuales puede diferir
		assertEquals(factura.precioFinal(), valorEsperado, 0);

	}

	@Test
	public void pagoTarjetaMastercard() {
		// set up
		Comensal comensal = new Comensal("Dalmiro", "Apellido", new TarjetaMastercard("Mastercard", 0.02));
		List<ItemDeMenu> platosPrincipales = new ArrayList<ItemDeMenu>(
				Arrays.asList(new ItemDeMenu("Fideos", 150), new ItemDeMenu("Pollo", 200)));
		List<ItemDeMenu> bebidas = new ArrayList<ItemDeMenu>(
				Arrays.asList(new ItemDeMenu("cerveza", 50), new ItemDeMenu("Vino", 100)));
		MenuElectronico menu = new MenuElectronico(platosPrincipales, bebidas);
		Mesa mesa = new Mesa(5, new ArrayList<Comensal>());
		DispositivoElectronico.sentarse(comensal, mesa);

		Pedido pedido = DispositivoElectronico.generarPedido(mesa,comensal, menu, platosPrincipales, bebidas);
		Factura factura = DispositivoElectronico.pagar(comensal, pedido, 0.03);
		/*
		 * Calculo; 500= 350 (platos) + 150 (bebidas) + 15 = 500 * 0.03 (propina) 7 =
		 * 350 * 0.02 (descuento de platos) Cuenta total = 500+15-7 = 508
		 */
		double valorEsperado = 508;
		// exercise

		// verify
		// El 0 equivale a la cantidad de digitos en los cuales puede diferir
		assertEquals(factura.precioFinal(), valorEsperado, 0);

	}

	@Test
	public void pagoTarjetaComarcaPlus() {
		// set up
		Comensal comensal = new Comensal("Dalmiro", "Apellido", new TarjetaComarcaPlus("Comarca", 0.02));
		List<ItemDeMenu> platosPrincipales = new ArrayList<ItemDeMenu>(
				Arrays.asList(new ItemDeMenu("Fideos", 150), new ItemDeMenu("Pollo", 200)));
		List<ItemDeMenu> bebidas = new ArrayList<ItemDeMenu>(
				Arrays.asList(new ItemDeMenu("cerveza", 50), new ItemDeMenu("Vino", 100)));
		MenuElectronico menu = new MenuElectronico(platosPrincipales, bebidas);
		Mesa mesa = new Mesa(5, new ArrayList<Comensal>());
		DispositivoElectronico.sentarse(comensal, mesa);

		Pedido pedido = DispositivoElectronico.generarPedido(mesa,comensal, menu, platosPrincipales, bebidas);
		Factura factura = DispositivoElectronico.pagar(comensal, pedido, 0.03);
		/*
		 * Calculo; 500= 350 (platos) + 150 (bebidas) + 15 = 500 * 0.03 (propina) 10 =
		 * 500 * 0.02 (descuento total) Cuenta total = 500+15-10 = 505
		 */
		double valorEsperado = 505;
		// exercise

		// verify
		// El 0 equivale a la cantidad de digitos en los cuales puede diferir
		assertEquals(factura.precioFinal(), valorEsperado, 0);

	}

	@Test
	public void pagoTarjetaViedma() {
		// set up
		Comensal comensal = new Comensal("Dalmiro", "Apellido", new TarjetaViedma("Viedma"));
		List<ItemDeMenu> platosPrincipales = new ArrayList<ItemDeMenu>(
				Arrays.asList(new ItemDeMenu("Fideos", 150), new ItemDeMenu("Pollo", 200)));
		List<ItemDeMenu> bebidas = new ArrayList<ItemDeMenu>(
				Arrays.asList(new ItemDeMenu("cerveza", 50), new ItemDeMenu("Vino", 100)));
		MenuElectronico menu = new MenuElectronico(platosPrincipales, bebidas);
		Mesa mesa = new Mesa(5, new ArrayList<Comensal>());
		DispositivoElectronico.sentarse(comensal, mesa);

		Pedido pedido = DispositivoElectronico.generarPedido(mesa,comensal, menu, platosPrincipales, bebidas);
		Factura factura = DispositivoElectronico.pagar(comensal, pedido, 0.03);
		/*
		 * Calculo; 500= 350 (platos) + 150 (bebidas) + 15 = 500 * 0.03 (propina)
		 * 
		 * Cuenta total = 500+15= 515
		 */
		double valorEsperado = 515;
		// exercise

		// verify
		// El 0 equivale a la cantidad de digitos en los cuales puede diferir
		assertEquals(factura.precioFinal(), valorEsperado, 0);

	}

}
