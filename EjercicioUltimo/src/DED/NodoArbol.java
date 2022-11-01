


package DED;


public class NodoArbol {
    Object dato;
    NodoArbol izqo;
    NodoArbol der;

    public NodoArbol() {
    }

    public NodoArbol(Object valor) {
        dato=valor;
        izqo=null;der=null;
    }

    public NodoArbol( NodoArbol izqo,Object dato, NodoArbol der) {
        this.dato = dato;
        this.izqo = izqo;
        this.der = der;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoArbol getIzqo() {
        return izqo;
    }

    public void setIzqo(NodoArbol izqo) {
        this.izqo = izqo;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
    
    public void vista(){
        System.out.println(dato+"");
    }
}
