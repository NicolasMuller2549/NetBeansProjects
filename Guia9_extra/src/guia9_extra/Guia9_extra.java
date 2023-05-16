/*
 El programa debe pedir al usuario que 
adivine el mes secreto. Si el usuario acierta mostrar un mensaje, 
y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  
Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package guia9_extra;

import Entidades.Meses;
import java.util.Scanner;

public class Guia9_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in).useDelimiter("\n");
        do{
           Meses m = new Meses();
           System.out.println("Ingresar el mes secreto= ");
           if (op.next().equalsIgnoreCase(m.getMesSecreto())){
               System.out.println("Perfecto!!");
               break;
           }else{
               System.out.println("Infeliz proba de nuevo!");
               System.out.println("Este era!!!"+m.getMesSecreto());
           }           
        }
        while (true);
        System.out.println("gracias!!");
        
    }
    
}
