/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author solea
 */
public class PilaLineal {

    private static  int TAMPILA = 49;// largo de la pila
    private int cima;
    //Ésta es la clase base de todas las clases de Java y, por tanto, hay una conversión
    //automática de cualquier referencia a Object.
    private Object[] listaPila;

    // constructor
    public PilaLineal() {
        cima = -1;
        listaPila = new Object[TAMPILA];
    }
// Constructor que toma como parámetro el tamaño del array.

    public PilaLineal(int cap) {
        TAMPILA = cap;
        cima = -1;
        listaPila = new Object[TAMPILA];
    }

      
    
// operaciones que añaden o extraen elementos

    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()) {
            throw new Exception("Desbordamiento pila");
        }
        //incrementar puntero cima y copia elemento
        cima++;
        listaPila[cima] = elemento;
    }

    // quitar un elemento 
    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        // guarda elemento de la cima
        aux = listaPila[cima];
        // decrementar cima y devolver elemento
        cima--;
        return aux;
    }

    /* La operación cimaPila devuelve el elemento que se encuentra en la cima de la pila. No se
    modifica la pila, únicamente se accede al elemento.*/
    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no hay elementos.");
        }
        return listaPila[cima];
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public boolean pilaLlena() {
        return cima == TAMPILA - 1;
    }

    public void limpiarPila() {
        cima = -1;
    }

    
    public int getCima()
    {
        return cima;   
    }
    public void setCima(int tope)
    {
       this.cima = tope; 
    }
    // mostrar(): recorre la pila desde la base mostrando su contenido.
    public void mostrar() throws Exception {
        if (!pilaVacia()) {
            for (int i = 0; i <= cima; i++) {
                System.out.println("Elemento en posicion " + i + ": " + listaPila[i]);
            }
        } else {
            throw new Exception("Pila vacía, no hay elementos.");
        }
    }
    public String mostrar2(){
        String texto="\n";
        if (!pilaVacia()) {
            for (int i = 0; i <= cima; i++) {
                texto+=" producto " + (i+1) + ": $" + listaPila[i];
            }
        } else {
            texto="Pila vacia, no hay elementos";
        }
        return texto;
    }
    
  
    
       
    
}
