package main;

import java.time.LocalDate;

import domain.TiempoRecord;
import service.Printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiempoRecord time = new TiempoRecord(LocalDate.now());
		Printer.longFormat(time);
		Printer.shortFormat(time);

		///////// Explicacion /////////

		/*
		 * El Patron de diseño ( o anti patron) anemico consiste en que las clases del
		 * dominio solo contengan los atributos que la componen y como metodos
		 * getter/setters y constructores Sin tener logica de negocio en las mismas. Por
		 * otro lado este anti patron maneja toda la logica de negocio desde la capa de
		 * servicio
		 */

	}

}
