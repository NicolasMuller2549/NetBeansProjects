/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segurosapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import segurosapp.entidades.Cliente;
import segurosapp.entidades.Cuota;
import segurosapp.entidades.Poliza;
import segurosapp.entidades.Vehiculo;

public class SegurosApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear clientes
        Cliente cliente1 = crearClienteDesdeConsola(scanner);
        Cliente cliente2 = crearClienteDesdeConsola(scanner);

        // Crear vehículos
        Vehiculo vehiculo1 = crearVehiculoDesdeConsola(scanner);
        Vehiculo vehiculo2 = crearVehiculoDesdeConsola(scanner);

        // Crear pólizas
        Poliza poliza1 = crearPolizaDesdeConsola(scanner, cliente1, vehiculo1);
        Poliza poliza2 = crearPolizaDesdeConsola(scanner, cliente2, vehiculo2);

        // Asociar vehículos y clientes a las pólizas
        poliza1.setCliente(cliente1);
        poliza1.setVehiculo(vehiculo1);

        poliza2.setCliente(cliente2);
        poliza2.setVehiculo(vehiculo2);

        // Crear formatos de fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Crear objetos de fecha
        Date fecha1 = null;
        Date fecha2 = null;
        Date fecha3 = null;
        try {
            fecha1 = dateFormat.parse("2023-01-15");
            fecha2 = dateFormat.parse("2023-02-15");
            fecha3 = dateFormat.parse("2023-03-15");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Crear cuotas
        Cuota cuota1 = new Cuota(1, 100000, false, fecha1, "Efectivo");
        Cuota cuota2 = new Cuota(2, 100000, true, fecha2, "Transferencia");
        Cuota cuota3 = new Cuota(3, 100000, false, fecha3, "Efectivo");

        // Asociar cuotas a las pólizas
        poliza1.agregarCuota(cuota1);
        poliza1.agregarCuota(cuota2);

        poliza2.agregarCuota(cuota3);

        // Mostrar información de los clientes
        System.out.println("Información de los clientes:");
        System.out.println(cliente1);
        System.out.println(cliente2);

        // Mostrar información de los vehículos
        System.out.println("Información de los vehículos:");
        System.out.println(vehiculo1);
        System.out.println(vehiculo2);

        // Mostrar información de las pólizas
        System.out.println("Información de las pólizas:");
        System.out.println(poliza1);
        System.out.println(poliza2);

        // Mostrar información de las cuotas de la póliza 1
        System.out.println("Cuotas de la póliza 1:");
        List<Cuota> cuotasPoliza1 = poliza1.getCuotas();
        for (Cuota cuota : cuotasPoliza1) {
            System.out.println(cuota);
        }
    }

    private static Cliente crearClienteDesdeConsola(Scanner scanner) {
        System.out.println("Ingrese los datos del cliente:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        return new Cliente(nombre, dni, email, direccion, telefono);
    }

    private static Vehiculo crearVehiculoDesdeConsola(Scanner scanner) {
        System.out.println("Ingrese los datos del vehículo:");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Año: ");
        int anio = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Número de Chasis: ");
        String numChasis = scanner.nextLine();

        System.out.print("Número de Motor: ");
        String numMotor = scanner.nextLine();

        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        return new Vehiculo(marca, modelo, anio, numChasis, numMotor, color, tipo);
    }

    private static Poliza crearPolizaDesdeConsola(Scanner scanner, Cliente cliente, Vehiculo vehiculo) {
        System.out.println("Ingrese los datos de la póliza:");

        System.out.print("Número de Póliza: ");
        String numPoliza = scanner.nextLine();

        System.out.print("Fecha de Inicio (yyyy-MM-dd): ");
        String fechaInicio = scanner.nextLine();

        System.out.print("Fecha de Fin (yyyy-MM-dd): ");
        String fechaFin = scanner.nextLine();

        System.out.print("Cantidad de Cuotas: ");
        int cantCuotas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Forma de Pago: ");
        String formaPago = scanner.nextLine();

        System.out.print("Valor Asegurado: ");
        double valorAsegurado = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Tiene Descuento? (true/false): ");
        boolean tieneDescuento = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Monto Descuento: ");
        double montoDescuento = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Tipo de Cobertura: ");
        String tipoCobertura = scanner.nextLine();

        Poliza poliza = new Poliza(numPoliza, fechaInicio, fechaFin, cantCuotas, formaPago, valorAsegurado, tieneDescuento, montoDescuento, tipoCobertura);
        poliza.setCliente(cliente);
        poliza.setVehiculo(vehiculo);

        return poliza;
    }
}
