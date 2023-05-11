/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Rectangulo {
    private int base ;
    private int altura ;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int  base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la altura del rectangulo");
          altura = scanner.nextInt();
          System.out.println("Por favor ingrese la base del rectangulo");
          base = scanner.nextInt();
        }   
   
    public int superficieRectangulo(){
        return base * altura ;
    }
    public int perimetroRectangulo(){
        return 2 * (base + altura);
    }
    
     public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("/n");
        }
    }
    
    
    
    
    
}
