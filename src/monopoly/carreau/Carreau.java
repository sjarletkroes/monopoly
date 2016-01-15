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

    public String getNom() {
        return nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public abstract void action();
    
    public void actionCarreau() {
        System.out.println("Initial: " + Monopoly.joueurCourant.getArgentDisponible());
        if (Monopoly.joueurCourant.getArgentDisponible() > 0) {
            action();
        }
        if (Monopoly.joueurCourant.getArgentDisponible() < 0) {
            System.out.println("FAUCHE!!!!!");
        }
        System.out.println("Après action: " + Monopoly.joueurCourant.getArgentDisponible());
    }

    @Override
    public String toString() {
        return "Carreau{" + "numero=" + numero + ",\n\tnom=" + nom + '}';
    }
}