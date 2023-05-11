/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresjava;
 import java.util.Scanner;   
/**
 *
 * @author Nico
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
       
        
        int vector[] = new int[5]; // Le ponemos la dimension al vector
        int num;
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese Un Numero:");
            num = reader.nextInt();
            vector[i] = num; // Le asignamos a cada posicion del vector el numero 6 
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.print("[" + vector[i] + "]");
            
        }
        
        System.out.println(" ");
        
        
    }

}
    
    

