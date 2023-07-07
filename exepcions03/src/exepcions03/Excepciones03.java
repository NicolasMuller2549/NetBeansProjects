
package com.mycompany.excepciones03;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Defina una clase llamada DivisionNumero. En el método main
 * utilice un Scanner para leer dos números en forma de cadena. A continuación,
 * utilice el método parseInt() de la clase Integer,
 * para convertir las cadenas al tipo int y guardarlas en dos
 * variables de tipo int. Por último, realizar una división con los dos números y mostrar el resultado.
 */
public class Excepciones03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número: ");
            String numero1Str = leer.nextLine();
            int numero1 = Integer.parseInt(numero1Str);

            System.out.print("Ingrese el segundo número: ");
            String numero2Str = leer.nextLine();
            int numero2 = Integer.parseInt(numero2Str);

            int resultado = division(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingreso inválido. Debe ingresar un número entero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir la cadena a un número entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

    public static int division(int numerador, int denominador) {
        return numerador / denominador;
    }
}

