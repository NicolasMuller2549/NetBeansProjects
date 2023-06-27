/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico;

/**
 *
 * @author nico muller
 */

   public class Electrodomestico {
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color) {
        String colorLowerCase = color.toLowerCase();
        if (colorLowerCase.equals("blanco") || colorLowerCase.equals("negro") || colorLowerCase.equals("rojo") ||
                colorLowerCase.equals("azul") || colorLowerCase.equals("gris")) {
            return colorLowerCase;
        } else {
            return "blanco";
        }
    }

    public void crearElectrodomestico() {
        // Se puede implementar para solicitar información al usuario y llenar los atributos del electrodoméstico
    }

    public double precioFinal() {
        double precioBase = 1000;
        double precioFinal = precioBase;

        // Lógica para calcular los incrementos según el consumo energético
        // y el peso del electrodoméstico

        if (consumoEnergetico == 'A') {
            precioFinal += 1000;
        } else if (consumoEnergetico == 'B') {
            precioFinal += 800;
        } else if (consumoEnergetico == 'C') {
            precioFinal += 600;
        } else if (consumoEnergetico == 'D') {
            precioFinal += 500;
        } else if (consumoEnergetico == 'E') {
            precioFinal += 300;
        } else if (consumoEnergetico == 'F') {
            precioFinal += 100;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
}


