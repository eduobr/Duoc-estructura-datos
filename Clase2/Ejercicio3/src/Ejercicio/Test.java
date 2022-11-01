/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio;

/**
 *
 * @author Duoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRUEBA N°1
        int[] a = new int[]{100,2,3,5,1,220,6,50,20};
        busquedas.ordInsercion(a);
        busquedas.ordSeleccion(a);
        
        for (int i : a) {
            System.out.println("valor:"+i);
        }
        
        int busc1 = busquedas.buscar(a,6);
        int busc2 = busquedas.buscar(a,100);
        int busc3 = busquedas.buscar(a,3400);
        
        System.out.println(busc1);
        System.out.println(busc2);
        System.out.println(busc3);
        
        int[] a1 = new int[]{4,7,11,4,9,11,7,3,5};
        
        busquedas.eliminarDuplicado(a1);
    }
    
}
