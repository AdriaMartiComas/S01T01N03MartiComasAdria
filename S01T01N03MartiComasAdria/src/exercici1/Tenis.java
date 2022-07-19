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
	public String toString() {
		return "Tenis [Titular= " + super.getTitular() + ", competicio=" + competicio + ", tenista=" + tenista + "]";
	}

	@Override
	public void preuNoticia() {
		int preu = 150;

		if (this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal")
				|| this.tenista.equalsIgnoreCase("Djokovic"))
			preu = preu + 100;

		super.setPreu(preu);
	}

	@Override
	public void puntuacioNoticia() {
		int puntuacio = 4;

		if (this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Nadal")
				|| this.tenista.equalsIgnoreCase("Djokovic"))
			puntuacio = puntuacio + 3;
		super.setPuntuacio(puntuacio);
	}

}
