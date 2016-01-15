/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.affichage;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author T0166941
 */
 
public class Fenetre extends JFrame {
    public Fenetre(){
        this.setTitle("Ma première fenêtre Java");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);    

        //Instanciation d'un objet JPanel
        JPanel pan = new JPanel();
        //Définition de sa couleur de fond
        pan.setBackground(Color.ORANGE);
        //On prévient notre JFrame que notre JPanel sera son content pane
        this.setContentPane(new Panneau());        
        this.setVisible(true);  
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
        this.setVisible(true);
    }
}
