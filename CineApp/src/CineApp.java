
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Cine;

public class CineApp{
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("El Padrino", 180, 18, "Francis Ford Coppola");
        Cine cine = new Cine("El Padrino", 10);

        cine.mostrarTabla();

        for (int i = 0; i < 30; i++) {
            Espectador espectador = new Espectador("Espectador " + (i + 1), 15 + i, 20 + i);
            if (!cine.ubicarEspectador(espectador)) {
                System.out.println(espectador.getNombre() + " no cumple los requisitos para ver la película.");
            }
        }

        System.out.println();
        cine.mostrarTabla();
    }
}