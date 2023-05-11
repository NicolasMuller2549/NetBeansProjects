/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParDeNumerosService;

import entidades.ParDeNumeros;

/**
 *
 * @author nico muller
 */
public class ParDeNumerosService {
     public static void mostrarValores(ParDeNumeros par) {
        System.out.println("Los valores guardados son " + par.getNum1() + " y " + par.getNum2());
    }

    public static double devolverMayor(ParDeNumeros par) {
        return Math.max(par.getNum1(), par.getNum2());
    }

    public static double calcularPotencia(ParDeNumeros par) {
        double mayor = Math.max(par.getNum1(), par.getNum2());
        double menor = Math.min(par.getNum1(), par.getNum2());
        int mayorRedondeado = (int) Math.round(mayor);
        int menorRedondeado = (int) Math.round(menor);
        return Math.pow(mayorRedondeado, menorRedondeado);
    }

    public static double calcularRaiz(ParDeNumeros par) {
        double menor = Math.min(par.getNum1(), par.getNum2());
        double absoluto = Math.abs(menor);
        return Math.sqrt(absoluto);
    }
}

