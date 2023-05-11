/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatro;

import java.util.Scanner;

/**
 //Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
 //grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 *
 * @author Nico
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int gradosC;
       int gradosF;
       
       Scanner input = new Scanner(System.in);
       System.out.println("ingrese grados;  ");
       
       gradosC = input.nextInt();
       gradosF = 32 + (9 * gradosC / 5);
       
       System.out.println("Los graados ingresados " + gradosC + " en grados"
       + " fahrenheit son: "+ gradosF);
    }
    
}
