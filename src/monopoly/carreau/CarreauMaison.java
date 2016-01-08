/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly.carreau;
import monopoly.Joueur;
import monopoly.Monopoly;
import static monopoly.Monopoly.SEUIL_NEGO;

/**
 *
 * @author me
 */
public class CarreauMaison {
    
    protected float prix;
    protected float loyer;
    protected Joueur proprietaire;

    public CarreauMaison(float prix, float loyer) {
        this.prix = prix;
        this.loyer = loyer;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setLoyer(float loyer) {
        this.loyer = loyer;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }

    public float getPrix() {
        return prix;
    }

    public float getLoyer() {
        return loyer;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }
    
    public void action(){
        // si la maison n'a pas de propriétaire
        if (this.proprietaire == null) {
            // faire acheter
            Monopoly.joueurCourant.setArgentDisponible(this.getPrix());
        }
        // si le propriétaire est un autre joueur que le joueur courant
        else if (this.proprietaire != Monopoly.joueurCourant) {
            this.getLoyer();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "prix=" + prix + ", loyer=" + loyer + ", proprietaire=" + proprietaire.toString() + '}';
    }
    
}
