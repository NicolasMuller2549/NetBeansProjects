/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesejercicio2;

import java.util.Scanner;

public class FuncionesEjercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();

        Persona[] personas = new Persona[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i+1) + ": ");
            String nombre = scanner.next();

            System.out.print("Ingrese la edad de la persona " + (i+1) + ": ");
            int edad = scanner.nextInt();

            Persona persona = new Persona(nombre, edad);
            personas[i] = persona;

            if (persona.esMayorDeEdad()) {
                System.out.println(persona.getNombre() +" es mayor de edad");                
            } else {
                System.out.println(persona.getNombre() + " es menor de edad.");
            }
        }
        
        System.out.println("Datos de las personas ingresadas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        while (true) {
            System.out.print("¿Quiere seguir mostrando personas? (Sí/No): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("No")) {
                break;
            }
        }
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public String toString() {
        return this.nombre + " tiene " + this.edad + " años.";
    }
}