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
    private int TAMANO = 39;

    public Cola() {
        frente = 0;
        fin = 0;
        listaCola = new Object[TAMANO];
    }

    public Cola(int capacidad) {
        frente = 0;
        fin = 0;
        TAMANO = capacidad;
        listaCola = new Object[TAMANO];
    }

    //Metodos vacia y llena
    private boolean colaVacia() {
        return frente == fin;
    }

    private boolean colaLlena() {
        return fin == TAMANO;
    }

    public int tamanoCola() {

        return fin - frente;
    }
    //metodos insertar,quitar,ver frente

    public void insertar(Object elemento) throws Exception {
        if (!colaLlena()) {

            listaCola[fin] = elemento;
            fin++;
        } else {
            throw new Exception("cola llena");
        }
    }

    public Object quitar() throws Exception {

        if (!colaVacia()) {
            Object aux = listaCola[frente];
            frente++;
            return aux;

        } else {
            throw new Exception("cola vacia");
        }
    }

    public Object verFrente() throws Exception {

        if (!colaVacia()) {
            return listaCola[frente];
        } else {
            throw new Exception("cola vacia");
        }
    }

    public void vaciarCola() {

        frente = 0;
        fin = 0;
    }

    public void mostraCola() throws Exception {
        if (!colaVacia()) {
            for (int i = frente; i < fin; i++) {
                System.out.println("Elemento:" + i + ":" + listaCola[i]);
            }
        } else {
            throw new Exception("no hay datos");
        }
    }

}
