package fr.m2i.WoW;

import java.util.Random;

class Guerrier extends Personnage implements Berseker {
	public Guerrier(String race, String nom, int ptnVie, int ptnMana) {
		super(race, nom, ptnVie, ptnMana);
	}

	@Override
	public void attaquer(Personnage p) throws AttackException {

		if (p.ptnVie <= 0) {
			throw new AttackException();
		}

		if (!aAssezDeMana(10)) {
			System.out.println(nom + " n'a pas assez de mana pour attaquer !");
			return;
		}
		Random rand = new Random();
		int degats = rand.nextInt(20) + 10;
		p.ptnVie -= degats;
		this.ptnMana -= 10;
		System.out.println(nom + " attaque " + p.nom + " et lui inflige " + degats + " points de dégâts !");
	}
}
