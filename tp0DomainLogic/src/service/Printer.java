package service;

import domain.Tiempo;

public class Printer {

	public static void longFormat(Tiempo time) {
		System.out.println(time.transformLongFormat());
	}

	public static void shortFormat(Tiempo time) {
		System.out.println(time.transformShortFormat(time));
	}

}
