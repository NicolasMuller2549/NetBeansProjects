/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA4;

import java.util.Scanner;

public class ej3MayorDeEdad {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombre;
        String rta;
        int num;
        int contador =0;
        
        do {
            System.out.println("Ingrese nombre:");
            nombre = leer.next();
            System.out.println("Ingrese edad:");
            num = leer.nextInt();
            contador = contador + 1;
            System.out.println("La persona " + contador + " se llama " + nombre + " y tiene " + num + ". Por lo tanto " + edad(num));
            System.out.println("¿Desea seguir mostrando personas? (sí/no)");
            rta = leer.next();
        } while (!rta.equals("no"));
    }
    
    public static String edad(int num) {
        if (num >= 18) {
            return "Es mayor de edad";
        } else {
            return "Es menor de edad";
        }
    }
}