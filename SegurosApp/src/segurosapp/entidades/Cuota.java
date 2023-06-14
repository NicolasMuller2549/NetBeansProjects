/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segurosapp.entidades;

import java.util.Date;

/**
 *
 * @author nico muller
 */
public class Cuota {
      private int numeroCuota;
    private double montoTotalCuota;
    private boolean estaPagada;
    private Date fechaVencimiento;
    private String formaPago;

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isEstaPagada() {
        return estaPagada;
    }

    public void setEstaPagada(boolean estaPagada) {
        this.estaPagada = estaPagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Cuota() {
    }

    public Cuota(int numeroCuota, double montoTotalCuota, boolean estaPagada, Date fechaVencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.estaPagada = estaPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

 
}
