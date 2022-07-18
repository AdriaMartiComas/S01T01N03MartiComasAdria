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
		return "Motociclisme [equip=" + equip + "]";
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
