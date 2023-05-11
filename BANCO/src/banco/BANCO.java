/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import banco.servicios.CuentaBancariaServicio;
import entidades.CuentaBancaria;


/**
 *
 * @author Nico
 */
public class BANCO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio cuentaServicio = new CuentaBancariaServicio();
CuentaBancaria cuenta = cuentaServicio.crearCuenta();
    // Ingresar dinero
cuentaServicio.ingresar(cuenta, 500.0);

// Retirar dinero
cuentaServicio.retirar(cuenta, 200.0);

// Realizar extracción rápida
cuentaServicio.extraccionRapida(cuenta);

// Consultar saldo
cuentaServicio.consultarSaldo(cuenta);

// Consultar datos de la cuenta
cuentaServicio.consultarDatos(cuenta);
    
    }
}
    

