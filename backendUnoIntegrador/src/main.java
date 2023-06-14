
import entidades.Estudiante;
import servicios.ServicioEstudiante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nico muller
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante[] estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Estudiante 1", 7.5);
        estudiantes[1] = new Estudiante("Estudiante 2", 8.2);
        estudiantes[2] = new Estudiante("Estudiante 3", 6.9);
        estudiantes[3] = new Estudiante("Estudiante 4", 9.1);
        estudiantes[4] = new Estudiante("Estudiante 5", 7.8);
        estudiantes[5] = new Estudiante("Estudiante 6", 8.6);
        estudiantes[6] = new Estudiante("Estudiante 7", 6.7);
        estudiantes[7] = new Estudiante("Estudiante 8", 8.9);

        ServicioEstudiante servicioEstudiante = new ServicioEstudiante();

        double promedio = servicioEstudiante.calcularPromedio(estudiantes);
        System.out.println("El promedio de notas del curso es: " + promedio);

        String[] nombresNotasMayores = servicioEstudiante.obtenerNombresNotasMayoresAlPromedio(estudiantes, promedio);
        System.out.println("Alumnos con nota mayor al promedio:");
        for (String nombre : nombresNotasMayores) {
            System.out.println(nombre);
        }
    }
    }
 
