package exercici1;

public class Tenis extends Noticia {
	private String competicio;
	private String tenista;
	
	public Tenis(String titular, String competicio, String tenista) {
		super(titular);
		this.competicio = competicio;
		this.tenista = tenista;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getTenista() {
		return tenista;
	}

	public void setTenista(String tenista) {
		this.tenista = tenista;
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
