package entidades;

import java.util.Random;

public class Cine {
    private String pelicula;
    private String[][] sala;
    private double precioEntrada;

    public Cine(String pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = new String[8][6];
        this.precioEntrada = precioEntrada;
        inicializarSala();
    }

    private void inicializarSala() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = " ";
            }
        }
    }

    public boolean hayEspacioLibre() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ubicarEspectador(Espectador espectador) {
        Random random = new Random();

        while (hayEspacioLibre()) {
            int fila = random.nextInt(sala.length);
            int columna = random.nextInt(sala[0].length);

            if (sala[fila][columna].equals(" ")) {
                if (espectador.getEdad() >= 18 && espectador.getDinero() >= precioEntrada) {
                    sala[fila][columna] = "X";
                    return true;
                } else if (espectador.getEdad() < 18 && espectador.getDinero() >= precioEntrada / 2) {
                    sala[fila][columna] = "X";
                    return true;
                }
            }
        }

        return false;
    }

    public void mostrarTabla() {
        for (int i = sala.length - 1; i >= 0; i--) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }
    }
}