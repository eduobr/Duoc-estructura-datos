/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

/**
 *
 * @author solea
 */
public class Nodo {

    private Object dato;
    private Nodo enlace;

    public Nodo(Object x) {
        this.dato = x;
        this.enlace = null;
    }

    public Nodo(Object x, Nodo n) {
        setDato(x);
        setEnlace(n);
    }

    public Object getDato() {
        return dato;
    }
    public void setDato(Object x)
    {
        this.dato= x;
    }
    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}