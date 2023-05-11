/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03;

/**
 *
 * @author Nico
 */
public class POOEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia circunferencia = new Circunferencia(0.0);
        circunferencia.crearCircunferencia();
        System.out.println("El area de la circunferencia es: " + circunferencia.area());
        System.out.println("El Perimetro de la circunferencia es: " + circunferencia.perimetro());
        
        
    }
    
}
