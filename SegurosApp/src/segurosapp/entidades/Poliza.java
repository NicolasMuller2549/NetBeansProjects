package segurosapp.entidades;

import java.util.ArrayList;
import java.util.List;

public class Poliza {
    private String codigo;
    private String fechaInicio;
    private String fechaFin;
    private int cantidadCuotas;
    private String formaPago;
    private double monto;
    private boolean tieneDescuento;
    private double descuento;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private List<Cuota> cuotas;

    public Poliza(String codigo, String fechaInicio, String fechaFin, int cantidadCuotas, String formaPago,
                  double monto, boolean tieneDescuento, double descuento, String tipoCobertura) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.monto = monto;
        this.tieneDescuento = tieneDescuento;
        this.descuento = descuento;
        this.tipoCobertura = tipoCobertura;
        this.cuotas = new ArrayList<>();
    }

    public void agregarCuota(Cuota cuota) {
        cuotas.add(cuota);
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "codigo='" + codigo + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", cantidadCuotas=" + cantidadCuotas +
                ", formaPago='" + formaPago + '\'' +
                ", monto=" + monto +
                ", tieneDescuento=" + tieneDescuento +
                ", descuento=" + descuento +
                ", tipoCobertura='" + tipoCobertura + '\'' +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
