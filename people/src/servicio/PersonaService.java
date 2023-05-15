package servicio;

import entidades.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    public static Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la persona (formato: yyyy-MM-dd): ");
        String fechaNacimientoStr = scanner.nextLine();
        Date fechaNacimiento = java.sql.Date.valueOf(fechaNacimientoStr);

        return new Persona(nombre, fechaNacimiento);
    }

    public static int calcularEdad(Date fechaNacimiento) {
        Date fechaActual = new Date();
        long diff = fechaActual.getTime() - fechaNacimiento.getTime();
        long edadInMillis = 1000L * 60 * 60 * 24 * 365;
        int edad = (int) (diff / edadInMillis);
        return edad;
    }

    public static boolean menorQue(Persona persona, int edad) {
        Date fechaNacimiento = persona.getFechaNacimiento();
        int edadPersona = calcularEdad(fechaNacimiento);
        return edadPersona < edad;
    }

    public static void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
    }
}
