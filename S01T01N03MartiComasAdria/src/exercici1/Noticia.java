package exercici1;

public abstract class Noticia {
	private String titular;
	private String text = "";
	private int puntuacio;
	private float preu;
	
	public Noticia(String titular) {
		this.titular = titular;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public String getTitular() {
		return titular;
	}

	@Override
	public String toString() {
		return "Noticia [titular=" + titular + ", text=" + text + ", puntuacio=" + puntuacio + ", preu=" + preu + "]";
	}
	
	public abstract void preuNoticia(); 
	
	public abstract void puntuacioNoticia();
	
	
	

}
