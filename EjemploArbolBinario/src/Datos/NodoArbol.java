
package Datos;


public class NodoArbol {
    Object dato;
    NodoArbol izq;
    NodoArbol der;

    public NodoArbol() {
    }

    public NodoArbol(Object dato) {
        this.dato = dato;
    }

    public NodoArbol( NodoArbol izq,Object dato, NodoArbol der) {
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

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
    
    void visitar(){
        System.out.println(dato+" ");
    }
}
