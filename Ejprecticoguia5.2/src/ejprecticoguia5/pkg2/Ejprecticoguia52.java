/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejprecticoguia5.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Ejprecticoguia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int cont = 0;
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        int[] vector = new int[5];
        for (int c = 0; c < 5; c++) 
        {
            vector[c] = random.nextInt(5);
            System.out.println(vector[c]);
            
        }
        System.out.println("Ingrese un numero a buscar en el coso: ");
        int num1 = leer.nextInt();
        for (int c = 0; c < 5; c++) 
        {
            if (num1 == vector[c]) 
            {
                System.out.println("la posicion del subindice del vector es: "
                        + c);
                cont++;             
                
            }
            if (cont == 0 && c == vector.length-1)
            {
                System.out.println("el numero no se encuentra en el array..");
                
            }
            
        }
    }
}

