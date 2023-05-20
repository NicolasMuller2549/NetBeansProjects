/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.entidadesAhorcado;
import java.util.Scanner;
public class service {
    private entidadesAhorcado ahorcado;
    private Scanner scanner;

    public service() {
        scanner = new Scanner(System.in);
    }

    public void jugar() {
        inicializarJuego();

        while (!ahorcado.adivinadoTodasLetras() && !ahorcado.haPerdido()) {
            System.out.println("\n--- Juego del Ahorcado ---");
            System.out.println("Intentos restantes: " + ahorcado.getIntentosRestantes());
            System.out.print("Palabra: ");
            ahorcado.mostrarPalabra();

            char letra = leerLetra();
            boolean letraAdivinada = ahorcado.intentarLetra(letra);

            if (letraAdivinada) {
                System.out.println("¡Letra correcta!");
            } else {
                System.out.println("¡Letra incorrecta!");
            }
        }

        System.out.println("\n--- Juego del Ahorcado ---");
        System.out.print("Palabra: ");
        ahorcado.mostrarPalabra();

        if (ahorcado.adivinadoTodasLetras()) {
            System.out.println("\n¡Felicidades! ¡Has adivinado la palabra!");
        } else {
            System.out.println("\n¡Oh no! Te has quedado sin intentos.");
            System.out.println("La palabra era: " + ahorcado.getPalabraSecreta());
        }
    }

    private void inicializarJuego() {
        System.out.print("Ingresa la palabra secreta: ");
        String palabraSecreta = scanner.nextLine();
        System.out.print("Ingresa el número de intentos: ");
        int intentos = scanner.nextInt();

        ahorcado = new entidadesAhorcado(palabraSecreta, intentos);
        scanner.nextLine(); // Limpiar el buffer del scanner
    }

    private char leerLetra() {
        System.out.print("Ingresa una letra: ");
        String input = scanner.nextLine();
        return input.toLowerCase().charAt(0);
    }
}
