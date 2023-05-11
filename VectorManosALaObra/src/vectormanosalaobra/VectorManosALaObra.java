/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectormanosalaobra;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class VectorManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in);
        String[] vector = new String[7];
        for (int c = 0; c < vector.length ; c++) 
        {
            System.out.println("Ingrese nombre: ");
            vector[c]= leer.nextLine();           
            
        }
        for (int c = 0; c < vector.length; c++) 
        {
            System.out.println(vector[c]);
            
        } }
    
}
