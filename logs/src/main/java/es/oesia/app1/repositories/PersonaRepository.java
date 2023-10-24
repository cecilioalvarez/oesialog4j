package es.oesia.app1.repositories;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.oesia.app1.models.Persona;

public class PersonaRepository {

	private static final Logger milogger = LogManager.getLogger(PersonaRepository.class);
	
	static {
		
		System.out.println("nombre del logger"+milogger.getName());
	}
	
	public List<Persona> buscarTodos() {
		
		milogger.info("entramos en buscar todos");
		
		List<Persona> lista= List.of(new Persona ("pepe",20),new Persona("ana",30));
		
		milogger.warn("la lista no puede ser tan corta");
		
		try {
			if (lista.size()<3) {
				
				throw new RuntimeException("error grave en la lista");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			milogger.error("la lista no es la adecuada",e);
			throw e;
		}
		milogger.info("salimos en buscar todos");
		return lista;
	}
}
