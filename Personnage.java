package fr.m2i.WoW;

public class Personnage {


    protected String race;
    protected String nom;
    protected int ptnVie;
    public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPtnVie() {
		return ptnVie;
	}

	public void setPtnVie(int ptnVie) {
		this.ptnVie = ptnVie;
	}

	public int getPtnMana() {
		return ptnMana;
	}

	public void setPtnMana(int ptnMana) {
		this.ptnMana = ptnMana;
	}

	protected int ptnMana;

    public Personnage(String race, String nom, int ptnVie, int ptnMana) {
        this.race = race;
        this.nom = nom;
        this.ptnVie = ptnVie;
        this.ptnMana = ptnMana;
    }

    public void cri() {
        System.out.println("Cri de " + nom + " !");
    }

    public boolean aAssezDeMana(int coutMana) {
        return (this.ptnMana >= coutMana);
    }

}
