/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *ça marche??????
 * toujours????????
 * @author Goldwing
 */
public class Monopoly {
    private static int posiJ = 0;
    private static LanceDee jetDe;
    public static int SEUIL_NEGO = 250;
    public static int MONTANT_PRIME = 200;
    public static Joueur joueurCourant;
    public static float PRIX = 10000;
    public static float LOYER = 600;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //** Création des joueurs **
        Joueur J1 = new Joueur("Sjarlet", (float)200.0);
        Joueur J2 = new Joueur("Grace", (float)200.0);
        
        //** Création du plateau **
        Plateau P1 = new Plateau(12);
        
        //** On considère pour le moment que les joueurs ne font qu'un tour **
        //** Le jeu s'arrête quand l'un des deux à fini le tour **
        //** Deux joueurs peuvent être sur le même carreau **
        while(P1.getLesCarreaux().size() >= Monopoly.posiJ){
            //** J1 joue **
                //*** J1 jette le dé ***
                Monopoly.jetDe = new LanceDee();
                //*** Il se positionne sur un carreau en fonction du dé ***
                //J1.setSurUnCarreau(P1.getLesCarreaux().get(Integer.parseInt(String.valueOf(Monopoly.jetDe))));
                J1.setSurUnCarreau(P1.getLesCarreaux().get(Integer.parseInt(String.valueOf(Monopoly.jetDe))));
                P1.getLesCarreaux().get(posiJ);
            
            //** J2 joue **
                //*** J2 jette le dé ***
        }
    }
    
}
