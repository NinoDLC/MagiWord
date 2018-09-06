package xyz.fleck;

public class Rodeur extends Joueur {

    public Rodeur(int numJoueur) {
        super(numJoueur);
    }

    public String toString() {
        return "Chuuuuut ! Je suis le Rôdeur, " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + force + " de force.";
    }
}
