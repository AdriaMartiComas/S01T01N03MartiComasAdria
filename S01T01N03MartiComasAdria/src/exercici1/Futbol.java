package exercici1;

public class Futbol extends Noticia {
	private String competicio;
	private String club;
	private String jugador;

	public Futbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return "Futbol [Titular= " + super.getTitular() + ", competicio=" + competicio + ", club=" + club + ", jugador="
				+ jugador + "]";
	}

	@Override
	public void preuNoticia() {
		int preu = 300;
		if (this.competicio.equalsIgnoreCase("Lliga de Campions"))
			preu = preu + 100;

		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))
			preu = preu + 100;

		if (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema"))
			preu = preu + 50;

		super.setPreu(preu);
	}

	@Override
	public void puntuacioNoticia() {
		int puntuacio = 5;

		if (this.competicio.equalsIgnoreCase("Lliga de Campions"))
			puntuacio = puntuacio + 3;

		if (this.competicio.equalsIgnoreCase("Lliga"))
			puntuacio = puntuacio + 2;

		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))
			puntuacio = puntuacio + 1;

		if (this.jugador.equalsIgnoreCase("Ferran Torres") || this.jugador.equalsIgnoreCase("Benzema"))
			puntuacio = puntuacio + 1;

		super.setPuntuacio(puntuacio);

	}

}
