/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly.carreau;
import monopoly.joueur.Joueur;
import monopoly.Monopoly;

/**
 *
 * @author me
 */
public class CarreauMaison extends Carreau {
    
    protected float prix;
    protected float loyer;
    protected Joueur proprietaire;

    public CarreauMaison(int numero, String nom, float prix, float loyer) {
        super(numero, nom);
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
            if (Monopoly.joueurCourant.getArgentDisponible() > this.getPrix()) {
                Monopoly.joueurCourant.setArgentDisponible(Monopoly.joueurCourant.getArgentDisponible() - this.getPrix());
                this.proprietaire = Monopoly.joueurCourant;
                Monopoly.joueurCourant.addMaison(this);
                System.out.println(Monopoly.joueurCourant.getNom() + " vient d'acheter " + this.getNom() + " à " + this.getPrix());
            }
            else {
                Monopoly.joueurCourant.setArgentDisponible(0);
                System.out.println(Monopoly.joueurCourant.getNom() + " ne peut pas acheter la maison et a donc PERDU!!!!!!!");
            }
        }
        // si le propriétaire est un autre joueur que le joueur courant
        else if (this.proprietaire != Monopoly.joueurCourant) {
            // faire payer le loyer
            if (Monopoly.joueurCourant.getArgentDisponible() > this.getLoyer()) {
                Monopoly.joueurCourant.setArgentDisponible(Monopoly.joueurCourant.getArgentDisponible() - this.getLoyer());
                System.out.println(Monopoly.joueurCourant.getNom() + " vient de payer " + this.getLoyer() + " pour " + this.getNom() + " à " + this.getProprietaire().getNom());
            }
            else {
                Monopoly.joueurCourant.setArgentDisponible(0);
                System.out.println(Monopoly.joueurCourant.getNom() + " ne peut pas payer la totalité du loyer et a donc PERDU!!!!!!!");
            }
        }
        else System.out.println(Monopoly.joueurCourant.getNom() + " est chez lui/elle");
    }

    @Override
    public String toString() {
        if (this.proprietaire != null) {
            return super.toString() + "\n\tprix=" + prix + ",\n\tloyer=" + loyer + ",\n\tproprietaire=" + proprietaire.getNom() + '}';
        }
        else return super.toString() + "\n\tprix=" + prix + ",\n\tloyer=" + loyer + '}';
    }
    
}
