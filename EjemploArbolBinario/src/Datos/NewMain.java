package Datos;

public class NewMain {

    public static void main(String[] args) {
//        uno();
//        dos();
//         ejercicio1();
//        ejercicio2();
//        ejercicio3();
        ejercicio4();
//        ejercicio5();
    }

    private static void uno() {
        Arbol arbolFinal;
        NodoArbol a1, a2, b, b1, a;
        a1 = Arbol.nuevoArbol(null, "Maria", null);
        a2 = Arbol.nuevoArbol(null, "Rodrigo", null);
        b = Arbol.nuevoArbol(a1, "Esperanza", a2);

        a1 = Arbol.nuevoArbol(null, "Ana", null);
        a2 = Arbol.nuevoArbol(null, "Abel", null);
        b1 = Arbol.nuevoArbol(a1, "M. Jesus", a2);

        a = Arbol.nuevoArbol(b, "Constanza", b1);
        arbolFinal = new Arbol(a);
        System.out.println("\n Pre Orden");
        arbolFinal.preorden(a);
        System.out.println("\n Post Orden");
        arbolFinal.postorden(a);
        System.out.println("\n InOrden");
        arbolFinal.inorden(a);

    }

    private static void dos() {
        arbolBusqueda a = new arbolBusqueda();
        try {
            a.insertar(25);
            a.insertar(36);
            a.insertar(10);
            a.insertar(30);
            a.insertar(15);
            a.insertar(64);
            a.insertar(8);
            System.out.println("OK");
            a.inorden(a.raiz);
            NodoArbol busqueda;
            busqueda = a.buscar(37);
            if (busqueda == null) {
                System.out.println("Valor no encontrado");
            } else {
                System.out.println("Valor en el arbol");
            }
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
    }

    private static void ejercicio1() {
        Arbol arb;
        NodoArbol a, b, c, d, e;

        a = Arbol.nuevoArbol(null, "comian", null);
        b = Arbol.nuevoArbol(null, "trigo", null);
        c = Arbol.nuevoArbol(a, "tristes", b);
        d = Arbol.nuevoArbol(null, "tigres", null);
        e = Arbol.nuevoArbol(c, "tres", d);

        arb = new Arbol(e);
        System.out.println("\n PreOrden");
        arb.Or1(e, 1);
    }

    private static void ejercicio2() {
        NodoArbol n1, n2, n3, n4, n5, n6, n7;
        Arbol arbolBinario;

        n1 = Arbol.nuevoArbol(null, "D", null);
        n2 = Arbol.nuevoArbol(null, "E", null);
        n3 = Arbol.nuevoArbol(n1, "B", n2);
        n4 = Arbol.nuevoArbol(null, "F", null);
        n5 = Arbol.nuevoArbol(null, "G", null);
        n6 = Arbol.nuevoArbol(n4, "C", n5);
        n7 = Arbol.nuevoArbol(n3, "A", n6);

        arbolBinario = new Arbol(n7);

        System.out.println("Recorrer");
        arbolBinario.postorden(arbolBinario.raiz);
    }

    private static void ejercicio3() {
        Arbol arbolBinario;
        NodoArbol n1, n2, n3, n4, n5, n6, n7;

        Personas per1 = new Personas("Juan Soto", 75);
        Personas per2 = new Personas("Sofia Soto", 50);
        Personas per3 = new Personas("Beatriz Soto", 45);
        Personas per4 = new Personas("Daniel Montes", 18);
        Personas per5 = new Personas("Martina Montes", 1);
        Personas per6 = new Personas("Camila Montes", 12);
        Personas per7 = new Personas("Amalia Muños", 4);

        n1 = Arbol.nuevoArbol(null, per7, null);
        n2 = Arbol.nuevoArbol(null, per6, null);
        n3 = Arbol.nuevoArbol(null, per5, null);
        n4 = Arbol.nuevoArbol(n3, per4, null);
        n5 = Arbol.nuevoArbol(n1, per3, null);
        n6 = Arbol.nuevoArbol(n4, per2, n2);
        n7 = Arbol.nuevoArbol(n6, per1, n5);

        arbolBinario = new Arbol(n7);

        System.out.println("Recorrer pre orden");
        arbolBinario.preorden(arbolBinario.raiz);
        System.out.println("Recorrer post orden");
        arbolBinario.postorden(arbolBinario.raiz);
        System.out.println("Recorrer int orden");
        arbolBinario.inorden(arbolBinario.raiz);

        Ejercicio2 e = new Ejercicio2(n7);
        e.sumaEdad();
        e.menorEdad(n7);

    }

    private static void ejercicio4() {
        Arbol arbolBinario;
        NodoArbol n1, n2, n5, n6, n7, n8, n9, n10;

        Autor aut = new Autor("gary", 91, "chileno");
        Autor aut2 = new Autor("robert", 50, "argentina");

        Libro lib1 = new Libro("libro1", 2016, aut);
        Libro lib2 = new Libro("libro2", 2015, aut);

        Libro lib5 = new Libro("libro5", 2010, aut2);
        Libro lib6 = new Libro("libro6", 2012, aut);
        Libro lib7 = new Libro("libro7", 2014, aut);
        Libro lib8 = new Libro("libro8", 1969, aut2);
        Libro lib9 = new Libro("libro9", 1989, aut);
        Libro lib10 = new Libro("libro10", 2017, aut2);

        n9 = Arbol.nuevoArbol(null, lib9, null);
        n10 = Arbol.nuevoArbol(n9, lib10, null);
        n8 = Arbol.nuevoArbol(null, lib8, n10);
        n7 = Arbol.nuevoArbol(null, lib7, null);
        n6 = Arbol.nuevoArbol(null, lib6, n8);
        n5 = Arbol.nuevoArbol(null, lib5, null);

        n2 = Arbol.nuevoArbol(n7, lib2, n5);
        n1 = Arbol.nuevoArbol(n2, lib1, n6);

        arbolBinario = new Arbol(n1);

        System.out.println("Recorrer pre orden");
        arbolBinario.preorden(arbolBinario.raiz);
        System.out.println("Recorrer post orden");
        arbolBinario.postorden(arbolBinario.raiz);
        System.out.println("Recorrer int orden");
        arbolBinario.inorden(arbolBinario.raiz);

        EjericioLibros ejLib = new EjericioLibros(n1);
        System.out.println("--------------------------------------");
        ejLib.librosAutorChile(n1);
        ejLib.MostrarLibroAutorChile();
        System.out.println("--------------------------------------");
        ejLib.librosMenores1990(n1);
        System.out.println("--------------------------------------");
        ejLib.promedioEdadAutores(n1);
        ejLib.MostraPromedioEdadAutores();
        System.out.println("--------------------------------------");

    }

    private static void ejercicio5() {
        Arbol arbolBinario;
        NodoArbol n1, n2, n3, n4, n5, n6;

        Animal ani1 = new Animal("leon", 'M', 1, 5);
        Animal ani2 = new Animal("lemur", 'F', 2, 3);
        Animal ani3 = new Animal("carpintero", 'F', 3, 4);
        Animal ani4 = new Animal("cocodrilo", 'M', 3, 7);
        Animal ani5 = new Animal("pez globo", 'M', 3, 2);
        Animal ani6 = new Animal("rana", 'M', 3, 3);

        TipoAnimal tipoAni1 = new TipoAnimal("carnivoro", "norte", ani1);
        TipoAnimal tipoAni2 = new TipoAnimal("herbivoro", "norte", ani2);
        TipoAnimal tipoAni3 = new TipoAnimal("ave", "oeste", ani3);
        TipoAnimal tipoAni4 = new TipoAnimal("reptil", "este", ani4);
        TipoAnimal tipoAni5 = new TipoAnimal("pez", "sur", ani5);
        TipoAnimal tipoAni6 = new TipoAnimal("anfibio", "sur", ani6);

        n5 = Arbol.nuevoArbol(null, tipoAni5, null);
        n6 = Arbol.nuevoArbol(null, tipoAni6, null);
        n4 = Arbol.nuevoArbol(n5, tipoAni4, n6);
        n3 = Arbol.nuevoArbol(null, tipoAni3, null);
        n2 = Arbol.nuevoArbol(null, tipoAni2, n3);
        n1 = Arbol.nuevoArbol(n4, tipoAni1, n2);
        
        
        arbolBinario = new Arbol(n1);

        System.out.println("Recorrer pre orden");
        arbolBinario.preorden(arbolBinario.raiz);
        System.out.println("Recorrer post orden");
        arbolBinario.postorden(arbolBinario.raiz);
        System.out.println("Recorrer int orden");
        arbolBinario.inorden(arbolBinario.raiz);
        
        EjercicioAnimales ejAni=new EjercicioAnimales(n1);
        System.out.println("--------------------------------------");
        System.out.println("Animales por Seccion");
        ejAni.CuantosAnimalesPorSeccion(n1);
        ejAni.mostrarCuantosAnimalesPorSeccion();
        System.out.println("--------------------------------------");
        System.out.println("Animales por Sexo");
        ejAni.cantidadAnimalesPorSexo(n1);
        ejAni.mostrarCantidadAnimalesPorSexo();
        System.out.println("--------------------------------------");
        System.out.println("Promedio de Edad por Seccion ");
        ejAni.promedioPorSeccion(n1);
        ejAni.mostrarPromedioPorSeccion();
    }
}
