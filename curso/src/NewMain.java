
import entidades.Curso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nico muller
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Curso curso = new Curso();
        curso.crearCurso();

        System.out.println("Curso creado:");
        System.out.println("Nombre del curso: " + curso.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + curso.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: " + curso.getPrecioPorHora());

        System.out.println("Alumnos:");
        String[] alumnos = curso.getAlumnos();
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

        double gananciaSemanal = curso.calcularGananciaSemanal();
        System.out.println("Ganancia semanal: " + gananciaSemanal);
    }
    }
    

