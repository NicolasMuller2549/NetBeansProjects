
import java.util.Scanner;

public class ProgramaAlumnos {
    public static void main(String[] args) {
        AlumnoService servicio = new AlumnoService();
        servicio.crearAlumnos();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno para calcular la nota final: ");
        String nombreAlumno = scanner.nextLine();

        // Calcular la nota final del alumno y mostrar el resultado
        double notaFinal = servicio.notaFinal(nombreAlumno);
        if (notaFinal == -1) {
            System.out.println("El alumno no se encuentra en la lista.");
        } else {
            System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);
        }
    }
}