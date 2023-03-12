package main;

import java.time.LocalDate;

import domain.Tiempo;
import service.Printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo time = new Tiempo(LocalDate.now());
		Printer.longFormat(time);
		Printer.shortFormat(time);

		///////// Explicacion /////////

		/*
		 * Aca la logica de como se transforma el objeto Tiempo es realizado en la capa
		 * de dominio y la capa de servicio solo imprime el resultado
		 */

	}

}
