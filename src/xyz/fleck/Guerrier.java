package xyz.fleck;

/**
 * Classe des joueurs de type Guerrier
 *
 * @author flkoliv
 * @version 1.0
 */
public class Guerrier extends Joueur {

    /**
     * Constructeur du joueur Guerrier
     *
     * @param numJoueur numéro du joueur
     */
    public Guerrier(int numJoueur) {
        super(numJoueur);
    }

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur Guerrier
     * Coup d'épée ou Coup de rage
     *
     * @param choix
     *      choix de l'action
     * @see Mage#jouer(int)
     * @see Joueur#jouer(int)
     * @see Rodeur#jouer(int)
     */
    @Override
    protected void jouer(int choix) {
        switch (choix) {
            case 1:
                adversaire.enleverVie(force);
                System.out.println(nom + " utilise Coup d'épée et inflige " + force + " de dégâts");
                break;
            case 2:
                adversaire.enleverVie((force * 2));
                vie = vie - force / 2;
                System.out.println(nom + " utilise Coup de rage, inflige " + (force * 2) + " de dégâts et perd " + (force / 2) + " de vitalité");
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

    /**
     * Présentation du joueur Guerrier
     * @return Phrase de présentation du joueur Guerrier (sous forme de String)
     */
    public String toString() {
        return "Waourg ! Je suis le Guerrier " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence.";
    }
}
