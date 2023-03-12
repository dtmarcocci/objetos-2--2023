package service;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

import domain.TiempoRecord;

public class Printer {

	public static void longFormat(TiempoRecord time) {

		DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("EEEE d ", Locale.getDefault());
		DateTimeFormatter monthFormat = DateTimeFormatter.ofPattern("MMMM", Locale.getDefault());
		DateTimeFormatter yearFormat = DateTimeFormatter.ofPattern("YYYY", Locale.getDefault());
		System.out.println(time.today().format(dayFormat) + " de " + time.today().format(monthFormat) + " de "
				+ time.today().format(yearFormat));

	}

	public static void shortFormat(TiempoRecord time) {

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());

		System.out.println(time.today().format(dateFormat));

	}

}
