package fr.m2i.WoW;

import java.util.Random;

class Mage extends Personnage implements Berseker, Healer{
    public Mage(String race, String nom, int ptnVie, int ptnMana) {
        super(race, nom, ptnVie, ptnMana);
    }
    @Override
    public void attaquer(Personnage p) {
        if (!aAssezDeMana(15)) {
            System.out.println(nom + " n'a pas assez de mana pour attaquer !");
            return;
        }
        Random rand = new Random();
        int degats = rand.nextInt(10) + 5;
        p.ptnVie -= degats;
        this.ptnMana -= 15;
        System.out.println(nom + " lance un sort sur " + p.nom + " et lui inflige " + degats + " points de dégâts !");
    }
    @Override
    public void soigner(Personnage p) {
        Random rand = new Random();
        int mana = rand.nextInt(20) + 10;
        ptnMana += mana;
        System.out.println(nom + " récupère " + mana + " points de mana !");
    }
}
