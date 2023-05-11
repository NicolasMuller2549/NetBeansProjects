/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpracticoguia53;

import java.util.Random;

/**
 *
 * @author Nico
 */
public class Ejpracticoguia53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Random random = new Random();
      int n = 10000;
      int [] newArray = new int [n];
      int unDigito = 0;
      int dosDigitos = 0;
      int tresDigitos = 0;
      int cuatroDigitos = 0;
      int cincoDigitos = 0;

      for (int i = 0; i < newArray.length; i++){
        newArray[i] = random.nextInt(10000);
      }
      for (int j : newArray) {
        if (j < 10 && j > 0) {
          unDigito++;
        } else if (j < 100 && j > 10) {
          dosDigitos++;
        } else if (j < 1000 && j > 100) {
          tresDigitos++;
        } else if ((j < 10000) && (j > 1000)) {
          cuatroDigitos++;
        } else cincoDigitos++;
      }
      System.out.println("En total hay " + unDigito + " numeros de 1 digito");
      System.out.println("En total hay " + dosDigitos + " numeros de 2 digitos");
      System.out.println("En total hay " + tresDigitos + " numeros de 3 digitos");
      System.out.println("En total hay " + cuatroDigitos + " numeros de 4 digitos");
      System.out.println("En total hay " + cincoDigitos + " numeros de 5 digitos");
    }
}
    
