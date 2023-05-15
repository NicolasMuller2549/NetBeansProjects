package servicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FechaService {

    public static LocalDate fechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día de su nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes de su nacimiento: ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año de su nacimiento: ");
        int anio = scanner.nextInt();

        return LocalDate.of(anio, mes, dia);
    }

    public static LocalDate fechaActual() {
        return LocalDate.now();
    }

    public static int diferencia(LocalDate fecha1, LocalDate fecha2) {
        Period periodo = Period.between(fecha1, fecha2);
        return periodo.getYears();
    }
}
