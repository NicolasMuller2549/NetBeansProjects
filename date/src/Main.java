










import servicios.FechaService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = FechaService.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);

        LocalDate fechaActual = FechaService.fechaActual();
        System.out.println("Fecha actual: " + fechaActual);

        int edad = FechaService.diferencia(fechaActual, fechaNacimiento);
        System.out.println("Edad: " + edad + " años.");
    }
}


