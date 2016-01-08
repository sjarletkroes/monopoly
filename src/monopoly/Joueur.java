/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;
import monopoly.carreau.*;
import java.util.*;
/**
 *
 * @author Goldwing
 */
public class Joueur {
    private String nom;
    private float argentDisponible; 
    private ArrayList<CarreauMaison> listeMaisons;

    public Joueur(String nom, float argentDisponible) {
        this.nom = nom;
        this.argentDisponible = argentDisponible;
        this.listeMaisons = null;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setArgentDisponible(float argentDisponible) {
        this.argentDisponible = argentDisponible;
    }

    public void addMaison(CarreauMaison maison) {
        this.listeMaisons.add(maison);
    }

    public String getNom() {
        return nom;
    }

    public float getArgentDisponible() {
        return argentDisponible;
    }

    public ArrayList<CarreauMaison> getListeMaisons() {
        return listeMaisons;
    }

    @Override
    public String toString() {
        return "Joueur{" + "nom=" + nom + ", argentDisponible=" + argentDisponible + ", listeMaisons=" + listeMaisons + '}';
    }

}
