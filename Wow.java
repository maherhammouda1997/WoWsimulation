package fr.m2i.WoW;

import java.util.Random;

public class Wow {
    public static void main(String[] args) {
        // Création des personnages
        Guerrier guerrier1 = new Guerrier("Humain", "Guerrier1", 50, 50);
        Soigneur soigneur1 = new Soigneur("Elfe", "Soigneur1", 50, 50);
        Mage mage1 = new Mage("Orc", "Mage1", 50, 50);
        Guerrier guerrier2 = new Guerrier("Nain", "Guerrier2", 50, 50);
        Mage mage2 = new Mage("Elfe", "Mage2", 50, 50);
        
     // Combat aléatoire
        Random rand = new Random();
        Personnage attaquant = null;
        Personnage defenseur = null;
        int tour = 1;

        while (true) {
        	// Sélection aléatoire de l'attaquant et du défenseur
        	if (attaquant == null) {
        	int indexAttaquant = rand.nextInt(5);
        	switch (indexAttaquant) {
        	case 0:
        	attaquant = guerrier1;
        	break;
        	case 1:
        	attaquant = soigneur1;
        	break;
        	case 2:
        	attaquant = mage1;
        	break;
        	case 3:
        	attaquant = guerrier2;
        	break;
        	case 4:
        	attaquant = mage2;
        	break;
        	}
        	} else {
        	attaquant = defenseur;
        	}
        	
        	// Sélection aléatoire du défenseur
        	do {
        	    int indexDefenseur = rand.nextInt(5);
        	    switch (indexDefenseur) {
        	        case 0:
        	            defenseur = guerrier1;
        	            break;
        	        case 1:
        	            defenseur = soigneur1;
        	            break;
        	        case 2:
        	            defenseur = mage1;
        	            break;
        	        case 3:
        	            defenseur = guerrier2;
        	            break;
        	        case 4:
        	            defenseur = mage2;
        	            break;
        	    }
        	} while (defenseur.nom.equals(attaquant.nom));

        	// L'attaquant effectue une action
        	if (attaquant instanceof Guerrier) {
        	    ((Guerrier) attaquant).attaquer(defenseur);
        	} else if (attaquant instanceof Soigneur) {
        	    ((Soigneur) attaquant).soigner(attaquant);
        	} else if (attaquant instanceof Mage) {
        	    ((Mage) attaquant).attaquer(defenseur);
        	    ((Mage) attaquant).soigner(attaquant);
        	}

        	// Vérification de la fin du combat
        	if (defenseur.ptnVie <= 0) {
        	    System.out.println("\n Yooooooohoooooo " + defenseur.nom + " est vaincu !");
        	    break;
        	}

        	// Affichage de l'état du combat
        	System.out.println("\n -- Tour " + tour + " : " + attaquant.nom + " attaque " + defenseur.nom + " !!!!!");
        	System.out.println(defenseur.nom + " a maintenant " + defenseur.ptnVie + " points de vie.");
        	System.out.println(attaquant.nom + " a maintenant " + attaquant.ptnVie + " points de vie et " 
        	+ attaquant.ptnMana + " points de mana.");

        	tour++;
        }
    }
}
        	
        	