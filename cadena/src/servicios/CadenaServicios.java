/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author nico muller
 */
public class CadenaServicios {
    private Cadena cadena;

    public CadenaServicios(Cadena cadena) {
        this.cadena = cadena;
    }

    public void mostrarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (vocales.contains(String.valueOf(cadena.getFrase().charAt(i)))) {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public void invertirFrase() {
        String fraseInvertida = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += cadena.getFrase().charAt(i);
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }

    public void vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(String frase) {
        if (cadena.getLongitud() == frase.length()) {
            System.out.println("La longitud de la frase es igual a la longitud de la nueva frase ingresada.");
        } else if (cadena.getLongitud() > frase.length()) {
            System.out.println("La longitud de la frase es mayor que la longitud de la nueva frase ingresada.");
        } else {
            System.out.println("La longitud de la frase es menor que la longitud de la nueva frase ingresada.");
        }
    }

    public void unirFrases(String frase) {
        System.out.println("La frase resultante es: " + cadena.getFrase() + " " + frase);
    }

    public void reemplazar(String letra) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el carácter por el que desea reemplazar las letras : ");
        String reemplazo = sc.nextLine();
        String fraseReemplazada = cadena.getFrase().replaceAll(letra, reemplazo);
        System.out.println("La frase resultante es: " + fraseReemplazada);
    }

    public void contiene(String letra) {
        if (cadena.getFrase().contains(letra)) {
            System.out.println("La frase contiene la letra '" + letra + "'.");
        } else {
            System.out.println("La frase no contiene la letra '" + letra + "'.");
        }
    }
}
