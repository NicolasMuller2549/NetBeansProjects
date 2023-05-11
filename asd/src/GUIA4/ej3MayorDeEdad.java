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
            System.out.println("ingrese nombre");
            nombre = leer.next();
            System.out.println("ingrese edad");
            num = leer.nextInt();
            contador = contador++;
           // System.out.println("La persona " + contador + " se llama " + nombre + " y tiene " + num + ". Por lo tanto " + edad(num) );
            System.out.println("desea seguir mostrando personas?");
            rta = leer.next();
            edad(num);
            System.out.println("La persona " + contador + " se llama " + nombre + " y tiene " + num + ". Por lo tanto " + edad(num) );
        } while (!rta.equals("no"));
        
        //System.out.println("La persona " + contador + " se llama " + nombre + " y tiene " + num + ". Por lo tanto " + edad(num) );
    }
    
    
    public static int edad(int num){
        if (num >= 18){
           System.out.println("Es mayor de edad");
        }else{
            System.out.println("es menor de edad");
    }   
    
    

