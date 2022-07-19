package exercici1;

public class Motociclisme extends Noticia {
	private String equip;

	public Motociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	@Override
	public String toString() {
		return "Motociclisme [Titular= " + super.getTitular() + ", equip=" + equip + "]";
	}

	@Override
	public void preuNoticia() {
		int preu = 100;

		if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha"))
			preu = preu + 50;

		super.setPreu(preu);
	}

	@Override
	public void puntuacioNoticia() {
		int puntuacio = 3;

		if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha"))
			puntuacio = puntuacio + 3;

		super.setPuntuacio(puntuacio);
	}

}
