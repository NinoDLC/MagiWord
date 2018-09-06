package xyz.fleck;

public class Mage extends Joueur {

    private int vieMax;

    public Mage(int numJoueur) {
        super(numJoueur);
        vieMax = vie;
    }

    @Override
    protected void jouer(int choix) {
        switch (choix) {
            case 1:
                adversaire.enleverVie(this.intelligence);
                System.out.println(nom + " utilise boule de feu et inflige " + this.intelligence + " de dégâts");
                break;
            case 2:
                //Soin
                System.out.print(nom + " utilise Soin et gagne ");
                if ((intelligence * 2) + vie > vieMax) {
                    System.out.println((vieMax - vie) + " de vitalité");
                    vie = vieMax;
                } else {
                    System.out.println((intelligence * 2) + " de vitalité");
                    vie = vie + (intelligence * 2);
                }
                break;
            default:
                break;
        }
        this.adversaire.activeJoueur();
    }

    public String toString() {
        return "Abracadabra ! Je suis le Mage " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + force + " de force.";
    }
}
