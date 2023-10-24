package es.oesia.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Principal {

	public static void main(String[] args) {

		//tenemos un logger raiz en el cual hay una configuracion
		//por defecto
		
		Logger milogger= LogManager.getLogger("milogger");
		milogger.trace("hola soy una traza");
		milogger.debug("hola soy un mensaje de debug");
		milogger.info("hola soy un mensaje de info");
		
		milogger.warn("hola soy un mensaje de warn");
		milogger.error("hola soy un mensaje de error");
		milogger.fatal("hola soy un mensaje de fatal");
		

	}

}
