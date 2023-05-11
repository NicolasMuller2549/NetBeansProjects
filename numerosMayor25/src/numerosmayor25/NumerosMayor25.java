/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosmayor25;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class NumerosMayor25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 > 25 && numero2 > 25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (numero1 > 25 || numero2 > 25) {
            System.out.println("Al menos uno de los números es mayor a 25");
        } else {
            System.out.println("Ninguno de los números es mayor a 25");
        }
    }
}
    
    

