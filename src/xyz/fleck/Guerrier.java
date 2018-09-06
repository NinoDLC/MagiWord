package xyz.fleck;

public class Guerrier extends Joueur {

    public Guerrier(int numJoueur) {
        super(numJoueur);

    }

    @Override
    protected void jouer(int choix) {
        switch (choix) {
            case 1:
                adversaire.enleverVie(this.force);
                System.out.println(nom + " utilise Coup d'épée et inflige " + this.force + " de dégâts");
                break;
            case 2:
                adversaire.enleverVie((this.force * 2));
                vie = vie - force / 2;
                System.out.println(nom + " utilise Coup de rage, inflige " + (this.force * 2) + " de dégâts et perd " + (force / 2) + " de vitalité");
                break;
            default:
                break;
        }
        if (vie > 0) {
            this.adversaire.activeJoueur();
        } else {
            System.out.println("Le " + nom + " à perdu !");
        }
    }

    public String toString() {
        return "Waourg ! Je suis le Guerrier " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + force + " de force.";
    }
}
