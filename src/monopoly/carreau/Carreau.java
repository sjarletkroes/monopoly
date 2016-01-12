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
public abstract class Carreau {

    private int numero;
    private String nom;

    public Carreau(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public abstract void action();
    
    public void actionCarreau() {
        Monopoly.joueurCourant.setArgentDisponible(Monopoly.joueurCourant.getArgentDisponible() + Monopoly.MONTANT_PRIME);
        action();
    }

    @Override
    public String toString() {
        return "Carreau{" + "numero=" + numero + ", nom=" + nom + '}';
    }
}