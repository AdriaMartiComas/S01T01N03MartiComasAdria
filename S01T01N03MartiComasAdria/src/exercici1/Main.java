package exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean sortir = false;
		ArrayList<Redactor> llistaRedactors = new ArrayList<Redactor>();

		// Proves
		llistaRedactors.add(new Redactor("Adria", "12345678A"));
		llistaRedactors.add(new Redactor("Eulalia", "01234567B"));
		llistaRedactors.get(0).getNoticies().add(new Motociclisme("Marc guanya a Montmelo", "Honda"));
		llistaRedactors.get(0).getNoticies().add(new Futbol("Final Champions", "Lliga de Campions", "Barça", "Messi"));
		
		llistaRedactors.get(1).getNoticies().add(new Basquet("Pretemporada ACB", "ACB", "Madrid"));
		llistaRedactors.get(1).getNoticies().add(new Tenis("Roland", "Roland garros", "Nadal"));
		llistaRedactors.get(1).getNoticies().add(new Formula1("Premi Montmelo", "Ferrari"));

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
				eliminarNoticiaRedactor(llistaRedactors);
				break;
			case 5:
				mostrarNoticiesRedactor(llistaRedactors);
				break;
			case 6:
				puntuacioNoticia(llistaRedactors);
				break;
			case 7:
				preuNoticia(llistaRedactors);

			}
		} while (!sortir);
	}

	private static void preuNoticia(ArrayList<Redactor> llistaRedactors) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPREU NOTÍCIA");
		System.out.println("Introdueix el titular de la noticia:");
		String titular = sc.nextLine();
		int i = 0, size = llistaRedactors.size();
		boolean trovat = false;
		Noticia noticia = null;

		while (!trovat && i < size) {
			noticia = buscarNoticia(llistaRedactors.get(i).getNoticies(), titular);
			if (noticia != null) {
				trovat = true;
				noticia.preuNoticia();
			}
			i++;
		}
		System.out.println("El preu de la noticia: " + titular + " és de: " + noticia.getPreu() + "€.");

	}

	private static void puntuacioNoticia(ArrayList<Redactor> llistaRedactors) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nPUNTUACIO NOTÍCIA");
		System.out.println("Introdueix el titular de la noticia:");
		String titular = sc.nextLine();
		int i = 0, size = llistaRedactors.size();
		boolean trovat = false;
		Noticia noticia = null;

		while (!trovat && i < size) {
			noticia = buscarNoticia(llistaRedactors.get(i).getNoticies(), titular);
			if (noticia != null) {
				trovat = true;
				noticia.puntuacioNoticia();
			}
			i++;
		}
		System.out.println("La puntuació de la noticia: " + titular + " és de: " + noticia.getPuntuacio() + " punts.");

	}

	private static void mostrarNoticiesRedactor(ArrayList<Redactor> llistaRedactors) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nMOSTRAR NOTÍCIES");
		System.out.println("Introdueix el DNI del redactor:");
		String dni = sc.nextLine();

		Redactor redactorBuscat = buscarRedactor(llistaRedactors, dni);
		if (redactorBuscat == null) {
			System.out.println("El redactor que busques no existeix");

		} else {
			ArrayList<Noticia> noticies = redactorBuscat.getNoticies();

			for (Noticia n : noticies) {
				System.out.println(n);
			}
		}
	}

	private static void eliminarNoticiaRedactor(ArrayList<Redactor> llistaRedactors) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nELIMINAR NOTÍCIA");
		System.out.println("Introdueix el DNI del redactor:");
		String dni = sc.nextLine();

		Redactor redactorBuscat = buscarRedactor(llistaRedactors, dni);
		if (redactorBuscat == null) {
			System.out.println("El redactor que busques no existeix");

		} else {
			ArrayList<Noticia> noticies = redactorBuscat.getNoticies();
			System.out.println("Introdueix el titular de la noticia a eliminar: ");
			String titular = sc.nextLine();

			Noticia noticiaBuscada = buscarNoticia(noticies, titular);

			if (noticiaBuscada == null) {
				System.out.println("La noticia que busques no existeix");

			} else {
				System.out.println("La noticia:\n" + noticiaBuscada + "\nHa estat eliminada correctament.");
				noticies.remove(noticiaBuscada);

			}

		}
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
				// FUTBOL
				noticiaFutbol(redactorBuscat.getNoticies());
				sortir = true;
				break;
			case 2:
				// BASQUET
				noticiaBasquet(redactorBuscat.getNoticies());
				sortir = true;
				break;
			case 3:
				// TENIS
				noticiaTenis(redactorBuscat.getNoticies());
				sortir = true;
				break;
			case 4:
				// FORMULA 1
				noticiaFormula1(redactorBuscat.getNoticies());
				sortir = true;
				break;
			case 5:
				// MOTOCICLISME
				noticiaMotociclisme(redactorBuscat.getNoticies());
				sortir = true;
				break;

			}

		}

	}

	private static void noticiaMotociclisme(ArrayList<Noticia> noticies) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introdueix el titular de la noticia: ");
		String titular = sc.nextLine();
		System.out.print("Introdueix l'equip: ");
		String equip = sc.nextLine();

		noticies.add(new Motociclisme(titular, equip));
		System.out.println("S'ha introduit la noticia correctament");
	}

	private static void noticiaFormula1(ArrayList<Noticia> noticies) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introdueix el titular de la noticia: ");
		String titular = sc.nextLine();
		System.out.print("Introdueix la esquedria: ");
		String esquderia = sc.nextLine();

		noticies.add(new Formula1(titular, esquderia));
		System.out.println("S'ha introduit la noticia correctament");
	}

	private static void noticiaTenis(ArrayList<Noticia> noticies) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introdueix el titular de la noticia: ");
		String titular = sc.nextLine();
		System.out.print("Introdueix la competicó: ");
		String competicio = sc.nextLine();
		System.out.print("Introdueix el tenista: ");
		String tenista = sc.nextLine();

		noticies.add(new Tenis(titular, competicio, tenista));
		System.out.println("S'ha introduit la noticia correctament");
	}

	private static void noticiaBasquet(ArrayList<Noticia> noticies) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introdueix el titular de la noticia: ");
		String titular = sc.nextLine();
		System.out.print("Introdueix la competicó: ");
		String competicio = sc.nextLine();
		System.out.print("Introdueix el club: ");
		String club = sc.nextLine();

		noticies.add(new Basquet(titular, competicio, club));
		System.out.println("S'ha introduit la noticia correctament");
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

		Noticia noticia = new Futbol(titular, competicio, club, jugador);

		noticies.add(noticia);
		System.out.println("S'ha introduit la noticia correctament");

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

	public static Noticia buscarNoticia(ArrayList<Noticia> list, String titular) {
		Noticia noticia = null;
		boolean trovat = false;
		int size = list.size(), i = 0;

		while (!trovat && i < size) {
			if (list.get(i).getTitular().equalsIgnoreCase(titular)) {
				trovat = true;
				noticia = list.get(i);
			}

			i++;
		}

		return noticia;
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
			System.out.println("7. Calcular preu notícia");

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
