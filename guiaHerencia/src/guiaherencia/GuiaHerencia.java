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
public class GuiaHerencia {

    public static void main(String[] args) {
       

    //Declaración del objeto Perro
    Animal perrol = new Perro("Stich", "Carnivoro", 15, "Doberman");
    perrol.Alimentarse();
    //Declaración de otro objeto Perro
    Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
    perro2.Alimentarse();
    //Declaración del objeto Gato
    Animal gatol = new Gato("Pelusa", "Galletas", 15, "Siamés");
    gatol.Alimentarse();
    //Declaración del objeto Caballo
    Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
    caballo1.Alimentarse();
    }
}


