
package DED;

import FINAL.Alumno;


public class ArbolBusqueda extends Arbol{

    public ArbolBusqueda() {
        super();
    }
    public void  insertar(Object dato){
        raiz=insertarBuscador(raiz, dato);
    }
    public NodoArbol insertarBuscador(NodoArbol raizSub, Object dato){
        if(raizSub==null){
            raizSub=new NodoArbol(dato);
        }else if(((Alumno)dato).getEdad()< ((Alumno)raizSub.getDato()).getEdad()){
            NodoArbol iz;
            iz=insertarBuscador(raizSub.getIzqo(), dato);
            raizSub.setIzqo(iz);
        }else if(((Alumno)dato).getEdad()>((Alumno)raizSub.getDato()).getEdad()){
            NodoArbol dr;
            dr=insertarBuscador(raizSub.getDer(), dato);
            raizSub.setDer(dr);
        }else{
            System.out.println("Nodo Duplicado");
        }
        return raizSub;
    }
    public NodoArbol buscar(int buscado){
        if(raiz==null){
            return null;
        }
        return localizar(raiz, buscado);
    }
    protected NodoArbol localizar(NodoArbol raizSub,int buscado){
        if(raizSub==null){
            return null;
        }else if(buscado==(Integer)raizSub.getDato()){
            return raiz;
        }else if(buscado<(Integer)raizSub.getDato()){
            return localizar(raizSub.getIzqo(), buscado);
        }else{
            return localizar(raizSub.getDer(), buscado);                    
        }
    }
    
}
