/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import entidades.Persona;
import servicios.PersonaServicio;

/**
 *
 * @author nico muller
 */
public class TestPersona {

    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona persona1 = new Persona("Juan", 25, 'H', 70, 1.75);
        Persona persona2 = new Persona("Ana", 17, 'M', 60, 1.60);
        Persona persona3 = new Persona("Pedro", 38, 'H', 80, 1.75);
        Persona persona4 = new Persona("Ana", 20, 'M', 62, 1.7);
        personaServicio.crearPersona(persona3);
        personaServicio.crearPersona(persona4);
        
}
    
}
