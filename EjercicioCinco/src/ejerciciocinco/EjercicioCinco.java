/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class EjercicioCinco {
//Escribir un programa que lea un número entero por teclado y muestre por
    //pantalla el doble, el triple y la raíz cuadrada de ese número. 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un numero: ");
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        System.out.println(num);
        int doble,triple;
        double raizCuadrada;
        doble = num * 2;
        triple = num * 3;
        raizCuadrada = Math.sqrt(num);
        
        System.out.println("el doble del numero es: " + doble);
        System.out.println("el triple del numero es: " + triple);
        System.out.println("la raiz cuadrada del numero es: " + raizCuadrada);
        
    }
    
    
}
