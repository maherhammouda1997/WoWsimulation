package fr.m2i.WoW;

import java.util.Random;

class Soigneur extends Personnage implements Healer {
    public Soigneur(String race, String nom, int ptnVie, int ptnMana) {
        super(race, nom, ptnVie, ptnMana);
    }

    @Override
    public void soigner(Personnage p) {
    	
    	
        if (!aAssezDeMana(20)) {
            System.out.println(nom + " n'a pas assez de mana pour soigner !");
            return;
        }
        Random rand = new Random();
        int soins = rand.nextInt(20) + 10;
        p.ptnVie += soins;
        this.ptnMana -= 20;
        System.out.println(nom + " soigne " + p.nom + " et lui rend " + soins + " points de vie !");
    }
}
