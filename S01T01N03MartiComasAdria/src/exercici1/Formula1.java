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
		return "Formula1 [escuderia=" + escuderia + "]";
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
