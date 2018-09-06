package xyz.fleck;

import java.util.Scanner;

public abstract class Joueur {

    protected String nom;
    protected int niveau, vie, force, agilite, intelligence;
    private Joueur adversaire;


    Joueur(int numJoueur) {
        nom = "Joueur " + numJoueur;
        Scanner sc = new Scanner(System.in);
        System.out.println("Niveau du personnage ?");
        niveau = sc.nextInt();
        System.out.println("Force du personnage ?");
        force = sc.nextInt();
        System.out.println("Agilité du personnage ?");
        agilite = sc.nextInt();
        System.out.println("Intelligence du personnage ?");
        intelligence = sc.nextInt();
        System.out.println(this.toString());
    }


    void activeJoueur() {
        if (vie > 0) {
            this.jouer();
        } else {
            System.out.println("Le joueur à perdu !");
        }
    }

    public void enleverVie(int pointsAEnlever) {

    }

    private void jouer() {

    }

    void setAdversaire(Joueur adversaire) {
        this.adversaire = adversaire;
    }

    public abstract String toString();
}
