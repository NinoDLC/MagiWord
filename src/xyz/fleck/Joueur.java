package xyz.fleck;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Joueur {

    protected String nom;
    protected int niveau, vie, force, agilite, intelligence;
    protected Joueur adversaire;


    Joueur(int numJoueur) {
        nom = "Joueur " + numJoueur;
        boolean caracteristiquesCorrectes;
        do {
            caracteristiquesCorrectes = setCaracteristiques();
        } while (!caracteristiquesCorrectes);
        vie = niveau * 5;
        System.out.println(this.toString());
    }

    private boolean setCaracteristiques() {
        niveau = demande("Niveau du personnage ?");
        force = demande("Force du personnage ?");
        agilite = demande("Agilité du personnage ?");
        intelligence = demande("Intelligence du personnage ?");
        if (force + agilite + intelligence == niveau) {
            return true;
        } else {
            System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
            return false;
        }
    }

    public void activeJoueur() {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        if (vie > 0) {
            do {
                choix = demande(nom + " (" + vie + " vitalité), veuillez choisir votre action (1 : attaque basique, 2 : attaque spéciale)");
                if (choix != 1 && choix != 2) System.out.println("Entrez une valeur correcte !");
            } while (choix != 1 && choix != 2);

            this.jouer(choix);
        } else {
            System.out.println("Le " + nom + " à perdu !");
        }
    }

    protected void enleverVie(int pointsAEnlever) {
        vie = vie - pointsAEnlever;
    }

    protected abstract void jouer(int choix);

    public void setAdversaire(Joueur adversaire) {
        this.adversaire = adversaire;
    }

    private int demande(String str) {
        int choix = 0;
        boolean choixCorrect;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(str);
            try {
                choixCorrect = true;
                choix = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                choixCorrect = false;
                System.out.println("Entrez une valeur correcte !");
            }
        } while (!choixCorrect);
        return choix;
    }

    public abstract String toString();
}
