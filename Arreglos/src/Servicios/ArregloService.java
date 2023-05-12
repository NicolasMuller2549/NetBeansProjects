/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author nico muller
 */
public class ArregloService {
   
    
    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random(); // generamos un número aleatorio entre 0 y 1
        }
    }
    
    public void mostrar(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // para imprimir un salto de línea al final
    }
    
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo); // ordenamos el arreglo de menor a mayor
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - i - 1];
            arreglo[arreglo.length - i - 1] = temp;
        }
        // invertimos el arreglo para que quede de mayor a menor
    }
    
    public void inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i]; // copiamos los primeros 10 números de A en B
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5; // llenamos las últimas 10 posiciones de B con 0.5
        }
    }
    
}


