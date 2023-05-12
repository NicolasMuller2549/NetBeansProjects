/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import Servicios.ArregloService;

/**
 *
 * @author nico muller
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    double[] arregloA = new double[50];
    double[] arregloB = new double[20];
    
    ArregloService servicio = new ArregloService();
    
    servicio.inicializarA(arregloA);
    System.out.println("Arreglo A inicializado:");
    servicio.mostrar(arregloA);
    
    servicio.ordenar(arregloA);
    System.out.println("Arreglo A ordenado de mayor a menor:");
    servicio.mostrar(arregloA);
    
    servicio.inicializarB(arregloA, arregloB);
    System.out.println("Arreglo A:");
    servicio.mostrar(arregloA);
    System.out.println("Arreglo B inicializado con los primeros 10 números de A y 10 números 0.5:");
    servicio.mostrar(arregloB);
}

    }
    

