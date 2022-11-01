
package ded_10;

public class arbolBusqueda extends Arbol{

    public arbolBusqueda() {
        super();
    }
    
    //metodo principal para insertar datos
    public void insertar(int dato) throws Exception{
        raiz=insertarBuscador(raiz,dato);
    }
    private Nodo insertarBuscador(Nodo raizSub, int dato) throws  Exception {
        if(raizSub==null){
            raizSub=new Nodo(dato);
        }else if(dato< (Integer)raizSub.getDato()){
            Nodo iz;
            iz=insertarBuscador(raizSub.getIzq(), dato);
            raizSub.setIzq(iz);
        }else if(dato > (Integer)raizSub.getDato()){
            Nodo dr;
            dr=insertarBuscador(raizSub.getDer(), dato);
            raizSub.setDer(dr);            
        }else{
            throw new Exception("Nodo Duplicado");
        }
        return raizSub;
    }
    public Nodo buscar(int buscado){
        if(raiz==null){
            return null;
        }else{
            return localizar(raizArbol(), buscado);
        }
    }
    protected Nodo localizar(Nodo raizSub,int buscado){
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
