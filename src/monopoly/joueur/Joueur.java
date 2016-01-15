/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.joueur;
import monopoly.carreau.*;
import java.util.*;
import monopoly.Plateau;
/**
 *
 * @author Goldwing
 */
public class Joueur {
    private String nom;
    private float argentDisponible; 
    private final ArrayList<CarreauMaison> listeMaisons;
    private Carreau position;

    public Joueur(String nom, float argentDisponible) {
        this.nom = nom;
        this.argentDisponible = argentDisponible;
        this.listeMaisons = new ArrayList<>();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setArgentDisponible(float argentDisponible) {
        this.argentDisponible = argentDisponible;
    }

    public void setPosition(Carreau position) {
        this.position = position;
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

    public Carreau getPosition() {
        return position;
    }
    
    public void avancer(Plateau p, int valeurDe) {
        if ((this.position.getNumero() + valeurDe) < p.getSize()) {
            this.setPosition(p.getCarreauPosition(this.position.getNumero() + valeurDe));
        }
        else {
            this.setPosition(p.getCarreauPosition(this.position.getNumero() + valeurDe - p.getSize()));
        }
    }
    
    public String stringListeMaisons() {
        String s = "{ ";
        for(CarreauMaison c : listeMaisons) {
            s += " " + c.getNom() + " "; 
        }
        s += " }";
        return s;
    }

    @Override
    public String toString() {
        return "Joueur{" + "nom=" + nom + ", argentDisponible=" + argentDisponible + ", listeMaisons=" + listeMaisons + '}';
    }

}
