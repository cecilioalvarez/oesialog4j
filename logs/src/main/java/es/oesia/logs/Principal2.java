package es.oesia.logs;



import java.util.List;

import es.oesia.app1.models.Persona;
import es.oesia.app1.repositories.PersonaRepository;
import es.oesia.app1.services.PersonaServices;

public class Principal2 {

	public static void main(String[] args) {

		
		PersonaRepository repo= new PersonaRepository();
		PersonaServices servicio= new PersonaServices(repo);
		List<Persona> lista= servicio.buscarTodos();
		
		lista.forEach(System.out::println);
		
	}

}
