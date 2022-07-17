package exercici1;

import java.util.ArrayList;
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
		ArrayList<Redactor> llistaRedactors = new ArrayList<Redactor>();

		// Proves
		llistaRedactors.add(new Redactor("Adria", "47943391Y"));

		do {
			switch (menu()) {
			case 0:
				System.out.println("Gracies per utilitzar l'aplicació");
				sortir = true;
				break;
			case 1:
				introduirRedactor(llistaRedactors);
				break;
			case 2:
				eliminarRedactor(llistaRedactors);
				break;
			case 3:
				introduirNoticiaRedactor(llistaRedactors);
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

	private static void introduirNoticiaRedactor(ArrayList<Redactor> llistaRedactors) {
		boolean sortir = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("\nINTRODUIR NOTÍCIA A UN REDACTOR");
		System.out.println("Introdueix el DNI del redactor:");
		String dni = sc.nextLine();

		Redactor redactorBuscat = buscarRedactor(llistaRedactors, dni);
		if (redactorBuscat == null) {
			System.out.println("El redactor que busques no existeix");
			sortir = true;
		}
		
		

		while (!sortir) {
			switch (menuNoticies()) {
			case 0:
				sortir = true;
				break;
			case 1:
				//FUTBOL
				noticiaFutbol(redactorBuscat.getNoticies());
				break;
			case 2:
				//BASQUET
				//quina competició fa referència(String) i a quin club(String).
				noticiaBasquet(redactorBuscat.getNoticies());


				break;
			case 3:
				//TENIS
				//competició(String) parlen i de quins tenistes(String).
				break;
			case 4:
				//FORMULA 1
				// escuderia(String) fan referència.


				break;
			case 5:
				//MOTOCICLISME
				//de quin equip(String) són.

				break;

			}
		}

	}

	private static void noticiaBasquet(ArrayList<Noticia> noticies) {
		// TODO Auto-generated method stub
		
	}

	private static void noticiaFutbol(ArrayList<Noticia> noticies) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introdueix el titular de la noticia: ");
		String titular = sc.nextLine();
		System.out.print("Introdueix la competicó: ");
		String competicio = sc.nextLine();
		System.out.print("Introdueix el club: ");
		String club = sc.nextLine();
		System.out.print("Introdueix el nom del jugador: ");
		String jugador = sc.nextLine();
		
		noticies.add(new Futbol(titular, competicio, club, jugador));
		System.out.println("S'ha introduit la noticia correctament");
		System.out.println(noticies);

	}

	private static void eliminarRedactor(ArrayList<Redactor> llistaRedactors) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nELIMINAR REDACTOR");
		System.out.println("Introdueix el DNI:");
		String dni = sc.nextLine();

		Redactor redactorBuscat = buscarRedactor(llistaRedactors, dni);
		if (redactorBuscat == null) {
			System.out.println("El redactor que vols eliminar no existeix");
		} else {
			System.out.println("El redactor: " + redactorBuscat.getNom() + " amb DNI: " + dni + ", a estat eliminat.");
			llistaRedactors.remove(redactorBuscat);
		}
	}

	public static void introduirRedactor(ArrayList<Redactor> llistaRedactors) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nINTRODUIR REDACTOR");
		System.out.println("Introdueix el DNI:");
		String dni = sc.nextLine();
		// buscar redactor per dni
		if (buscarRedactor(llistaRedactors, dni) == null) {
			System.out.println("Introdueox el nom:");
			String nom = sc.nextLine();
			llistaRedactors.add(new Redactor(nom, dni));
			System.out.println("El redactor: " + nom + " amb DNI: " + dni + ", a estat introduit.");
		} else {
			System.out.println("El redactor que vols intoduir ja existeix");
		}

	}

	public static Redactor buscarRedactor(ArrayList<Redactor> list, String dni) {
		Redactor redactor = null;
		boolean trovat = false;
		int size = list.size(), i = 0;

		while (!trovat && i < size) {
			if (list.get(i).getDni().equalsIgnoreCase(dni)) {
				trovat = true;
				redactor = list.get(i);
			}

			i++;
		}

		return redactor;
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

	private static int menuNoticies() {
		Scanner entrada = new Scanner(System.in);
		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("\nTIPUS DE NOTICIA");
			System.out.println("1. Futbol");
			System.out.println("2. Bàsquet");
			System.out.println("3. Tenis");
			System.out.println("4. Formula 1");
			System.out.println("5. Motociclisme");

			System.out.println("0. Enrere");

			opcio = entrada.nextByte();
			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escull una opció vàlida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);

//		entrada.close();
		return opcio;
	}

}
