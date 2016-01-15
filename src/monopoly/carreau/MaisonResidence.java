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
public class MaisonResidence extends CarreauMaison {

    public MaisonResidence(int numero, String nom, float prix, float loyer) {
        super(numero, nom, prix, loyer);
    }

    @Override
    public float getLoyer() {
        return super.getLoyer()*Monopoly.jetDe.getValeurDe();
    }

    @Override
    public float getPrix() {
        return super.getPrix()*(float)1.3;
    }
    
}
