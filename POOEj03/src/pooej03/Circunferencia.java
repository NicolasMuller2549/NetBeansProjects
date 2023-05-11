/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Circunferencia {
    private double radio;
    
    public Circunferencia (double radio){
        this.radio = radio;
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    }
public double getRadio(){
    return radio;
}

public void crearCircunferencia(){
    Scanner leer = new Scanner(System.in);
    System.out.print("Pone el radio ");
    this.radio=leer.nextDouble();
}

public double area(){
    return Math.PI  *  Math.pow(this.radio,2);
}

public double perimetro(){
    return 2 * Math.PI * this.radio;
}



}



