package xyz.fleck;

import java.util.InputMismatchException;
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
        int choix = 0;
        boolean choixCorrect;
        do {
            System.out.println("Création du personnage du Joueur " + numJoueur);
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            try {
                choixCorrect = true;
                choix = sc.nextInt();
                if (!(choix > 0 && choix < 4)) {
                    System.out.println("Entrez une valeur correcte !");
                    choixCorrect = false;
                }
            } catch (InputMismatchException e) {
                sc.next();
                choixCorrect = false;
                System.out.println("Entrez une valeur correcte !");
            }
        } while (!choixCorrect);
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
