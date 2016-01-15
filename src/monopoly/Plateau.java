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
    private ArrayList<Carreau> lesCarreaux ;
    String[] nomMaison = {"Mozar", "Calabre", "La Plata", "Les_Taillets", "Alsa", "Gare", "Ile_verte", "Condillac", "Estrssin", "Quatre", "Tarantino", "Musée"}; 
    int[] prixMaison = {1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 2000, 2100}; 

    public Plateau(int nbCarreau) {
        this.lesCarreaux = new ArrayList<>();
        //***    Création du plateau    ***
        for(int i=0; i<nbCarreau;i++){
            
            //*** Création du type de carreau ***
            if(i%nbCarreau==0){
                //*** On veut creer un carreau de type repos ***
                CarreauCoin unCarreau = new CarreauCoin(i, nomMaison[i]);
            }
            else{
                
                //*** On veut un type random différent des coins et au hasard ***
                Random classRand = new Random();
                int de = classRand.nextInt(3);
                
                
                if(de == 0){
                    //*** Maison prix fixe ***
                    MaisonPrixFixe unCarreau = new MaisonPrixFixe(i, nomMaison[i], prixMaison[i],prixMaison[i]/100);
                    this.lesCarreaux.add(unCarreau);
                }
                else if(de == 1){
                    //*** Maison négociable ***
                    MaisonPrixNegociable unCarreau = new MaisonPrixNegociable(i, nomMaison[i], prixMaison[i],prixMaison[i]/100);
                    this.lesCarreaux.add(unCarreau);
                }
                else{
                    //*** Maison Résidence ***
                    MaisonResidence unCarreau = new MaisonResidence(i, nomMaison[i], prixMaison[i],prixMaison[i]/100);
                    this.lesCarreaux.add(unCarreau);
                }
            }  
        }
    }
    
    public ArrayList<Carreau> getLesCarreaux() {
        return lesCarreaux;
    }
    
    public Carreau getCarreauPosition(int position) {
        return lesCarreaux.get(position);
    }
    
    public int getSize() {
        return this.lesCarreaux.size();
    }

    public void setLesCarreaux(ArrayList<Carreau> lesCarreaux) {
        this.lesCarreaux = lesCarreaux;
    }

    @Override
    public String toString() {
        return "Plateau{" + "lesCarreaux=" + lesCarreaux + '}';
    }

}