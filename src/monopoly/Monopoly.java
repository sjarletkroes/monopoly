/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import monopoly.affichage.Fenetre;
import monopoly.joueur.Joueur;
import monopoly.carreau.Carreau;

/**
 * 
 * @author Goldwing
 */
public class Monopoly {
    private static int POSITION_INITIALE = 0;
    public static LancerDe jetDe;
    public static int SEUIL_NEGO = 1000;
    public static int MONTANT_PRIME = 200;
    public static Joueur joueurCourant;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fenetre fen = new Fenetre();
        
        //** Création des joueurs **
        System.out.println("Création des joueurs");
        Joueur J1 = new Joueur("Sjarlet", (float)20000.0);
        Joueur J2 = new Joueur("Grace", (float)20000.0);
        
        //** Création du plateau **
        System.out.println("Création du plateau");
        Plateau P1 = new Plateau(12);
        
        // Initialisation de la position des joueurs
        System.out.println("Initialisation de la position des joueurs");
        J1.setPosition((Carreau) P1.getCarreauPosition(POSITION_INITIALE));
        J2.setPosition((Carreau) P1.getCarreauPosition(POSITION_INITIALE));
        
        //** Déroulement du jeu **
        Monopoly.jetDe = new LancerDe();
        while(J1.getArgentDisponible() > 0 && J2.getArgentDisponible() > 0){
            
            //** J1 joue **
            joueurCourant = J1;
            System.out.println("\nJoueur courant: " + J1.getNom() + 
                    "\n\tnombre de propriétés acquises: " + J1.getListeMaisons().size() + 
                    "\n\tnoms: " + J1.stringListeMaisons());
            //*** J1 jette le dé ***
            jetDe.setValeurDe();
            System.out.println(jetDe.toString());
            //*** Il se positionne sur un carreau en fonction du dé ***
            J1.avancer(P1, jetDe.getValeurDe());
            J1.getPosition().actionCarreau();
            
            //** J2 joue **
            joueurCourant = J2;
            System.out.println("\nJoueur courant: " + J2.getNom() + 
                    "\n\tnombre de propriétés acquises: " + J2.getListeMaisons().size() +
                    "\n\tnoms: " + J2.stringListeMaisons());
            //*** J2 jette le dé ***
            jetDe.setValeurDe();
            System.out.println(jetDe.toString());
            //*** Il se positionne sur un carreau en fonction du dé ***
            J2.avancer(P1, jetDe.getValeurDe());
            J2.getPosition().actionCarreau();
        }
    }
    
}
