//ya estamos legando  a la complejo pues 
package com.mycompany.parte_2_tarea1;

import java.util.Scanner;


public class segunda_part_metodos {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
    recursos1 rec=new recursos1();
    
        System.out.println(rec.mostrarMensaje());
        System.out.println("");
          System.out.println(rec.nota());
          //ingreso de datos 
       System.out.println("ingrese numero"); 
       int n1=entrada.nextInt();
       System.out.println("ingrese numero"); 
       int n2=entrada.nextInt();
       //diviion 
        rec.division(n1,n2);
        System.out.println("El resulado de la divion es:"+ rec.division(n1,n2));
        
             System.out.println("ingrese  numero"); 
       int n3=entrada.nextInt();
        System.out.println(" ");
        rec.numero(n3);
    }
    
}
