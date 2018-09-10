package xyz.fleck;

/**
 * Classe des joueurs de type Mage
 * 
 * @author flkoliv
 * @version 1.0
 */
public class Mage extends Joueur {

    /**
     * Vie maximale du joueur mage, donnée lors de la création du joueur
     */
    private int vieMax;

    /**
     * Constructeur du joueur Mage
     *
     * @param numJoueur numéro du joueur
     */
    public Mage(int numJoueur) {
        super(numJoueur);
        vieMax = vie;
    }

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur Mage
     * boule de feu ou Soin
     *
     * @param choix
     *      choix de l'action
     * @see Rodeur#jouer(int)
     * @see Joueur#jouer(int)
     * @see Guerrier#jouer(int)
     */
    @Override
    protected void jouer(int choix) {
        switch (choix) {
            case 1:
                adversaire.enleverVie(intelligence);
                System.out.println(nom + " utilise boule de feu et inflige " + intelligence + " de dégâts");
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

    /**
     * Présentation du joueur Mage
     * @return Phrase de présentation du joueur Mage (sous forme de String)
     */
    public String toString() {
        return "Abracadabra ! Je suis le Mage " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence.";
    }
}
