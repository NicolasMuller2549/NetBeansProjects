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
    
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
    
    public void crearPersona(Persona persona) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        char sexo;
        do {
            System.out.print("Ingrese el sexo de la persona (H, M u O): ");
            sexo = scanner.nextLine().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        System.out.print("Ingrese el peso de la persona: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la altura de la persona: ");
        double altura = scanner.nextDouble();
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        persona.setPeso(peso);
        persona.setAltura(altura);
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
   
