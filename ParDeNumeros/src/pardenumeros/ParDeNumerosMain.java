/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pardenumeros;

import ParDeNumerosService.ParDeNumerosService;
import entidades.ParDeNumeros;

/**
 *
 * @author nico muller
 */
public class ParDeNumerosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParDeNumeros par = new ParDeNumeros();
ParDeNumerosService.mostrarValores(par);
double mayor = ParDeNumerosService.devolverMayor(par);
double potencia = ParDeNumerosService.calcularPotencia(par);
double raiz = ParDeNumerosService.calcularRaiz(par);
System.out.println("El número mayor es " + mayor);
System.out.println("La potencia del mayor valor elevado al menor es " + potencia);
System.out.println("La raíz cuadrada del menor valor es " + raiz);
    }
    
}
