/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico;

import java.util.ArrayList;

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

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        Lavadora lavadora1 = new Lavadora(1500, "Blanco", 'B', 20, 10);
        electrodomesticos.add(lavadora1);

        Televisor televisor1 = new Televisor(2500, "Negro", 'A', 32, 42, true);
        electrodomesticos.add(televisor1);

        // Recorrido del ArrayList y cálculo del precio final
        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            System.out.println("Precio final del electrodoméstico: $" + precioFinal);
        }

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }
        }

        System.out.println("Precio total de los electrodomésticos: $" + precioTotalElectrodomesticos);
        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);
    }
}
