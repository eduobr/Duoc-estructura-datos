/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author solea
 */
public class Nodo {
    private Object dato;
    private Nodo enlace;
    
     //creamos un nodo     
    public Nodo(){
        
    }
    //creamos un nodo sólo con el objeto
    public Nodo(Object dato){
        setDato(dato);
        setEnlace(null);
    }
    //creamos un nodo y le entregamos otro nodo al que apuntará
    public Nodo(Object dato, Nodo enlace){
        setDato(dato);
        setEnlace(enlace);
    }
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
   
    @Override
    public String toString(){
        if (getEnlace()==null) return "Dato: "+getDato();
        return "Dato: "+getDato().toString()/*+" / Enlace "+getEnlace().getDato().toString()*/;
    }
    
}
