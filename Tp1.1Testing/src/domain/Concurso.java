package domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Concurso {
	private LocalDate initialDate;
	private LocalDate finishDate;
	private List<Participante> participantes;
	public static final int FIRST_DAY_INSCRIPTION_POINTS = 10;

	public Concurso(LocalDate initialDate, LocalDate finishDate, List<Participante> participantes) {

		if (initialDate == null) {
			throw new RuntimeException("La fecha de inicio no puede estar vacia");
		}
		this.initialDate = initialDate;
		if (finishDate == null) {
			throw new RuntimeException("La fecha de fin no puede estar vacia");
		}
		this.finishDate = finishDate;

		this.participantes = participantes;
	}

	private void isActive() {
		if (initialDate.isAfter(LocalDate.now()) || finishDate.isBefore(LocalDate.now())) {
			throw new RuntimeException("La Campania no esta Vigente");
		}

	}

	public void toSubscribe(Participante participante) {

		this.isActive();
		if (this.initialDate.isEqual(LocalDate.now())) {
			participante.addPoints(FIRST_DAY_INSCRIPTION_POINTS);
		}
		this.participantes.add(participante);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concurso other = (Concurso) obj;
		return finishDate.isEqual(other.finishDate) && initialDate.isEqual(other.initialDate);
	}

}
