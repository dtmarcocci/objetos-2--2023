package domain;

import java.time.LocalDate;

public class Tiempo {

	LocalDate today ;
	
	
	
	public Tiempo(LocalDate today) {
		super();
		this.today = today;
	}



	public LocalDate getToday() {
		return today;
	}

}
