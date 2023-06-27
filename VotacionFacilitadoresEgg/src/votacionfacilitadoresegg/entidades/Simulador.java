/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacionfacilitadoresegg.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author nico muller
 */
public class Simulador {
  public List<String> generarNombres(int cantidad) {
        List<String> nombres = new ArrayList<>();
        String[] listaNombres = { "Juan", "Pedro", "María", "Ana", "Luis", "Carolina" };
        String[] listaApellidos = { "Gómez", "Rodríguez", "López", "Martínez", "Pérez", "Fernández" };
        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = listaNombres[rand.nextInt(listaNombres.length)];
            String apellido = listaApellidos[rand.nextInt(listaApellidos.length)];
            nombres.add(nombre + " " + apellido);
        }

        return nombres;
    }

    public List<Integer> generarDnis(int cantidad) {
        List<Integer> dnis = new ArrayList<>();
        int inicioRangoDni = 10000000;
        int finRangoDni = 99999999;
        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            int dni = rand.nextInt(finRangoDni - inicioRangoDni + 1) + inicioRangoDni;
            dnis.add(dni);
        }

        return dnis;
    }

    public List<Alumno> generarAlumnos(List<String> nombres, List<Integer> dnis, int cantidad) {
        List<Alumno> alumnos = new ArrayList<>();
        Set<Integer> dnisUtilizados = new HashSet<>();
        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres.get(rand.nextInt(nombres.size()));
            int dni = dnis.get(rand.nextInt(dnis.size()));

            while (dnisUtilizados.contains(dni)) {
                dni = dnis.get(rand.nextInt(dnis.size()));
            }

            dnisUtilizados.add(dni);
            Alumno alumno = new Alumno(nombre, dni);
            alumnos.add(alumno);
        }

        return alumnos;
    }

    public void imprimirAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.nombre);
            System.out.println("DNI: " + alumno.dni);
            System.out.println("Votos: " + alumno.cantidadVotos);
            System.out.println();
        }
    }

    public List<Voto> votacion(List<Alumno> alumnos) {
        List<Voto> votos = new ArrayList<>();
        Random rand = new Random();

        for (Alumno alumno : alumnos) {
            List<Alumno> votosAlumno = new ArrayList<>();
            Set<Alumno> votosRealizados = new HashSet<>();

            while (votosAlumno.size() < 3) {
                Alumno voto = alumnos.get(rand.nextInt(alumnos.size()));

                if (voto != alumno && !votosRealizados.contains(voto)) {
                    votosAlumno.add(voto);
                    votosRealizados.add(voto);
                    voto.cantidadVotos++;
                }
            }

            alumno.cantidadVotos += 3;
            Voto voto = new Voto(alumno, votosAlumno);
            votos.add(voto);
        }

        return votos;
    }

    public void mostrarVotos(List<Voto> votos) {
        for (Voto voto : votos) {
            System.out.println("Alumno: " + voto.alumno.nombre);
            System.out.println("Votos: ");

            for (Alumno votoRealizado : voto.votosRealizados) {
                System.out.println(votoRealizado.nombre);
            }

            System.out.println();
        }
    }

    public List<Alumno> recuentoVotos(List<Alumno> alumnos) {
        alumnos.sort((a1, a2) -> Integer.compare(a2.cantidadVotos, a1.cantidadVotos));
        return alumnos;
    }

    public void generarFacilitadores(List<Alumno> alumnos, List<Alumno> facilitadores, List<Alumno> facilitadoresSuplentes) {
        for (int i = 0; i < 5; i++) {
            facilitadores.add(alumnos.get(i));
            facilitadoresSuplentes.add(alumnos.get(i + 5));
        }
    }

    public void mostrarFacilitadores(List<Alumno> facilitadores, List<Alumno> facilitadoresSuplentes) {
        System.out.println("Facilitadores:");
        for (Alumno facilitador : facilitadores) {
            System.out.println(facilitador.nombre);
        }
        System.out.println();

        System.out.println("Facilitadores Suplentes:");
        for (Alumno facilitadorSuplente : facilitadoresSuplentes) {
            System.out.println(facilitadorSuplente.nombre);
        }
    }
}
