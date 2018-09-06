package xyz.fleck;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Niveau du personnage ?");
        niveau = sc.nextInt();
        System.out.println("Force du personnage ?");
        force = sc.nextInt();
        System.out.println("Agilité du personnage ?");
        agilite = sc.nextInt();
        System.out.println("Intelligence du personnage ?");
        intelligence = sc.nextInt();
        if (force + agilite + intelligence == niveau) {
            return true;
        } else {
            System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
            return false;
        }
    }

    public void activeJoueur() {
        Scanner sc = new Scanner(System.in);
        int choix;
        if (vie > 0) {
            System.out.println(nom + " (" + vie + " vitalité), veuillez choisir votre action (1 : attaque basique, 2 : attaque spéciale)");
            choix = sc.nextInt();
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

    public abstract String toString();
}
