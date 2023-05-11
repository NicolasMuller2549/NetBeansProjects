
package Main;

import entidades.Persona;
import servicios.PersonaServicio;


public class Main {
 

    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona[] personas = new Persona[4];
        personas[0] = new Persona("Juan", 25, 'H', 70.0, 1.75);
        personas[1] = new Persona("Marta", 17, 'M', 50.0, 1.60);
        personas[2] = new Persona("Nicolas", 30, 'H', 90.0, 1.80);
        personas[3] = new Persona("Cami", 20, 'M', 60.0, 1.70);

        int[] imcResultados = new int[4];
        boolean[] esMayorDeEdadResultados = new boolean[4];

        for (int i = 0; i < personas.length; i++) {
            Persona persona = personas[i];

            int imc = personaServicio.calcularIMC(persona);
            imcResultados[i] = imc;

            boolean esMayorDeEdad = personaServicio.esMayorDeEdad(persona);
            esMayorDeEdadResultados[i] = esMayorDeEdad;

            System.out.println("----------Persona " + (i+1) + "----------");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Sexo: " + persona.getSexo());
            System.out.println("Peso: " + persona.getPeso());
            System.out.println("Altura: " + persona.getAltura());

            if (imc == -1) {
                System.out.println("La persona está por debajo de su peso ideal");
            } else if (imc == 0) {
                System.out.println("La persona está en su peso ideal");
            } else {
                System.out.println("La persona tiene sobrepeso");
            }

            if (esMayorDeEdad) {
                System.out.println("La persona es mayor de edad");
            } else {
                System.out.println("La persona es menor de edad");
            }

            System.out.println("--------------------------------");
        }

        int pesoIdeal = 0;
        int debajoPesoIdeal = 0;
        int sobrepeso = 0;
        int mayoresEdad = 0;
        int menoresEdad = 0;

        for (int i = 0; i < personas.length; i++) {
            if (imcResultados[i] == -1) {
                debajoPesoIdeal++;
            } else if (imcResultados[i] == 0) {
                pesoIdeal++;
            } else {
                sobrepeso++;
            }

            if (esMayorDeEdadResultados[i]) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
        }

        double porcentajeDebajoPesoIdeal = debajoPesoIdeal * 100.0 / personas.length;
        double porcentajePesoIdeal = pesoIdeal * 100.0 / personas.length;
        double porcentajeSobrepeso = sobrepeso * 100.0 / personas.length;
        double porcentajeMayoresEdad = mayoresEdad * 100.0 / personas.length;
        double porcentajeMenoresEdad = menoresEdad * 100.0 / personas.length;

        System.out.println("\nRESULTADOS FINALES:");
System.out.println("Porcentaje de personas por debajo del peso ideal: " + (debajoPesoIdeal / 4.0 * 100) + "%");
System.out.println("Porcentaje de personas en su peso ideal: " + (pesoIdeal / 4.0 * 100) + "%");
System.out.println("Porcentaje de personas con sobrepeso: " + (sobrepeso / 4.0 * 100) + "%");
System.out.println("Porcentaje de personas mayores de edad: " + (mayoresEdad / 4.0 * 100) + "%");
System.out.println("Porcentaje de personas menores de edad: " + (menoresEdad / 4.0 * 100) + "%");

}
}
