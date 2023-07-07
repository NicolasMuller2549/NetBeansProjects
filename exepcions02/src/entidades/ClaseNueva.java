
package entidades;



public class ClaseNueva {
    
    private int [] array;
    
    public ClaseNueva()
    {       
        //inicializamos el array con 5
        array = new int[5];         
    }
    
    
    public void accessArray(int index)
    {
        try {
            //intentamos acceder al elemento del arreglo
            //en el indice proporcionado
            
            int value = array[index];
            System.out.println("el valor del indice"
                    + index +" es "+ value);
            
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException ");
        }
    }
    
}
