package programaadopcion;

class Persona {
    String nombre;
    String apellido;
    int edad;
    String documento;
    Perro perro;

    Persona(String nombre, String apellido, int edad, String documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }
     void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
        System.out.println("Perro:");
        System.out.println("  Nombre: " + perro.nombre);
        System.out.println("  Raza: " + perro.raza);
        System.out.println("  Edad: " + perro.edad);
        System.out.println("  Tamaño: " + perro.tamaño);
    }
}
