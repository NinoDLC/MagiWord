package xyz.fleck;

import java.util.Scanner;

public abstract class Joueur {

    private String nom, classe;
    private int niveau, vie, force, agilite, intelligence;
    private Joueur adversaire;


    Joueur(int numJoueur, String nomClasse) {
        nom = "Joueur " + numJoueur;
        classe = nomClasse;
        Scanner sc = new Scanner(System.in);
        int choix = 0;
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

    public String toString() {
        return "Je suis le " + this.classe + " " + nom;
    }
}
