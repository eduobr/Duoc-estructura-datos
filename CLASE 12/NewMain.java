/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ded_10;

/**
 *
 * @author Samsung
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //uno();
        //dos();
        ejercicio1();
    }

    private static void uno() {
        Arbol arbolFinal;
        Nodo a1, a2, b, b1, a;
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
        arbolBusqueda a=new arbolBusqueda();
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
            Nodo busqueda;
            busqueda=a.buscar(37);
            if(busqueda==null){
                System.out.println("Valor no encontrado");
            }else{
                System.out.println("Valor en el arbol");
            }
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }

    private static void ejercicio1() {
        Arbol arb;
        Nodo a,b,c,d,e;
        
        a=Arbol.nuevoArbol(null, "comian", null);
        b=Arbol.nuevoArbol(null, "trigo", null);
        c=Arbol.nuevoArbol(a, "tristes", b);
        d=Arbol.nuevoArbol(null, "tigres", null);
        e=Arbol.nuevoArbol(c, "tres", d);
        
        arb=new Arbol(e);
        System.out.println("\n PreOrden");
        arb.Or1(e,1);
    }
}
