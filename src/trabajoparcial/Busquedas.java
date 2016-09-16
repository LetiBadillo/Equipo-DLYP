/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoparcial;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;
/*


f.	QueBusco. Que devuelva un entero que representa el número a buscar dentro del vector proporcionado por el usuario.
g.	Busqueda (Abstracta) que regrese un entero y reciba como parámetros un vector y el elemento a buscar.
*/
/**
 *
 * @author ASUS
 */
public abstract class Busquedas {
 static int[] vector;
 static Scanner sc = new Scanner(System.in);
 static int a;
 
 public int[] GetVector(){ return this.vector; }   //Devuelve el vector del objeto

 public void SetVector(int[] v){ this.vector=v;} //Constructor
 
 public void MostrarVector(int[] v){ 
    System.out.println("Elementos:");
     for (int i=0; i<v.length; i++){ //Recorre el vector e imprime sus elementos
        
        System.out.print("|"+v[i]+"|");
        
        }
    System.out.println("");
 }


public void MostrarResultado(int q){ //Utilizando el método de búsqueda imprime la posición del elemento en el vector
  
    if(q==-1){ //si método buscar regresó -1, significa que no se encontraron coincidencias
    
    System.out.println("El número no se encuentra en el vector.");
    }else if(q>=0){ //si es diferente de -1, imprime la posición devuelta+1
        System.out.println("El elemento se encuentra en la posición "+(q+1));    
    }else if(q==-4){
        System.exit(0);   
    }
    
    
}

public static int[] CrearVector(){ 
    
    int c, e;
        System.out.println("Introduzca el número de elementos del vector");
        c = sc.nextInt(); //almacena el número de elementos en variable c
        vector = new int [c]; //Crea el vector dados los estándares del usuario
        
        for(int i=0; i<vector.length; i++){
        System.out.println("Introduzca el elemento #"+(i+1)+" y presione enter"); //pide el número de elementos
        e=sc.nextInt();
        vector[i]=e;    
        }
        
    return vector; //Devuelve el vector creado a partir de la información solicitada por el usuario.
}
/*f.	QueBusco. Que devuelva un entero que representa el número a buscar dentro del vector proporcionado por el usuario.*/

public static int QueBusco(){ //Devuelve el número que el usuario busca
   boolean e=true;
   while(e==true){ //Mientras que e sea true, va a preguntar qué elemento se busca
   System.out.println("¿Qué elemento está buscando?"); //Pregunta al usuario
   try{
       a=sc.nextInt(); //almacena lo que el usuario introdujo
       e=false; //termina con el while
   }
   catch(InputMismatchException x){ //Si el usuario introduce accidentalmente algún valor que no sea entero
           System.out.println("Opción inválida. Prueba otra vez."); //Imprime mensaje para que lo pueda volver a intentar
           sc.nextLine(); 
           e=true;   //Continúa con el while
                    }
           
        }
    return a; //regresa el valor que se va a buscar
}

abstract public int Busqueda(int[]v, int a);
   
}

