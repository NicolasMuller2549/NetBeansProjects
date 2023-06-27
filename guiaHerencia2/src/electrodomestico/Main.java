/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico;

/**
 *
 * @author nico muller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Lavadora lavadora = new Lavadora(1000, "Blanco", 'C', 15, 5);
        double precioFinalLavadora = lavadora.precioFinal();
        System.out.println("Precio final de la lavadora: $" + precioFinalLavadora);

        Televisor televisor = new Televisor(1500, "Negro", 'D', 20, 32, true);
        double precioFinalTelevisor = televisor.precioFinal();
        System.out.println("Precio final del televisor: $" + precioFinalTelevisor);
    }
    }
    
    

