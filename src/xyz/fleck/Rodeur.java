package xyz.fleck;

public class Rodeur extends Joueur {

    public Rodeur(int numJoueur) {
        super(numJoueur);
    }

    @Override
    protected void jouer(int choix) {
        switch (choix) {
            case 1:
                adversaire.enleverVie(agilite);
                System.out.println(nom + " utilise Tir à l'Arc et inflige " + agilite + " de dégâts");
                break;
            case 2:
                agilite = agilite + (niveau / 2);
                System.out.println(nom + " utilise Concentration et gagne " + (niveau / 2) + " d'agilité");

                break;
            default:
                break;
        }
        this.adversaire.activeJoueur();
    }

    public String toString() {
        return "Chuuuuut ! Je suis le Rôdeur, " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence.";
    }
}
