package es.oesia.logs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Principal2 {

	public static void main(String[] args) {

		
		
		leerFichero();
	
	}

	private static void leerFichero() {
		
		Logger milogger= LogManager.getLogger("milogger");
		
		try {
			List<String> lineas = Files.readAllLines(Paths.get("mifichero2.txt"));

			for (String linea : lineas) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			
			milogger.error("se ha producido un error" ,e);
		}
	}

}
