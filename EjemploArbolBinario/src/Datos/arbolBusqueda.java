
package Datos;

public class arbolBusqueda extends Arbol{

    public arbolBusqueda() {
        super();
    }
    
    //metodo principal para insertar datos
    public void insertar(int dato) throws Exception{
        raiz=insertarBuscador(raiz,dato);
    }
    private NodoArbol insertarBuscador(NodoArbol raizSub, int dato) throws  Exception {
        if(raizSub==null){
            raizSub=new NodoArbol(dato);
        }else if(dato< (Integer)raizSub.getDato()){
            NodoArbol iz;
            iz=insertarBuscador(raizSub.getIzq(), dato);
            raizSub.setIzq(iz);
        }else if(dato > (Integer)raizSub.getDato()){
            NodoArbol dr;
            dr=insertarBuscador(raizSub.getDer(), dato);
            raizSub.setDer(dr);            
        }else{
            throw new Exception("Nodo Duplicado");
        }
        return raizSub;
    }
    public NodoArbol buscar(int buscado){
        if(raiz==null){
            return null;
        }else{
            return localizar(raizArbol(), buscado);
        }
    }
    protected NodoArbol localizar(NodoArbol raizSub,int buscado){
        if(raizSub==null){
            return null;
        }else if(buscado==(Integer)raizSub.getDato()){
            return raiz;
        }else if(buscado< (Integer)raizSub.getDato()){
            return localizar(raizSub.getIzq(), buscado);
        }else{
            return localizar(raizSub.getDer(), buscado);
        }
    }
}
