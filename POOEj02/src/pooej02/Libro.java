/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Libro {
    public String isbn;
      public String titulo;
      public String autor;
      public int numeroPaginas;
      
      public Libro(){
          
      }
    
      public Libro(String isbn,String titulo,String autor,int numeroPaginas){
          this.isbn =isbn;
          this.titulo=titulo;
          this.autor=autor;
          this.numeroPaginas=numeroPaginas;
          
      }
public void cargarLibro(){
    Scanner leer = new Scanner(System.in);
    System.out.print("Introduce el numero de ISBN: ");
    this.isbn = leer.nextLine();
     System.out.print("Introduce el titulo del libro: ");
    this.titulo= leer.nextLine();
     System.out.print("Introduce el autor del libro: ");
    this.autor = leer.nextLine();
     System.out.print("Introduce el numero de paginas: ");
    this.numeroPaginas = leer.nextInt();
}

public void informeLibro(){
    System.out.println("ISBN: " +  this.isbn);
     System.out.println("Titulo: " + this.titulo);
      System.out.println("Autor: " +this.autor);
       System.out.println("Numero de Paginas: " + this.numeroPaginas);
    
}
}
