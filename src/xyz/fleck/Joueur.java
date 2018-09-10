package xyz.fleck;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * classe Joueur
 * 
 * @author flkoliv
 * @version 1.0
 */
public abstract class Joueur {

    protected String nom;
    protected int niveau, vie, force, agilite, intelligence;
    protected Joueur adversaire;

    /**
    *Constructeur du Joueur
    * @param numJoueur
    *           numéro du joueur 
    */
    Joueur(int numJoueur) {
        nom = "Joueur " + numJoueur;
        boolean caracteristiquesCorrectes;
        do {
            caracteristiquesCorrectes = setCaracteristiques();
        } while (!caracteristiquesCorrectes); // si les caractéristiques du joueur ne sont pas bonne, relance la boucle
        vie = niveau * 5;
        System.out.println(this.toString());
    }

    
    /**
    * attribut les caractéristiques du joueur et vérifie leur conformité
    * 
    * @return  conforme à la règle "force + agilite + intelligence == niveau"
    */
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

    /**
     * début du tour du joueur. Vérifie qu'il a encore de la vie pour jouer sinon fin du jeu
     */
    public void activeJoueur() {
        int choix;
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

    /**
     * pour enlever des points de vie à l'adversaire
     * @param pointsAEnlever
     *          nombre de points à enlever
     */
    protected void enleverVie(int pointsAEnlever) {
        vie = vie - pointsAEnlever;
    }

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur
     * @param choix
     *      choix de l'action
     * @see Mage#jouer(int)
     * @see Guerrier#jouer(int)
     * @see Rodeur#jouer(int)
     */
    protected abstract void jouer(int choix);

    /**
     * désigne l'adversaire du joueur
     * @param adversaire
     *      Joueur à désigner comme adversaire
     */
    public void setAdversaire(Joueur adversaire) {
        this.adversaire = adversaire;
    }

    /**
     * Effectue une demande et retourne la réponse
     * @param str
     *      la demande à faire
     * @return le choix fait par l'utilisateur
     */
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

    /**
     * retourne la description du joueur
     * @return description
     */
    public abstract String toString();
}
