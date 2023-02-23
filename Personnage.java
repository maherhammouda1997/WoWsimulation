package fr.m2i.WoW;

public class Personnage {


    protected String race;
    protected String nom;
    protected int ptnVie;
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
