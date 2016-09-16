/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoparcial;

import java.util.InputMismatchException;
import java.util.Vector;

/**
 *
 * @author ASUS
 */

public class Binaria extends Busquedas implements MOrdenamiento {
    
    int auxiliar;
    @Override
    public void MSeleccion(int[] x) {
          for(int i=0; i<x.length; i++){  
            int m=i;
            for (int j=i+1; j < x.length; j++){
                if(x[j]<x[m]){
                    m=j;    
                }
            }
                auxiliar=x[i];
                x[i]=x[m];
                x[m]=auxiliar;
        }
    }

    @Override
    public void MBurbuja(int[] v) {
           int i, j, aux;
         for(i=0;i<v.length-1;i++)
              for(j=0;j<v.length-i-1;j++)
                   if(v[j+1]<v[j]){
                      aux=v[j+1];
                      v[j+1]=v[j];
                      v[j]=aux;
                   }
    }

    @Override
    public void MQSort(int [] v) {
        MQSort1(v, 0, v.length-1);
    }
    
    public void MQSort1(int[] v, int izq, int der){
        int pivote=v[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(v[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(v[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= v[i];                  // los intercambia
         v[i]=v[j];
         v[j]=aux;
     }
   }
   v[izq]=v[j]; // se coloca el pivote en su lugar de forma que tendremos
   v[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      MQSort1(v,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      MQSort1(v,j+1,der); // ordenamos subarray derecho
    }   

    @Override
    public int Busqueda(int[] v, int a) {
        
        int centro; //se posiciona en el centro del vector
        int inicio=0; //posición inicial
        int fin=(v.length)-1;  //posición final
        while(inicio<=fin){  
            centro=(fin+inicio)/2; 
            if(v[centro]==a){ //busca coincidencia en la posición central
                return centro; //regresa la posición central
            }
            else if(a < v[centro] ){  //si el número a buscar es menor que el centro hacia la derecha
                fin=centro-1; 
            } else { 
                inicio=centro+1; //de no ser así, recorre el centro hacia la izquierda
            }
           
            
        }
         return -1; //regresa -1 si no encuentra el elemento
    }
       
    public static void menu(Binaria e, int[] v){
        boolean b=false;
        int w;
        //Opciones del usuario
        System.out.println("Escribe 1 para ordenamiento por selección \nEscribe 2 para ordenamiento por el método de la burbuja \nEscribe 3 para ordenamiento Quicksort \nEscriba 4 para salir.");
        //Excepción del scanner en caso de que se introduzcan valores que no sean enteros
        try{
        w=sc.nextInt(); }
        catch(InputMismatchException x){
           sc.nextLine();
           w=0;
        }
        
            if(w==1){
                e.MSeleccion(v); //Ordena el vector por el método de selección
               
            } else if(w==2){
                e.MBurbuja(v); //Ordena el vector por el método de la burbuja
                
            }else if(w==3){
                e.MQSort(v); //Ordena el vector por el método de QuickSort
                
            }
            else if(w==4){ //Se sale del programa
                System.out.println("¡Hasta luego! \n(⊃｡•́‿•̀｡)⊃━☆ﾟ.*･｡ﾟ");
                
                e.MostrarResultado(-4);
            }else{ 
            System.out.println("Opción inválida (⋟﹏⋞)"); //Si el usuario introduce un número fuera del rango de opciones o un caractér
            System.out.println("Intenta de nuevo.");
            menu(e,v);    //se manda a llamar a sí mismo y vuelve a preguntar
            }



}
    
   



    
    
}
