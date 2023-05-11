/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.servicios;

import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class CuentaBancariaServicio {
     private Scanner scanner = new Scanner(System.in);
    
    //  crear cuenta pidiéndole los datos al usuario
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        long dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        double saldoActual = scanner.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    //mete una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += cantidad;
        cuenta.setSaldoActual(saldoActual);
        System.out.println("Se ha ingresado " + cantidad + " pesos en la cuenta.");
   }
    
    // recibe una cantidad de dinero a retirar y se le restará al saldo actual y si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public void retirar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
            cuenta.setSaldoActual(saldoActual);
            System.out.println("Se ha retirado " + cantidad + " pesos de la cuenta.");
        } else {
            saldoActual = 0;
            cuenta.setSaldoActual(saldoActual);
            System.out.println("No se puede retirar esa cantidad, se ha retirado el máximo posible. Saldo actual: " + saldoActual + " pesos.");
        }
    }
    
    //  extraccionRapida  sacar solo un 20% de su saldo y validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        double limiteExtraccion = saldoActual * 0.2;
        System.out.println("El límite de extracción es de " + limiteExtraccion + " pesos. ¿Desea retirar esa cantidad? (S/N)");
        char respuesta = scanner.next().charAt(0);
        if (respuesta == 'S' || respuesta == 's') {
            cuenta.setSaldoActual(saldoActual - limiteExtraccion);
            System.out.println("Se ha retirado " + limiteExtraccion + " pesos de la cuenta.");
        } else {
            System.out.println("Operación cancelada.");
        }
    }
    
    // consultarSaldo consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldoActual() + " pesos.");
    }
    
    // consultarDatos , mostrar todos los datos de la cuenta.
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
    System.out.println("DNI del cliente: " + cuenta.getDniCliente());
    System.out.println("Saldo actual: " + cuenta.getSaldoActual());
}
}
        

