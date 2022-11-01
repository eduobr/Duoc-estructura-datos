/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author Duoc
 */
public class Cola {
    private int frente;
    private int fin;
    private Object[] listaCola;
    private int TAMAÑO=39;

    public Cola() {
        frente=0;
        fin=0;
        listaCola=new Object[TAMAÑO];
    }

    public Cola(int capacidad) {
        frente=0;
        fin=0;
        TAMAÑO=capacidad;
        listaCola=new Object[TAMAÑO];
    }
    
    private boolean colaVacia(){
        return fin==frente;
    }
    
    private boolean colaLlena(){
        return fin==TAMAÑO;
    }
    
    public int tamañoCola(){
        return fin-frente;
    }
    
    //insertar, quitar, ver frente
    public void insertar(Object elemento){
        if (!colaLlena()) {
            listaCola[fin]=elemento;
            fin++;
        }else{
            System.out.println("cola llena");
        }
    }
    
    
    public Object quitar() throws Exception{
        if (!colaVacia()) {
            Object aux = listaCola[frente];
            frente++;
            return aux;
        }else{
            throw new Exception("cola vacia");
        }
    }
    
    public Object verFrente() throws Exception{
        if (!colaVacia()) {
            return listaCola[frente];
        }else{
            throw new Exception("cola vacia");
        }
    }
    
    public void vaciarCola(){
        frente=0;
        fin=0;
    }
    
    public void mostrarCola() throws Exception{
        if (!colaVacia()) {
            for (int i = frente; i < fin; i++) {
                System.out.println("Elemnto: "+i+":"+listaCola[i]); 
            }
        }else{
            throw new Exception("No hay datos que mostrar");
        }
    }
    
}
