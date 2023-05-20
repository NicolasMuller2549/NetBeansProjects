/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author nico muller
 */
public class entidadesAhorcado{
        private final String palabraSecreta;
    private final boolean[] letrasAdivinadas;
    private int intentos;

    public entidadesAhorcado(String palabraSecreta, int intentos) {
        this.palabraSecreta = palabraSecreta.toLowerCase();
        this.intentos = intentos;
        this.letrasAdivinadas = new boolean[palabraSecreta.length()];
    }

    public boolean intentarLetra(char letra) {
        boolean letraAdivinada = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                letrasAdivinadas[i] = true;
                letraAdivinada = true;
            }
        }

        if (!letraAdivinada) {
            intentos--;
        }

        return letraAdivinada;
    }

    public boolean adivinadoTodasLetras() {
        for (boolean adivinada : letrasAdivinadas) {
            if (!adivinada) {
                return false;
            }
        }
        return true;
    }

    public boolean haPerdido() {
        return intentos == 0;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public int getIntentosRestantes() {
        return intentos;
    }

    public void mostrarPalabra() {
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (letrasAdivinadas[i]) {
                System.out.print(palabraSecreta.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
}
