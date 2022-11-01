

package DED;


public class Cola {
    private static int Tamaño=39;
    private int frente;
    private int fin;
    private Object[] listaCola;

    public Cola() {
        frente=0;fin=0;
        listaCola=new Object[Tamaño];
    }

    public Cola(int capacidad) {
        frente=0;fin=0;
        listaCola=new Object[capacidad];
        Tamaño=capacidad;
    }

    public static int getTamaño() {
        return Tamaño;
    }

    public static void setTamaño(int Tamaño) {
        Cola.Tamaño = Tamaño;
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public Object[] getListaCola() {
        return listaCola;
    }

    public void setListaCola(Object[] listaCola) {
        this.listaCola = listaCola;
    }
    public boolean colaLlena(){
        return fin==Tamaño;
    }
    public boolean colaVacia(){
        return frente==fin;
    }
    public void insertar(Object elemento){
        if(!colaLlena()){            
            listaCola[fin]=elemento;
            fin++; return;
        }
        System.out.println("Cola Llena");
    }
    public Object quitar(){
        Object elemento;
        if(!colaVacia()){
            elemento=listaCola[frente];
            frente++;
            return elemento;            
        }
        System.out.println("Cola Vacia");
        return null;
    }
    public void borrarCola(){
        frente=0;fin=0;
    }
    public Object frenteCola(){
        Object elemento;
        if(!colaVacia()){
            elemento=listaCola[frente];            
            return elemento;            
        }
        System.out.println("Cola Vacia");
        return null;
    }
    public int tamañoCola(){
        return (fin-frente+Tamaño % Tamaño);
    }
    public void mostrarCola(){
        if(!colaVacia()){
            for (int i = frente; i < fin; i++) {
                System.out.println("Dato:"+listaCola[i]);
            }
            return;
        }
        System.out.println("Cola Vacia");
    }
}
