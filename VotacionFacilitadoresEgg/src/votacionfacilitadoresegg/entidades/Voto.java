/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacionfacilitadoresegg.entidades;

import java.util.List;

/**
 *
 * @author nico muller
 */
public class Voto {
     Alumno alumno;
    List<Alumno> votosRealizados;

    public Voto(Alumno alumno, List<Alumno> votosRealizados) {
        this.alumno = alumno;
        this.votosRealizados = votosRealizados;
    }
}
