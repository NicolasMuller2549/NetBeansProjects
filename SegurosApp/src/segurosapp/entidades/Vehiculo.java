package segurosapp.entidades;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String numeroMotor;
    private String numeroChasis;
    private String color;
    private String tipo;

    public Vehiculo(String marca, String modelo, int anio, String numeroMotor, String numeroChasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.numeroChasis = numeroChasis;
        this.color = color;
        this.tipo = tipo;
    }

    // Agrega los getters y setters si es necesario

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", numeroMotor='" + numeroMotor + '\'' +
                ", numeroChasis='" + numeroChasis + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
