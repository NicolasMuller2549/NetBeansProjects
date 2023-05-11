
import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicios;


/**
 *
 * @author nico muller
 */
public class main {

    
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        Cadena cadena = new Cadena(frase);

        CadenaServicios cadenaServicio = new CadenaServicios(cadena);

        int opcion = 0;
        do {
            System.out.println("---------- MENÚ ----------");
            System.out.println("1. Mostrar cantidad de vocales en la frase.");
            System.out.println("2. Invertir la frase.");
            System.out.println("3. Contar cuántas veces se repite un carácter.");
            System.out.println("4. Comparar longitud de la frase con otra.");
            System.out.println("5. Unir la frase con otra.");
            System.out.println("6. Reemplazar letras en la frase.");
            System.out.println("7. Verificar si la frase contiene una letra.");
            System.out.println("8. Salir.");
            System.out.print("Ingrese la opción deseada: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cadenaServicio.mostrarVocales();
                    break;
                case 2:
                    cadenaServicio.invertirFrase();
                    break;
                case 3:
                    System.out.print("Ingrese un carácter: ");
                    String letra = sc.next();
                    cadenaServicio.vecesRepetido(letra);
                    break;
                case 4:
                    System.out.print("Ingrese otra frase: ");
                    sc.nextLine();
                    String nuevaFrase = sc.nextLine();
                    cadenaServicio.compararLongitud(nuevaFrase);
                    break;
                case 5:
                    System.out.print("Ingrese otra frase: ");
                    sc.nextLine();
                    String otraFrase = sc.nextLine();
                    cadenaServicio.unirFrases(otraFrase);
                    break;
                case 6:
                    System.out.print("Ingrese el carácter que desea reemplazar: ");
                    sc.nextLine();
                    String letraReemplazo = sc.nextLine();
                    cadenaServicio.reemplazar(letraReemplazo);
                    break;
                case 7:
                    System.out.print("Ingrese una letra: ");
                    sc.nextLine();
                    String letraBusqueda = sc.nextLine();
                    cadenaServicio.contiene(letraBusqueda);
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println();
        } while (opcion != 8);
    }
       
        
        
        
        
    }
    

