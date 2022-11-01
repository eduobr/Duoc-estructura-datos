/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

public class pilaDinamica {
    private Nodo cima;

    public pilaDinamica() {
        setCima(null);
    }
    public pilaDinamica(Object dato){
        setCima(new Nodo(dato));
    }
    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }
    public void insertar(Object elemento)
    {
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.setEnlace(getCima());
        setCima(nuevo);
    }
    
    public Object quitar() throws Exception
    {
        if (pilaVacia())
        {
            throw new Exception ("Pila vacía, no se puede extraer.");
        }
        
        Nodo aux = getCima();
        setCima(aux.getEnlace());
        return aux.getDato();
    }
    
    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede leer cima.");
        }
        return getCima().getDato();
    }
    
    public void limpiarPila() {
        Nodo aux;
        while (!pilaVacia()) {
            aux = getCima();
            setCima(aux.getEnlace());
            aux.setEnlace(null);
        }
    }
    public boolean pilaVacia()
    {
        return getCima() == null;
    }
    
    public String escribirTodos(){
         Nodo nodo = getCima();
         
         String listado="";
         while(nodo!=null){
             listado += nodo.getDato()+"\n";
             nodo=nodo.getEnlace();
         }
         return listado;
     }
}
