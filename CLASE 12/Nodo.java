
package ded_10;


public class Nodo {
    Object dato;
    Nodo izq;
    Nodo der;

    public Nodo() {
    }

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public Nodo(Object dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    void visitar(){
        System.out.println(dato+" ");
    }
}
