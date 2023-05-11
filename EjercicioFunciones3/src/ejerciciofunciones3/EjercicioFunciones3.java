/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofunciones3;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class EjercicioFunciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros: ");
        double cantidad = scanner.nextDouble();
        System.out.print("Introduce la moneda a la que quieres convertir (libras, dolares o yenes): ");
        String moneda = scanner.next();
        convertirMoneda(cantidad, moneda);
    }

    public static void convertirMoneda(double cantidad, String moneda) {
        double conversion = 0;
        String divisa = "";
        switch (moneda.toLowerCase()) {
            case "libras":
                conversion = cantidad * 0.86;
                divisa = "libras";
                break;
            case "dolares":
                conversion = cantidad * 1.28611;
                divisa = "dólares";
                break;
            case "yenes":
                conversion = cantidad * 129.852;
                divisa = "yenes";
                break;
            default:
                System.out.println("La moneda introducida no es válida.");
                return;
        }
        System.out.println(cantidad + " euros son " + conversion + " " + divisa + ".");
    }
}
        

