/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nico muller
 */
class AlumnoService {
    
    private List<Alumno> listaAlumnos;

    public AlumnoService() {
        listaAlumnos = new ArrayList<>();
    }

    public void crearAlumnos() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            // Pedir al usuario que ingrese el nombre del alumno
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                // Pedir al usuario que ingrese las notas del alumno
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = scanner.nextInt();
                notas.add(nota);
            }

            scanner.nextLine(); // Consumir el salto de línea después de leer la última nota

            // Crear un objeto Alumno con el nombre y las notas ingresadas y agregarlo a la lista de alumnos
            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);

            // Preguntar al usuario si desea crear otro alumno
            System.out.print("¿Desea crear otro alumno? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public double notaFinal(String nombreAlumno) {
        for (Alumno alumno : listaAlumnos) {
            // Buscar al alumno en la lista por nombre (ignorando mayúsculas y minúsculas)
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                int suma = 0;
                for (int nota : notas) {
                    suma += nota;
                }
                // Calcular el promedio de las notas del alumno y devolverlo
                return (double) suma / notas.size();
            }
        }
        // Retornar -1 si el alumno no se encuentra en la lista
        return -1;
    }
}
