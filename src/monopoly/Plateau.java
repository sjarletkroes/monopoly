/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;
import monopoly.carreau.Carreau;
import java.util.*;
/**
 *
 * @author Goldwing
 */
public class Plateau {
    private ArrayList<Carreau> lesCarreaux ;
    private Carreau unCarreau;
    private TypeCarreau unTypeCar;
    
    public Plateau(int nbCarreau) {
        this.lesCarreaux = new ArrayList<>();
        
        //**    Création du plateau    **
        for(int i=0; i<nbCarreau;i++){
            
            //*** Création du type de carreau ***
            if(i%4==0){
                unTypeCar = unTypeCar .REPOS;
            }
            else{
                //** On veut un type random différent des coins
                do{
                    unTypeCar = unTypeCar.randomType();
                  }while(unTypeCar == unTypeCar.REPOS);
            }
            
            //*** Création du carreau et ajout au plateau ***
            this.unCarreau = new Carreau(i, unTypeCar);
            this.lesCarreaux.add(this.unCarreau);
        }
    }
    
    public ArrayList<Carreau> getLesCarreaux() {
        return lesCarreaux;
    }

    public void setLesCarreaux(ArrayList<Carreau> lesCarreaux) {
        this.lesCarreaux = lesCarreaux;
    }
}
