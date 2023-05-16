
import cursoServicios.cursoServicios;
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
         cursoServicios c1 = new cursoServicios();
         c1.crearCurso(curso);
         System.out.println("Las ganancias de Curso fueron: " +c1.calcularGananciaSemanal(curso));
            
         System.out.println(curso.toString());
        
    }
}
        
