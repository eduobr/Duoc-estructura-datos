


package DED;


public class ListaEnlazada {
    private Nodo primero;

    public ListaEnlazada() {
        primero=null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    
    
    public void visualizarLista(){
        Nodo n;
        n=primero;
        int k;
        while (n!=null) {            
            System.out.println("Dato:"+n.getDato());
            n=n.getEnlace();
        }
    }
    public ListaEnlazada insertarCabeza(Object entrada){
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.setEnlace(primero);
        primero=nuevo;
        return this;
    }
    public ListaEnlazada insertarUltimo(Nodo ultimo, Object entrada){
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        ultimo.setEnlace(nuevo);
        ultimo=ultimo.getEnlace();
        return this;
    }
    public ListaEnlazada insertarLista(Nodo anterior, Object enrada){
        Nodo nuevo;
        nuevo=new Nodo(enrada);
        nuevo.setEnlace(anterior.getEnlace());
        anterior.setEnlace(nuevo);
        return this;
    }
    public Nodo buscarLista(Object destino){
        Nodo indice;
        for (indice = primero; indice!=null;indice=indice.getEnlace()) {
                if(destino==indice.getDato()){
                    return indice;
                }
        }
        return null;
    }
    public ListaEnlazada insertarDespues(Object testigo,Object entrada){
        Nodo nuevo, anterior;
        anterior=buscarLista(testigo);
        if(anterior!=null){
            nuevo=new Nodo(entrada);
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;    
    }
    public Nodo buscarPosicion(int pos){
        Nodo indice;
        if(pos<0){
            return null;
        }
        indice=primero;
        for (int i = 0;(i< pos) && (indice!=null); i++) {
            indice=indice.getEnlace();
        }
        return indice;
    }
    public void eliminarNodo(Object entrada){
        Nodo actual, anterior;
        boolean encontro;
        actual=primero;
        anterior=null;
        encontro=false;
        while ((actual!=null) && (!encontro)) {            
            encontro=(actual.getDato()==entrada);
            if(!encontro){
                anterior=actual;
                actual=actual.getEnlace();
            }
        }
        if(actual==primero){
            primero=actual.getEnlace();
        }else{
            anterior.setEnlace(actual.getEnlace());
        }
        actual=null;
    }
}
