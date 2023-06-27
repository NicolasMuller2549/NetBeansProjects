/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacionfacilitadoresegg.entidades;

/**
 *
 * @author nico muller
 */
public class Alumno {
        String nombre;
    int dni;
    int cantidadVotos;

    public Alumno(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.cantidadVotos = 0;
    }
}
