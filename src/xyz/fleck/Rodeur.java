package xyz.fleck;

public class Rodeur extends Joueur {

    public Rodeur(int numJoueur) {
        super(numJoueur);
    }

    @Override
    protected void jouer(int choix) {
        switch (choix) {
            case 1:
                adversaire.enleverVie(this.agilite);
                System.out.println(nom + " utilise Tir à l'Arc et inflige " + this.agilite + " de dégâts");
                break;
            case 2:
                break;
            default:
                break;
        }
        this.adversaire.activeJoueur();
    }

    public String toString() {
        return "Chuuuuut ! Je suis le Rôdeur, " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + force + " de force.";
    }
}
