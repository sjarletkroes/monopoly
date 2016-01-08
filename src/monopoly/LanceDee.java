/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Goldwing
 */
public class LanceDee {
      public static int lanceDe(){
        
        Random valR = new Random();
        //int de = valR.nextInt((6-1)+1)+1;
        int de = ThreadLocalRandom.current().nextInt(1, 6 + 1);;
        if(de == 0)
            de++;
        System.out.println("Le dé à donné : " + de);
        
        return de;
    }
}
