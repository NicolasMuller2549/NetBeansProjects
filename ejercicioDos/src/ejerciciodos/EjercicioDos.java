/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingese su nombre: ");
        nombre = leer.next();
        System.out.println("Su numbre es: " + nombre);
    }
    
}
