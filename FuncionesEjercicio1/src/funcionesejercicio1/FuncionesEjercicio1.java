/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesejercicio1;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class FuncionesEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese los dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Pedimos al usuario que ingrese la operación a realizar
        System.out.println("Elija la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = scanner.nextInt();

        // Realizamos la operación seleccionada por el usuario
        double resultado;
        switch (opcion) {
            case 1:
                resultado = sumar(numero1, numero2);
                System.out.println("La suma de los números es: " + resultado);
                break;
            case 2:
                resultado = restar(numero1, numero2);
                System.out.println("La resta de los números es: " + resultado);
                break;
            case 3:
                resultado = multiplicar(numero1, numero2);
                System.out.println("La multiplicación de los números es: " + resultado);
                break;
            case 4:
                resultado = dividir(numero1, numero2);
                System.out.println("La división de los números es: " + resultado);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    // Funciones para realizar las operaciones matemáticas
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
