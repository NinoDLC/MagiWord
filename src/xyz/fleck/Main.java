package xyz.fleck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numJoueur = 1;
        Joueur joueur1 = creerJoueur(numJoueur);
        numJoueur++;
        Joueur joueur2 = creerJoueur(numJoueur);
        joueur1.setAdversaire(joueur2);
        joueur2.setAdversaire(joueur1);
        joueur1.activeJoueur();
    }

    private static Joueur creerJoueur(int numJoueur) {
        Scanner sc = new Scanner(System.in);
        Joueur j;
        int choix;
        System.out.println("Création du personnage du Joueur " + numJoueur);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                j = new Guerrier(numJoueur);
                break;
            case 2:
                j = new Rodeur(numJoueur);
                break;
            case 3:
                j = new Mage(numJoueur);
                break;
            default:
                j = new Mage(numJoueur);
                break;
        }
        return j;
    }

}
