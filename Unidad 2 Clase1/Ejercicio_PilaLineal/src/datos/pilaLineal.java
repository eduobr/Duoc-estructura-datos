
package datos;


public class pilaLineal {
  private static int TAMPILA=49;
  private int cima;
  private Object[] listaPila;

    public pilaLineal() {
        cima=-1;
        listaPila=new Object[TAMPILA];
    }

    public pilaLineal(int capacidad) {
        cima=-1;
        TAMPILA=capacidad;
        listaPila=new Object[TAMPILA];
    }
    //metodos bool
    public boolean pilaLlena(){
        return cima== TAMPILA-1;
    }
    public boolean pilaVacia(){
        return cima==-1;
    }
    public void limpiarPila(){
        cima=-1;
    }
   // metodos apilar y desapilar
    public void apilar(Object elemento) throws Exception{
        if(pilaLlena()){
            throw new Exception("pila llena");
        }
        cima++;
        listaPila[cima]=elemento;
    }
    public Object desapilar() throws Exception{
        if (pilaVacia()) {
            throw new Exception("pila vacia");
        }
        Object aux=listaPila[cima];
        cima--;
        return aux;
    }
    public Object mostrarCima() throws Exception{
        if(pilaVacia()){
            throw new Exception("pila vacia");
        }
        return listaPila[cima];
    }
    public void mostrarPila() throws Exception{
        if (pilaVacia()) {
            throw new Exception("pila vacia");
        }
        for (int i = 0; i < cima; i++) {
            System.out.println("Elemento "+i+":"+listaPila[i]);
        }
    }
}
