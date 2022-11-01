/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandra
 */
public class ejemploOrd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numeros ={100,2,3,5,1,220,6,50, 20};
        int  resultado;
        busquedas bus = new busquedas();
        System.out.println("Orden por insercion");
        
        bus.ordInsercion(numeros);
        for(int a: numeros)
        {
              System.out.println(a);
        }
        
        System.out.println("Orden por seleccion");
        bus.ordSeleccion(numeros);
        for(int a: numeros)
        {
              System.out.println(a);
        }
        
         System.out.println("Busqueda binaria");
         resultado= bus.busquedaBin(numeros, 6);
         if (resultado==-1)
         {
             System.out.println("No encontrado");
         }
         else
         {
             System.out.println("Encontrado en la posicion:" + resultado);
         }
         
         resultado= bus.busquedaBin(numeros, 100);
         if (resultado==-1)
         {
             System.out.println("No encontrado");
         }
         else
         {
             System.out.println("Encontrado en la posicion:" + resultado);
         }
         
         resultado= bus.busquedaBin(numeros, 3400);
         if (resultado==-1)
         {
             System.out.println("No encontrado");
         }
         else
         {
             System.out.println("Encontrado en la posicion:" + resultado);
         }
      
        System.out.println("-------- Ejercicio 3 ---------------");
        int[] repetidos = {4, 7, 11, 4, 9, 11, 7, 3, 5,7,89};

        int val;

        for (int i = 0; i < repetidos.length; i++) {
            resultado = bus.buscarRepetido(repetidos, repetidos[i], i);
            System.out.println("resultas"+resultado);
            if (resultado > -1) {
                //repetido
                for (int j = resultado; j < repetidos.length; j++) {
                    if (j < repetidos.length - 1) {
                        val = j + 1;
                        System.out.println("Val:"+val+" - Datos:"+repetidos[val]);
                        repetidos[j] = repetidos[val]; // eliminamos el repetido
                    } else {
                        val = j;
                        repetidos[j] = 0; // llenamos de 0 los  casilleros libres
                    }
                }
            }
        }
  
        for (int a : repetidos) {
            System.out.println(a);
        } 
    }
 
}
