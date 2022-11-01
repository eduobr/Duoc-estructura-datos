
package DED;


public class PilaDinamica {
    private Nodo cima;

    public PilaDinamica() {
        cima=null;
    }

    public PilaDinamica(Object dato) {
        cima=new Nodo(dato);
    }

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }
    public void insertar(Object elemento){
        Nodo nuevo;
        nuevo=new Nodo(elemento);
        nuevo.setEnlace(cima);
        cima=nuevo;
    }
    public Object quitar(){
        if(pilaVacia()){
            System.out.println("Pila Vacia");
            return null;
        }
        Nodo aux=getCima();
        setCima(aux.getEnlace());
        return aux.getDato();
    }
    public Object cimaPila(){
        if(pilaVacia()){
            System.out.println("Pila Vacia");
            return null;
        }
        return getCima().getDato();
    }
    public void limpiaPila(){
        Nodo aux;
        while (!pilaVacia()) {            
            aux=getCima();
            setCima(aux.getEnlace());
            aux.setEnlace(null);
        }
    }
    public String escribir(){
        Nodo nodo=getCima();
        String texto="";
        while (nodo!=null) {            
            texto+=nodo.toString()+"\n";
            nodo=nodo.getEnlace();
        }
        return texto;
    }
    public boolean pilaVacia(){
        return getCima()==null;
    }
}
