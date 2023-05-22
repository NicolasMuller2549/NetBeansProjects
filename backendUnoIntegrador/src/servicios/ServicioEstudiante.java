/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nico muller
 */
public class ServicioEstudiante {
     public double calcularPromedio(Estudiante[] estudiantes) {
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.length;
    }

    public String[] obtenerNombresNotasMayoresAlPromedio(Estudiante[] estudiantes, double promedio) {
        List<String> nombres = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombres.add(estudiante.getNombre());
            }
        }
        return nombres.toArray(new String[0]);
    }
}
