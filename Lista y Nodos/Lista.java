/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import java.util.Scanner;

public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista crearLista() {
        int x;
        Scanner scan = new Scanner(System.in);
        primero = null;

        do {
            System.out.println("Ingrese un valor ");
            x = scan.nextInt();

            if (x != -1) {
                primero = new Nodo(x, primero);
            }
        } while (x != -1);
        return this;
    }

    public void visualizar() {
        Nodo n;
        n = primero;

        while (n != null) {
            //k=(Integer)n.getDato();
            System.out.println(n.getDato() + " ");
            n = n.getEnlace();
        }
    }

    public Nodo getPrimero() {
        return primero;

    }

    public Lista insertarCabezaLista(Object entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.setEnlace(primero); // enlaza nuevo nodo al frente de la lista
        primero = nuevo; // mueve primero y apunta al nuevo nodo
        return this; // devuelve referencia del objeto Lista
    }
    /*Inserta entre dos nodos*/

    public Lista insertarLista(Nodo anterior, Object entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.setEnlace(anterior.getEnlace()); // enlaza nuevo nodo al anterior
        anterior.setEnlace(nuevo); // mueve anterior y apunta al nuevo nodo
        return this; // devuelve referencia del objeto Lista
    }

    /* inserta un nuevo elemento al final*/
    public Lista insertarUltimo(Nodo ultimo, Object entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        ultimo.setEnlace(nuevo);
        ultimo = ultimo.getEnlace();
        return this;

    }

    /*Permite insertar despues de un nodo X*/
    public Lista insertarLista2(Object testigo, Object entrada) {
        Nodo nuevo, anterior;
        anterior = buscarLista(testigo);
        if (anterior != null) {
            nuevo = new Nodo(entrada);
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }

    public Nodo buscarLista(Object destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.getEnlace()) {
            if (destino == indice.getDato()) // (destino.equals(indice.dato))
            {
                return indice;
            }
        }
        return null;
    }

    /* entrega el nodo dado una posicion X */
    public Nodo buscarPosicion(int posicion) {
        Nodo indice;
        int i;
        if (posicion < 0) // posición ha de ser mayor que 0
        {
            return null;
        }
        indice = primero;
        // recorre la lista y cuando llega a la posicion -1  retorna indice.enlace
        for (i = 1; (i < posicion) && (indice != null); i++) {
            indice = indice.getEnlace();
        }
        return indice;
    }

    public void eliminar(Object entrada) {
        Nodo actual, anterior;
        boolean encontrado;

        actual = primero;
        anterior = null;
        encontrado = false;

        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.getDato() == entrada);

            if (!encontrado) {
                anterior = actual;
                actual = actual.getEnlace();
            }
        }

        if (actual != null) {

            if (actual == primero) {
                primero = actual.getEnlace();
            } else {
                anterior.setEnlace(actual.getEnlace());
            }
            actual = null; // no es necesario al ser una variable local
        }
    }

}
