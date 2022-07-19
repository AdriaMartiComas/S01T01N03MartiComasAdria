package exercici1;

public class Formula1 extends Noticia {
	private String escuderia;

	public Formula1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	@Override
	public String toString() {
		return "Formula1 [Titular= " + super.getTitular() + ", escuderia=" + escuderia + "]";
	}

	@Override
	public void preuNoticia() {
		int preu = 100;

		if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes"))
			preu = preu + 50;

		super.setPreu(preu);
	}

	@Override
	public void puntuacioNoticia() {
		int puntuacio = 4;

		if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes"))
			puntuacio = puntuacio + 2;

		super.setPuntuacio(puntuacio);
	}

}
