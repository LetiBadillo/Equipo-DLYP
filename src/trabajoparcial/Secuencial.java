/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoparcial;

import java.util.Vector;

/**
 * Equipo DLYP
 * "DLYPeando hasta el fin"
 *Blanca Leticia Badillo Guzmán 
 *Daniel Alejandro Salinas Olivares 
 *Dante Augusto Sinencio Álvarez
 *Jesús Parga Vela
 */


public class Secuencial extends Busquedas{

    @Override
    public int Busqueda(int[] v, int a) {
        boolean b;
         for (int i=0; i<v.length; i++){ //recorre el vector 
                if (v[i]==a){ //busca coincidencias
                b=true;
                return i; //regresa la posición del vector
                }
            
                
        } return -1; //regresa -1 si no existe el elemento
        } 
    }
    

