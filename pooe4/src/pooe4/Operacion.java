/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe4;

/**
 *
 * @author Nico
 */

    import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    // Métodos constructores
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    // Métodos get y set
    public double getNumero1() {
        return this.numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return this.numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Método para pedir al usuario los números de la operación
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos para realizar las operaciones
    public double sumar() {
        return this.numero1 + this.numero2;
    }
    
    public double restar() {
        return this.numero1 - this.numero2;
    }
    
    public double multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        } 
        
        return this.numero1 * this.numero2;
    }
    
    public double dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } 
        
        return this.numero1 / this.numero2;
    }

    // Método principal
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();

        System.out.println("El resultado de la suma es: " + operacion.sumar());
        System.out.println("El resultado de la resta es: " + operacion.restar());
        System.out.println("El resultado de la multiplicación es: " + operacion.multiplicar());
        System.out.println("El resultado de la división es: " + operacion.dividir());
    }
}


