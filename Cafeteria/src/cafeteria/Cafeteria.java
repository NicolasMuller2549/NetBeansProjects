
package cafeteria;
import entidades.Cafetera;
import java.util.Scanner;
import  servicios.CafeteriaServicio;

public class Cafeteria {

  
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Cafetera cafetera = new Cafetera(1000, 500); // Capacidad máxima 1000 ml, cantidad actual 500 ml
        CafeteriaServicio cafeteriaServicio = new CafeteriaServicio(cafetera);

        do {
            System.out.println("---- MENU CAFETERA ----");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café a la cafetera");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cafeteriaServicio.llenarCafetera(cafetera);
                    break;
                case 2:
                    System.out.print("Ingrese el tamaño de la taza (ml): ");
                    int tamanoTaza = sc.nextInt();
                    cafeteriaServicio.servirTaza(tamanoTaza);
                    break;
                case 3:
                    cafeteriaServicio.vaciarCafetera();
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de cafe a agregar (ml): ");
                    int cantidad = sc.nextInt();
                    cafeteriaServicio.agregarCafe(cantidad);
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor ingrese una opcion valida.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);
    }
    }
   

