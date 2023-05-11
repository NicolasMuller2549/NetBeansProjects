/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;
 import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        //imprime en pantalla numero 1
        System.out.println("ingrese un numero: ");
        num1 = leer.nextInt();
        Scanner reader = new Scanner(System.in);
        
         //imprime en pantalla numero 2
        System.out.println("ingrese un numero: ");
        num2 = leer.nextInt();
       
        //Suma de ambos numeros
        int suma = num1 + num2 ;
        
        //imprime en pantalla la suma de ambos numeros
     System.out.println("La suma de los 2 numeros es: " + suma);
     
        
        
    }
    
}
