package Datos;

public class EjericioLibros {

    Arbol arbolBinario;
    NodoArbol nodo;
    int acum = 0;
    int suma = 0;
    int cont = 0;

    public EjericioLibros(NodoArbol arbol) {
        arbolBinario = new Arbol(arbol);
    }

    public void librosAutorChile(NodoArbol raiz) {
        if (raiz != null) {
            Libro lib = (Libro) raiz.getDato();
            if (lib.getAutor().getNacionalidad().equals("chileno")) {
                acum++;
            }

            librosAutorChile(raiz.getIzq());
            librosAutorChile(raiz.getDer());

        }

    }

    public void MostrarLibroAutorChile() {

        System.out.println("la catidad de autores chilenos son: " + acum);
    }

    public void librosMenores1990(NodoArbol raiz) {
        if (raiz != null) {
            Libro lib = (Libro) raiz.getDato();
            if (lib.getAnnoPuplicacion() < 1990) {
                System.out.println("" + lib);
            }

            librosMenores1990(raiz.getIzq());
            librosMenores1990(raiz.getDer());

        }

    }

    public void promedioEdadAutores(NodoArbol raiz) {
        if (raiz != null) {
            Libro lib = (Libro) raiz.getDato();

            cont++;
            suma += lib.getAutor().getEdad();

            promedioEdadAutores(raiz.getIzq());
            promedioEdadAutores(raiz.getDer());
        }
    }

    public void MostraPromedioEdadAutores() {
        System.out.println("Promedio edades autor:" + suma / cont);
    }

   

}
