/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly.carreau;

import monopoly.Monopoly;
import monopoly.carreau.CarreauMaison;

/**
 *
 * @author me
 */
public class MaisonPrixNegociable extends CarreauMaison {

    public MaisonPrixNegociable(float prix, float loyer) {
        super(prix, loyer);
    }

    @Override
    public float getPrix() {
        if (Monopoly.joueurCourant.getArgentDisponible() < Monopoly.SEUIL_NEGO) {
            return super.getPrix()*(float)0.8;
        }
        else {
            return super.getPrix();
        }
    }
    
}
