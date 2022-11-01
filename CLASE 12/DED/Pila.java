

package DED;

public class Pila {
    private static int Tamaño=49;
    private int cima;
    private Object[] listaPila;

    public Pila() {
        cima=-1;
        listaPila=new Object[Tamaño];
    }

    public Pila(int capacidad) {
        cima=-1;
        listaPila=new Object[capacidad];
        Tamaño=capacidad;
    }
    public boolean pilaVacia(){
        return cima==-1;
    }
    public boolean pilaLlena(){
        return cima==(Tamaño-1);
    }
    
    public void insertarPila(Object dato){
        if(pilaLlena()){
            System.out.println("Pila Llena");
            return;
        }
        cima++;
        listaPila[cima]=dato;
    }
    public Object quitarPila(){
        if(pilaVacia()){
            System.out.println("Pila Vacia");
            return null;
        }
        Object objTemp;
        objTemp=listaPila[cima];
        cima--;
        return objTemp;
    }
    public Object cimaPila(){
        if(pilaVacia()){
            System.out.println("Pila Vaica"); return null;
        }
        return listaPila[cima];
    }
    public void limpiarPila(){
        cima=-1;
    }
    public void mostrarPila(){
        if(pilaVacia()){
            System.out.println("Pila Vacia");
            return;
        }
        for (int i = 0; i < cima; i++) {
            System.out.println("Elemento Pos "+(i+1)+" :"+listaPila[i]);
        }
    }
}
