package es.oesia.logs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GestorFichero {

	private static final Logger milogger = LogManager.getLogger(GestorFichero.class);

	public static void leerFichero(String fichero) throws IOException {

		milogger.trace("estamos aqui");
		milogger.debug("nombre del fichero" + fichero);
		milogger.warn("el fichero tiene que existir" + fichero, fichero);

		try {
			milogger.info("estamos leyendo el fichero");

			List<String> lineas = Files.readAllLines(Paths.get(fichero));

			for (String linea : lineas) {
				milogger.info("estamos leyendo una linea");
				System.out.println(linea);
				milogger.info("estamos acabando de leer una linea");
			}
		} catch (IOException e) {
			// que he capturado la excepcion pero no la he vuelto a lanzar p
			// para que el programa main funcione

			milogger.error(" se ha producido un error", e);
			throw e;
		}
	}
}
