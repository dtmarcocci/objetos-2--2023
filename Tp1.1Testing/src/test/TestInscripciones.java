package test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import domain.Concurso;
import domain.Participante;
import service.Inscripciones;

public class TestInscripciones {

	@Test
	public void contestsSignIn() {
		// set up
		Participante participante = new Participante(0, new ArrayList<Concurso>());
		Concurso concurso = new Concurso(LocalDate.now().minusDays(1), LocalDate.of(2023, 5, 13),
				new ArrayList<Participante>());
		boolean valorEsperado = true;
		// exercise
		Inscripciones.contestsSignIn(participante, concurso);
		// verify
		assertEquals(participante.iscontestSignIn(concurso), valorEsperado);

	}

	@Test
	public void contestsSignInFirstDay() {
		// set up
		Participante participante = new Participante(0, new ArrayList<Concurso>());
		Concurso concurso = new Concurso(LocalDate.now(), LocalDate.of(2023, 5, 13), new ArrayList<Participante>());
		int valorEsperados = 10;
		// exercise
		Inscripciones.contestsSignIn(participante, concurso);
		// verify
		assertEquals(participante.getPuntos(), valorEsperados);

	}

	@Test
	public void contestsSignInOutOfRange() {
		// set up
		Participante participante = new Participante(0, new ArrayList<Concurso>());
		Concurso concurso = new Concurso(LocalDate.now().plusDays(1), LocalDate.of(2023, 5, 13),
				new ArrayList<Participante>());
		String valorEsperado = "La Campania no esta Vigente";
		String valorObtenido = "";
		// exercise
		try {
			Inscripciones.contestsSignIn(participante, concurso);
		} catch (RuntimeException ex) {
			valorObtenido = ex.getMessage();
		}
		// verify
		assertEquals(valorObtenido, valorEsperado);

	}
	
	
	/* Respuesta a ¿Los test que escribio funcionan siempre? 
	 * Van a funcionar siempre y cuando el valor obtenido sea igual al valor esperado
	 */

}
