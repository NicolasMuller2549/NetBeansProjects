/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import entidades.Persona;
import servicio.PersonaService;

/**
 *
 * @author nico muller
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Persona persona = PersonaService.crearPersona();
        PersonaService.mostrarPersona(persona);

        int edad = PersonaService.calcularEdad(persona.getFechaNacimiento());
        System.out.println("Edad: " + edad + " años.");

        boolean esMenor = PersonaService.menorQue(persona, 18);
        System.out.println("¿Es menor de 18 años? " + esMenor);
    }
    }
    

