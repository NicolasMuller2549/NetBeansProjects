/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;
import java.util.HashSet;

/**
 *
 * @author nico muller
 */
public class CafeteriaServicio {

    private Cafetera cafetera;

    public CafeteriaServicio(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera se lleno.");

    }

    public void servirTaza(int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("Se lleno la taza.");
        } else {
            int cantidadServida = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("No se pudo llenar la taza.");
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera esta vacia.");
    }

    public void agregarCafe(int cantidad) {
        int cantidadActual = cafetera.getCantidadActual();
        int capacidadMaxima = cafetera.getCapacidadMaxima();
        if (cantidadActual + cantidad > capacidadMaxima) {
            System.out.println("Se lleno la cafetera ,no se pudo cargar mas");
           cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        } else {
            cafetera.setCantidadActual(cantidadActual + cantidad);
            System.out.println("Se agrego el cafe a la cafetera");
        }

    }

}
