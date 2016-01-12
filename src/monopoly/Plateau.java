/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;
import java.util.*;
import monopoly.carreau.*;
/**
 *
 * @author Goldwing
 */
public class Plateau {
   // private List<? extends Carreau> lesCarreaux ;
    private List<Object> lesCarreaux ;
    String[] nomMaison = {"Mozar", "Calabre", "La Plata", "Les Taillets", "Alsa", "Gare", "Ile verte", "Condillac", "Estrssin", "Quatre", "Tarantino", "Musée"}; 
    int[] prixMaison = {1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 2000, 2100}; 

    public Plateau(int nbCarreau) {
        this.lesCarreaux = new ArrayList<>();
        //***    Création du plateau    ***
        for(int i=0; i<nbCarreau;i++){
            
            //*** Création du type de carreau ***
            if(i%nbCarreau==0){
                //*** On veut creer un careau de type repos ***
                CarreauCoin unCarreau = new CarreauCoin();
            }
            else{
                
                //*** On veut un type random différent des coins et au hasard ***
                Random classRand = new Random();
                int de = classRand.nextInt(3);
                
                
                if(de == 0){
                    //*** Maison prix fixe ***
                    MaisonPrixFixe unCarreau = new MaisonPrixFixe(prixMaison[i],prixMaison[i]/100);
                    this.lesCarreaux.add(unCarreau);
                }
                else if(de == 1){
                    //*** Maison négociable ***
                    MaisonPrixNegociable unCarreau = new MaisonPrixNegociable(prixMaison[i],prixMaison[i]/100);
                    this.lesCarreaux.add(unCarreau);
                }
                else{
                    //*** Maison Résidence ***
                    MaisonResidence unCarreau = new MaisonResidence(prixMaison[i],prixMaison[i]/100);
                    this.lesCarreaux.add(unCarreau);
                }
            }  
        }
    }
    
    public List<Object> getLesCarreaux() {
        return lesCarreaux;
    }

    public void setLesCarreaux(List<Object> lesCarreaux) {
        this.lesCarreaux = lesCarreaux;
    }

}