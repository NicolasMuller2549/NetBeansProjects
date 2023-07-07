/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author nico muller
 */
public class PersonaServicio {
        Scanner scanner = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        System.out.println("Introduce el nombre de la persona:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la edad de la persona:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // consume la nueva línea en el búfer de entrada
        System.out.println("Introduce el sexo de la persona (H, M, O):");
        char sexo = scanner.nextLine().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo no válido. Introduce el sexo de la persona (H, M, O):");
            sexo = scanner.nextLine().charAt(0);
        }
        System.out.println("Introduce el peso de la persona (en kg):");
        double peso = scanner.nextDouble();
        System.out.println("Introduce la altura de la persona (en metros):");
        double altura = scanner.nextDouble();
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        return persona;
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) { 
            return 0;
        } else {
            return 1;
        }
    }
}

