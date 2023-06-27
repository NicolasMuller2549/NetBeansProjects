/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherencia;

/**
 *
 * @author nico muller
 */
public class Animal {
   
    private final String nombre;
    private final String alimento;
    private final int edad;
    private final String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void Alimentarse() {
        System.out.println("Soy un animal y me alimento de " + alimento);
    }
}







