/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpracticoguia5;

import static java.time.Clock.system;

/**
 *
 * @author Nico
 */
public class EjPracticoguia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100];
        for (int c = 0; c < 100; c++) 
        {
            vector[c] = c +1;                        
        }
        
        for (int c = 99; c >= 0; c--) 
        {
            System.out.println(vector[c]);
            
        }
    }
}
    

