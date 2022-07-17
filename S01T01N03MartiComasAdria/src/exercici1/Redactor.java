package exercici1;

import java.util.ArrayList;

public class Redactor {
	private String nom;
	private String dni;
	private static float sou = 1500;
	private ArrayList<Noticia> noticies;
	
	public Redactor(String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
		this.noticies = new ArrayList<Noticia>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static float getSou() {
		return sou;
	}

	public static void setSou(float sou) {
		Redactor.sou = sou;
	}

	public String getDni() {
		return dni;
	}
	
	public ArrayList<Noticia> getNoticies() {
		return noticies;
	}

	public void setCuentas(ArrayList<Noticia> noticies) {
		this.noticies = noticies;
	}

	@Override
	public String toString() {
		return "Redactor [nom=" + nom + ", dni=" + dni + "]";
	}
	
	
	

	
}
