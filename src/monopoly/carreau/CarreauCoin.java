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
public class CarreauCoin extends Carreau {

    public CarreauCoin(int numero, String nom) {
        super(numero, nom);
    }
    
    public void action() {
        if (this.getNumero() == 0) {
            Monopoly.joueurCourant.setArgentDisponible(Monopoly.joueurCourant.getArgentDisponible() + Monopoly.MONTANT_PRIME);
            System.out.println("Ajout prime: " + Monopoly.joueurCourant.getArgentDisponible());
        }
        else System.out.println("Carreau coin: " + this.getNom());
    }

    @Override
    public String toString() {
        return "CarreauCoin{" + '}';
    }
    
}
