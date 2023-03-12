package domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {

	LocalDate today;

	public Tiempo(LocalDate today) {
		super();
		this.today = today;
	}

	public String transformLongFormat() {
		StringBuffer date = new StringBuffer("");
		DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("EEEE d ", Locale.getDefault());
		date.append(today.format(dayFormat));
		date.append(" de ");
		DateTimeFormatter monthFormat = DateTimeFormatter.ofPattern("MMMM", Locale.getDefault());
		date.append(today.format(monthFormat));
		date.append(" de ");
		DateTimeFormatter yearFormat = DateTimeFormatter.ofPattern("YYYY", Locale.getDefault());
		date.append(today.format(yearFormat));
		return date.toString();

	}

	public String transformShortFormat(Tiempo time) {
		StringBuffer date = new StringBuffer("");
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
		date.append(today.format(dateFormat));
		return date.toString();

	}

}
