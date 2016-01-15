/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.*;
/**
 *
 * @author Goldwing
 */
public class LancerDe {
    private int valeurDe;

    public LancerDe() {
    }

    public void setValeurDe() {
        Random r = new Random();
        this.valeurDe = r.nextInt(6) + 1;
    }

    public int getValeurDe() {
        return valeurDe;
    }

    @Override
    public String toString() {
        return "LancerDe{" + "valeurDe=" + valeurDe + '}';
    }
    
}
