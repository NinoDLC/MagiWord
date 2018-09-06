package xyz.fleck;

public class Mage extends Joueur {

    public Mage(int numJoueur) {
        super(numJoueur);

    }

    public String toString() {
        return "Abracadabra ! Je suis le Mage " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + force + " de force.";
    }
}
