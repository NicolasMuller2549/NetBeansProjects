/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofunciones4;


import java.util.Scanner;

public class NumeroPrimo {
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.print("Ingresa un número: ");
            int numero = leer.nextInt();
            
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo");
            } else {
                System.out.println(numero + " no es un número primo");
            }
        }
    }
}

    
    

