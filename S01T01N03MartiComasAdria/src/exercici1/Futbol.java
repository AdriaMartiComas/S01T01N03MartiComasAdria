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
		return "Futbol [competicio=" + competicio + ", club=" + club + ", jugador=" + jugador + "]";
	}

	@Override
	public void preuNoticia() {
		// TODO Auto-generated method stub

	}

	@Override
	public void puntuacioNoticia() {
		// TODO Auto-generated method stub

	}

}
