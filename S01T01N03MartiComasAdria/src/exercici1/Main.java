package exercici1;

import java.util.Scanner;

/*
 * A la classe principal s’ha de fer un menú amb les següents opcions:

1.- Introduir redactor.

2.- Eliminar redactor.

3.- Introduir notícia a un redactor.

4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).

5.- Mostrar totes les notícies per redactor.

6.- Calcular puntuació de la notícia.

7.- Calcular preu-notícia.
 * 
 */

public class Main {

	public static void main(String[] args) {
		boolean sortir = false;
		
		do {
			switch (menu()) {
			case 0:
				System.out.println("Gracies per utilitzar l'aplicació");
				sortir = true;
				break;
			case 1:
//				introduirRedactor(redactors);
				break;
			case 2:
//				eliminarRedactor(redactors);
				break;
			case 3:
//				introduirNoticiaRedactor(redactors);
				break;
			case 4:
//				eliminarNoticia(); // ha de demanar redactor i titular de la notícia
				break;
			case 5: 
//				mostrarNoticiesRedactor(redactors);
				break;
			case 6:
//				puntuacioNoticia();
				break;
			case 7:
//				preuNoticia();

			}
		} while (!sortir);
	}

	private static int menu() {
		Scanner entrada = new Scanner(System.in);
		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 7;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Introduir redactor ");
			System.out.println("2. Eliminar redactor ");
			System.out.println("3. Introduir notícia a un redactor ");
			System.out.println("4. Eliminar notícia");
			System.out.println("5. Mostrar totes les notícies per redactor");
			System.out.println("6. Calcular puntuació de la notícia");
			System.out.println("7. Calcular preu-notícia");
			
			
			System.out.println("0. Sortir de l'aplicacio");

			opcio = entrada.nextByte();
			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escull una opció vàlida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);
		
//		entrada.close();
		return opcio;
	}

}
