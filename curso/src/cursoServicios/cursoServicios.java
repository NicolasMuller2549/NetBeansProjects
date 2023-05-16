/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoServicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class cursoServicios {
     Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(Curso c1) {

        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.next();
        }
        c1.setAlumnos(alumnos);
    }

    public void crearCurso(Curso c1) {

        System.out.print("Ingrese el nombre del curso: ");
        c1.setNombreCurso(scanner.next());
        System.out.print("Ingrese la cantidad de horas por día: ");
        c1.setCantidadHorasPorDia(scanner.nextInt());
        System.out.print("Ingrese la cantidad de días por semana: ");
        c1.setCantidadDiasPorSemana(scanner.nextInt());

        System.out.print("Ingrese el turno (mañana o tarde): ");
        c1.setTurno(scanner.next());
        System.out.print("Ingrese el precio por hora: ");
        c1.setPrecioPorHora(scanner.nextDouble());
        cargarAlumnos(c1);
    }

    public double calcularGananciaSemanal(Curso c1) {
        int cantidadAlumnos = c1.getAlumnos().length;
        int cantidadHorasSemanales = c1.getCantidadHorasPorDia() * c1.getCantidadDiasPorSemana();
        return cantidadHorasSemanales * c1.getPrecioPorHora() * cantidadAlumnos;
    }
}
