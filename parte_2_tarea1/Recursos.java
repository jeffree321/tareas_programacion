//COMENSO LO DIFICIL PAPAaa XD
package com.mycompany.parte_2_tarea1;


public class Recursos {

     //Comensamos declarando nuestras variables 
    String msj="";
    String nota="";
    int num1=0,num2=0;
    
    //primer metodo
 public String mostrarMensaje()
 {
     String msj="Estoy Aprendiendo,Pero sere el mejor Programador del mundo\n";
     return msj;
 }
 //segundo metodo 
    public String nota()
    {
       int not=80;
       String msj = "";
       if(not>=70)
       {
msj="Aprobado";
       }else if(not<70)
       {
msj="Reprobado";
       }
        return msj;
    }
    // tercer metodo 
 public int division(int nota1,int nota2)        
 {
     int division = 0;
     
     if(nota1>0 && nota2>0)
     {
     division=nota1/nota2;
     }else if(nota1 == 0 || nota2 == 0){
         System.out.println("lo que ingreso no esta correcto \n");
     }
   return division;  
 }
 
 //cuarto metodo
 public int numero(int num)
 {
     int i=1;
 for(i=1;i<=num;i++)
 {
     System.out.println(i);
 
 }
 
return i ;    
}
 
 
}
   
        
    
    

