package Datos;

public class Arbol {

    protected NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public Arbol(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public NodoArbol raizArbol() {
        return raiz;
    }

    boolean esVacio() {
        return raiz == null;
    }
//crea nuevo nodo

    public static NodoArbol nuevoArbol(NodoArbol ramaIzq, Object dato, NodoArbol ramaDrcha) {
        return new NodoArbol(ramaIzq, dato, ramaDrcha);
    }

    public void Or1(NodoArbol r, int n) {
        if (r != null) {
            if (n > 0) {
                r.visitar();
            }
            if (r.getIzq() != null) {
                r.getIzq().visitar();
            }
            if (r.getDer() != null) {
                r.getDer().visitar();
            }
            // System.out.println("---::"+n);           
            Or1(r.getIzq(), n - 1);
        }
    }

    public void preorden(NodoArbol r) {
        if (r != null) {
            r.visitar();
            preorden(r.getIzq());
            preorden(r.getDer());
        }
    }

    public void inorden(NodoArbol r) {
        if (r != null) {
            inorden(r.getIzq());
            r.visitar();
            inorden(r.getDer());
        }
    }

    public void postorden(NodoArbol r) {
        if (r != null) {
            postorden(r.getIzq());
            postorden(r.getDer());
            r.visitar();
        }
    }

}
