package xyz.fleck;

public class Guerrier extends Joueur {

    public Guerrier(int numJoueur) {
        super(numJoueur);

    }

    public String toString() {
        return "Waourg ! Je suis le Guerrier " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + force + " de force.";
    }
}
