/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoparcial;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public interface MOrdenamiento {
    /*MSeleccion, MBurburja, MQSort, que todos reciban como parámetro un vector de enteros.*/
    
    public void MSeleccion(int[] v);
    public void MBurbuja(int[] v);
    public void MQSort(int[] v);
}
