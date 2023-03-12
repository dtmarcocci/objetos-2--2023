package service;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

import domain.Tiempo;

public class Printer {

	public static void longFormat(Tiempo time) {

		DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("EEEE d ", Locale.getDefault());
		DateTimeFormatter monthFormat = DateTimeFormatter.ofPattern("MMMM", Locale.getDefault());
		DateTimeFormatter yearFormat = DateTimeFormatter.ofPattern("YYYY", Locale.getDefault());
		System.out.println(time.getToday().format(dayFormat) + " de " + time.getToday().format(monthFormat) + " de " + time.getToday().format(yearFormat));

	}
	
	public static void shortFormat(Tiempo time) {

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
		
		System.out.println(time.getToday().format(dateFormat));

	}

}
