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
		return "Basquet [competicio=" + competicio + ", club=" + club + "]";
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
