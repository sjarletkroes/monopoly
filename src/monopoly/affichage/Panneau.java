/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.affichage;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author T0166941
 */
 
public class Panneau extends JPanel { 
    public void paintComponent(Graphics g){
        
        int taille = 3;
        
        Point[] coordonnees = new Point[taille*4];
        int x = this.getWidth()/(taille+1);
        int y = this.getHeight()/(taille+1);
        initCoordonnees(taille, coordonnees, x, y);
        initGrille(g, taille, coordonnees, x, y);
        
        g.setColor(Color.yellow);
        g.fillOval(x, y, x/2, y/2);
    }
    
    public void initGrille(Graphics g, int taille, Point[] coordonnees, int x, int y) {
        
        for(int i = 0; i < coordonnees.length; i++) {
            if (i % taille != 0) {
                g.drawRect(coordonnees[i].x, coordonnees[i].y, x/2, y/2);
            }
            else g.fillRect(coordonnees[i].x, coordonnees[i].y, x/2, y/2);
        }
    }
    
    public void initCoordonnees(int taille, Point [] coordonnees, int x, int y) {
        
        int numCase = 0;
        // coté haut
        for(int i = 0; i < taille; i++) {
            coordonnees[numCase] = new Point((i*x/2)+x, y);
            numCase++;
        }
        // coté droite
        for(int i = 0; i < taille; i++) {
            coordonnees[numCase] = new Point((taille*x/2)+x, (i*y/2)+y);
            numCase++;
        }
        // coté bas
        for(int i = taille; i >=1; i--) {
            coordonnees[numCase] = new Point((i*x/2)+x, (taille*y/2)+y);
            numCase++;
        }
        // coté gauche
        for(int i = taille; i >=1; i--) {
            coordonnees[numCase] = new Point(x, (i*y/2)+y);
            numCase++;
        }
    }
}
