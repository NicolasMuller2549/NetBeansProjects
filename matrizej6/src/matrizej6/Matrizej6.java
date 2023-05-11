/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizej6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Matrizej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);

    int matrix [][] = new int [3][3];

    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix.length; j++){
        System.out.println("Ingresa un numero del 1 al 9");
        matrix[i][j] = scanner.nextInt();
        }
      }

    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix.length; j++){
        if ((matrix[i][j] > 10) || (matrix[i][j] < 0)){
          System.out.println("error, empeza de vuelta");
          System.exit(0);
        }
      }
    }
    // partiendo desde el index 0,0
    if ((matrix[0][0] + matrix[0][1] + matrix[0][2] == matrix[0][0] + matrix[1][0] + matrix[2][0])){
      System.out.println("son iguales");
    }else
      System.out.println("no son iguales");
    if ((matrix[0][0] + matrix[0][1] + matrix[0][2] == matrix[0][0] + matrix[1][1] + matrix[2][2])){
      System.out.println("son iguales");
    }else
      System.out.println("no son iguales");
    if ((matrix[0][0] + matrix[0][1] + matrix[0][2] == matrix[1][0] + matrix[1][1] + matrix[1][2])){
      System.out.println("son iguales");
    }else
      System.out.println("no son iguales");

    System.out.println(Arrays.deepToString(matrix));
  }
}


/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y
determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
es decir, están entre el 1 y el 9.
 */
    
    

