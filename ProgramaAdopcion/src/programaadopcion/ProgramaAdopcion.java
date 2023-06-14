/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaadopcion;

/**
 *
 * @author nico muller
 */
public class ProgramaAdopcion {

    public static void main(String[] args) {
        // Crear dos Perros
        Perro perro1 = new Perro("Bobby", "Labrador", 3, "Mediano");
        Perro perro2 = new Perro("Max", "Golden Retriever", 2, "Grande");

        // Crear dos Personas y asignarles los Perros
        Persona persona1 = new Persona("Juan", "Pérez", 30, "12345678", perro1);
        Persona persona2 = new Persona("María", "López", 25, "98765432", perro2);

        // Mostrar información de las Personas y sus Perros
        persona1.mostrarInformacion();
        System.out.println("----------------------");
        persona2.mostrarInformacion();
    }
}
