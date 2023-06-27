/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacionfacilitadoresegg;

import java.util.ArrayList;
import java.util.List;
import votacionfacilitadoresegg.entidades.Alumno;
import votacionfacilitadoresegg.entidades.Simulador;
import votacionfacilitadoresegg.entidades.Voto;

/**
 *
 * @author nico muller
 */
public class VotacionFacilitadoresEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Simulador simulador = new Simulador();

        // Generar alumnos
        List<String> nombres = simulador.generarNombres(20);
        List<Integer> dnis = simulador.generarDnis(20);
        List<Alumno> alumnos = simulador.generarAlumnos(nombres, dnis, 20);

        // Imprimir listado de alumnos
        simulador.imprimirAlumnos(alumnos);

        // Realizar la votación
        List<Voto> votos = simulador.votacion(alumnos);

        // Mostrar los votos de cada alumno
        simulador.mostrarVotos(votos);

        // Realizar el recuento de votos
        List<Alumno> alumnosOrdenados = simulador.recuentoVotos(alumnos);

        // Generar facilitadores y facilitadores suplentes
        List<Alumno> facilitadores = new ArrayList<>();
        List<Alumno> facilitadoresSuplentes = new ArrayList<>();
        simulador.generarFacilitadores(alumnosOrdenados, facilitadores, facilitadoresSuplentes);

        // Mostrar los facilitadores y facilitadores suplentes
       simulador.mostrarFacilitadores(facilitadores,facilitadoresSuplentes);
    }
}
