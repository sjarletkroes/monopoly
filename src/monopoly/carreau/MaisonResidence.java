/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly.carreau;

import monopoly.LanceDee;

/**
 *
 * @author me
 */
public class MaisonResidence extends CarreauMaison {

    public MaisonResidence(float prix, float loyer) {
        super(prix, loyer);
    }

    @Override
    public float getLoyer() {
        return super.getLoyer()*LanceDee.lanceDe();
    }

    @Override
    public float getPrix() {
        return super.getPrix()*(float)1.3;
    }
    
}
