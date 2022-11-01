

package Datos;


public class Ejercicio2 {
    
    Arbol arbolBinario;
    NodoArbol nodo;
    public int sum=0;
    public int con=0;

    public Ejercicio2(NodoArbol arbol) {
        arbolBinario=new Arbol(arbol);
    }
    
    public void sumaEdad(){
        NodoArbol nodoTemp=arbolBinario.raizArbol();
        suma(nodoTemp);
        System.out.println("el promedio es:"+(sum/con));
    }
    
    public void suma(NodoArbol raiz){
        if (raiz!=null) {
            Personas per=(Personas)raiz.getDato();
            sum+=per.getEdad();
            con++;
            suma(raiz.getIzq());
            suma(raiz.getDer());
            
        }
        
    }
    
    public void menorEdad(NodoArbol raiz){
        if (raiz!=null) {
            Personas per=(Personas)raiz.getDato();
            if (per.getEdad()<18) {
                
                System.out.println(""+per.getNombre());
            }
            menorEdad(raiz.getIzq());
            menorEdad(raiz.getDer());
            
        }
         
         
    }
    
    
    
}
