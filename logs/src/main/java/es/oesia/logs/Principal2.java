package es.oesia.logs;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.oesia.app1.models.Persona;
import es.oesia.app1.repositories.PersonaRepository;
import es.oesia.app1.services.PersonaServices;

public class Principal2 {

	private static final Logger milogger = LogManager.getLogger(Principal2.class);

	public static void main(String[] args) {

		for (int i = 0; i < 300; i++) {

			milogger.info("app principal");
		}

		PersonaRepository repo = new PersonaRepository();
		PersonaServices servicio = new PersonaServices(repo);
		List<Persona> lista = servicio.buscarTodos();

		for (int i = 0; i < 300; i++) {

			milogger.info("app principal");
		}
		lista.forEach(System.out::println);
		for (int i = 0; i < 10; i++) {

			milogger.info("app principal");
		}
	}

}
