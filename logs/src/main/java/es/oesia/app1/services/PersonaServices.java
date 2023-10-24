package es.oesia.app1.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.oesia.app1.models.Persona;
import es.oesia.app1.repositories.PersonaRepository;

public class PersonaServices {

	
	private static final Logger milogger = LogManager.getLogger(PersonaServices.class);

	
	private PersonaRepository personaRepo;
	

	public PersonaServices(PersonaRepository personaRepo) {
		super();
		this.personaRepo = personaRepo;
	}



	public List<Persona> buscarTodos() {
		
		milogger.info("entramos en buscar todos para añadir items");
		milogger.info("entramos ya estamos en la lista");
		milogger.info("entramos vamos a crear el array");
		List<Persona> personas=new ArrayList<>();
		personas.add(new Persona ("juan",20));
		try {
			personas.addAll(personaRepo.buscarTodos());
			personas.addAll(personaRepo.buscarTodos());
			personas.addAll(personaRepo.buscarTodos());
		} catch (Exception e) {
		
		}
		milogger.info("salimos en buscar todos para añadir items");
		milogger.info("salimos estamos por salir que salimos");
		milogger.info("salimos salimos del todo");
		return personas;
	}
	
	
	
}
