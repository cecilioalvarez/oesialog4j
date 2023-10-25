package es.oesia.logs;

import java.io.IOException;

public class Principal3 {

	public static void main(String[] args) throws InterruptedException {

		try {
			for (int i = 0; i < 200; i++) {
				Thread.sleep(100);
				GestorFichero.leerFichero("mifichero.txt");
			}
			try {
				GestorFichero.leerFichero("mifichero2.txt");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			for (int i = 0; i < 200; i++) {
				Thread.sleep(100);
				GestorFichero.leerFichero("mifichero.txt");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
