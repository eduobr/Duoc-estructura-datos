package Ejercicio;

public class busquedas {

    

    
    
    public busquedas()
    {}
    
    public static void ordInsercion(int[] a) {
        int i, j;
        int aux;
        
        for (i = 1; i < a.length; i++) {
            /* indice j es para explorar la sublista a[i-1]..a[0] buscando la
             posicion correcta del elemento destino*/
            j = i;
            aux = a[i];
           // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {
               // desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }
    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
    public static void ordSeleccion(int a[]) {
        int indiceMenor, i, j, n;
        n = a.length;
        for (i = 0; i < n - 1; i++) {
            // comienzo de la exploración en índice i
            indiceMenor = i;
             // j explora la sublista a[i+1]..a[n-1]
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;
                }
            }
             // sitúa el elemento mas pequeño en a[i]
            if (i != indiceMenor) {
                intercambiar(a, i, indiceMenor);
            }
        }
    }


    public static int buscar(int numbers[], int key) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == key) {
                return index;  //Encontrado
            }
        }
        return -1;// no encontrado
    }

    
    
     
    public int busquedaBin(int a[], int clave) {
        int central, bajo, alto;
        int valorCentral;
        bajo = 0;
        alto = a.length - 1;
        while (bajo <= alto) {
            central = (bajo + alto) / 2; // índice de elemento central
            valorCentral = a[central]; // valor del índice central
            if (clave == valorCentral) {
                return central; // encontrado, devuelve posición
            } else if (clave < valorCentral) {
                alto = central - 1; // ir a sublista inferior
            } else {
                bajo = central + 1; // ir a sublista superior
            }
        }
        return -1; //elemento no encontrado
    }
    
    public static void eliminarDuplicado(int[] arreglo){
        int aux=0;
        int[] auxarreglo=arreglo;
        for (int i = 0; i < arreglo.length; i++) {
            //System.out.println("valor:"+arreglo[i]);
            aux=arreglo[i];
            for (int j = i+1; j < arreglo.length; j++) {
                if (aux==arreglo[j]) {
                   auxarreglo[j]=0;
                }
            }
        }
        for (int i : auxarreglo) {
            System.out.println("valor:"+i);
        }
        arreglo=auxarreglo;
        intercambiar2(arreglo);
    }
    private static void intercambiar2(int[] arreglo) {
        int i,j;
        int aux;
        for (i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==0) {
                for (j=i+i; j < arreglo.length; j++) {
                    if (arreglo[j]>0) {
                        aux=arreglo[j];
                        arreglo[i]=arreglo[j]=0;
                        break;
                    }
                }
            }
        }
    }
}
