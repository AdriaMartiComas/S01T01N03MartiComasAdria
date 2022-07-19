package exercici1;

public class Basquet extends Noticia {
	private String competicio;
	private String club;

	public Basquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
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

	@Override
	public String toString() {
		return "Basquet [Titular= " + super.getTitular() + ", competicio=" + competicio + ", club=" + club + "]";
	}

	@Override
	public void preuNoticia() {
		int preu = 250;
		if (this.competicio.equalsIgnoreCase("Eurolliga"))
			preu = preu + 75;

		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))
			preu = preu + 100;

		super.setPreu(preu);
	}

	@Override
	public void puntuacioNoticia() {
		int puntuacio = 4;

		if (this.competicio.equalsIgnoreCase("Eurolliga"))
			puntuacio = puntuacio + 3;

		if (this.competicio.equalsIgnoreCase("ACB"))
			puntuacio = puntuacio + 2;

		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid"))
			puntuacio = puntuacio + 1;

		super.setPuntuacio(puntuacio);

	}

}
