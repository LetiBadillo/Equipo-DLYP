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

public interface MOrdenamiento {
    /*MSeleccion, MBurburja, MQSort, que todos reciban como parámetro un vector de enteros.*/
    
    public void MSeleccion(int[] v);
    public void MBurbuja(int[] v);
    public void MQSort(int[] v);
}
