/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly.carreau;

import monopoly.Monopoly;

/**
 *
 * @author me
 */
public class MaisonPrixNegociable extends CarreauMaison {

    public MaisonPrixNegociable(int numero, String nom, float prix, float loyer) {
        super(numero, nom, prix, loyer);
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
