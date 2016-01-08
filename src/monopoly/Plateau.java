/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;
import java.util.*;
import monopoly.Monopoly;
import monopoly.carreau.*;
/**
 *
 * @author Goldwing
 */
public class Plateau {
   // private List<? extends Carreau> lesCarreaux ;
    private List<Object> lesCarreaux ;
    private List<String> nomMaison = Arrays.asList("Mozar", "Calabre", "La Plata", "Les Taillets", "Alsa", "Gare", "Ile verte", "Condillac", "Estrssin", "Quatre", "Tarantino", "Musée"); 

    public Plateau(int nbCarreau) {
        this.lesCarreaux = new ArrayList<>();
        //**    Création du plateau    **
        for(int i=0; i<nbCarreau;i++){
            
            //*** Création du type de carreau ***
            if(i%nbCarreau==0){
                //*** On veut creer un careau de type repos ***
                CarreauCoin unCarreau = new CarreauCoin();
            }
            else{
                
                //*** On veut un type random différent des coins et au hasar ***
                Random classRand = new Random();
                int de = classRand.nextInt((3-1)+1)+1;
                
                
                if(de>2){
                    //*** Maison prix fixe ***
                    MaisonPrixFixe unCarreau = new MaisonPrixFixe(Monopoly.PRIX,Monopoly.LOYER);
                    this.lesCarreaux.add(new MaisonPrixFixe(Monopoly.PRIX,Monopoly.LOYER));
                }
                else if(de>1){
                    //*** Maison négociable ***
                        MaisonPrixNegociable unCarreau = new MaisonPrixNegociable(Monopoly.PRIX,Monopoly.LOYER);
                        this.lesCarreaux.add(unCarreau);
                    }
                    else{
                        //*** Maison Résidence ***
                        MaisonResidence unCarreau = new MaisonResidence(Monopoly.PRIX,Monopoly.LOYER);
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
