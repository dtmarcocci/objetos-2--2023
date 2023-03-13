package domain;

import java.util.List;

public class Participante {

	private int puntos;
	private List<Concurso> concursos;

	public Participante(int puntos, List<Concurso> concursos) {

		this.puntos = puntos;
		this.concursos = concursos;

	}

	public void addPoints(int puntos) {
		this.puntos = this.puntos + puntos;
	}

	public void contestsSignIn(Concurso concurso) {
		concurso.toSubscribe(this);
		this.concursos.add(concurso);
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public boolean iscontestSignIn(Concurso concurso) {
		return this.concursos.contains(concurso);
	}

}
