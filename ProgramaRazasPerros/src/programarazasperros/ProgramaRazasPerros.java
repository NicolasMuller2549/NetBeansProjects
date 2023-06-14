package programarazasperros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ProgramaRazasPerros {
    public static void main(String[] args) {
        // Crear ArrayList para almacenar las razas de perros
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            // Pedir al usuario que ingrese una raza de perro y agregarla a la lista
            System.out.print("Ingrese una raza de perro: ");
            String raza = scanner.nextLine();
            razasPerros.add(raza);

            // Preguntar al usuario si desea ingresar otra raza de perro
            System.out.print("¿Desea ingresar otra raza de perro? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        // Mostrar todas las razas de perros ingresadas
        System.out.println("Razas de perros ingresadas:");
        razasPerros.forEach((raza) -> {
            System.out.println(raza);
        });

        // Pedir al usuario que ingrese el nombre de un perro para buscar y eliminar de la lista
        System.out.print("Ingrese el nombre de un perro para buscar y eliminar de la lista: ");
        String perroABuscar = scanner.nextLine();

        // Crear un Iterator para recorrer la lista
        Iterator<String> iterator = razasPerros.iterator();
        boolean encontrado = false;

        // Recorrer la lista y buscar el perro ingresado por el usuario
        while (iterator.hasNext()) {
            String raza = iterator.next();
            if (raza.equalsIgnoreCase(perroABuscar)) {
                iterator.remove(); // Eliminar el perro de la lista
                encontrado = true; // Marcar como encontrado
            }
        }

        // Mostrar mensaje dependiendo de si el perro fue encontrado o no
        if (encontrado) {
            System.out.println("Perro eliminado de la lista.");
        } else {
            System.out.println("El perro no se encuentra en la lista.");
        }

        // Ordenar la lista de razas de perros alfabéticamente
        Collections.sort(razasPerros);

        // Mostrar la lista de razas de perros ordenada
        System.out.println("Lista de razas de perros ordenada:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}
