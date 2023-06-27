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
public class Lavadora extends Electrodomestico{

    private double carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        // Implementación para solicitar información al usuario y llenar los atributos de la lavadora
        super.crearElectrodomestico();
        // Llenar el atributo propio de la lavadora (carga)
    }

    @Override
       public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (carga > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}
