/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;

/**
 *
 * @author Nico
 */
public class POOej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   Rectangulo rectangulo = new Rectangulo(0, 0);
        Rectangulo rectangulo = new Rectangulo(0,0 );
        rectangulo.crearRectangulo();
      System.out.println("El perimetro del rectangulo es: " + rectangulo.perimetroRectangulo());
      System.out.println("La superficie del rectangulo es " + rectangulo.superficieRectangulo());
      
        rectangulo.dibujarRectangulo();
    }
   
    
}
