package ded_10;

public class Arbol {

    protected Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo raizArbol() {
        return raiz;
    }

    boolean esVacio() {
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo ramaIzq, Object dato, Nodo ramaDrcha) {
        return new Nodo(dato, ramaIzq, ramaDrcha);
    }

    public void Or1(Nodo r,int n) {
        if (r != null) {
            if(n>0)
               r.visitar();
            if(r.getIzq()!=null)                
                r.getIzq().visitar();
            if(r.getDer()!=null)
                r.getDer().visitar();
           // System.out.println("---::"+n);           
            Or1(r.getIzq(),n-1);
        }
    }

    public void preorden(Nodo r) {
        if (r != null) {
            r.visitar();
            preorden(r.getIzq());
            preorden(r.getDer());
        }
    }

    public void inorden(Nodo r) {
        if (r != null) {
            inorden(r.getIzq());
            r.visitar();
            inorden(r.getDer());
        }
    }

    public void postorden(Nodo r) {
        if (r != null) {
            postorden(r.getIzq());
            postorden(r.getDer());
            r.visitar();
        }
    }
}
