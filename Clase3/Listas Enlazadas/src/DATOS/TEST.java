/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import java.util.Scanner;

/**
 *
 * @author Duoc
 */
public class TEST {

    public static Lista lista = new Lista();

    public static void main(String[] args) {
//        boolean ciclo = true;
//        do {
//            ciclo = menu();
//        } while (ciclo);
        Lista l = new Lista();
        l.insertarCabezaLista(9);
        l.insertarCabezaLista(8);
        l.insertarCabezaLista(5);
        l.ordNodos();

    }

    private static boolean menu() {
        System.out.println("----------Menu------------");
        System.out.println("1)Agregar nodo a lista");
        System.out.println("2)Listar");
        System.out.println("3)Buscar valor");
        System.out.println("4)Eliminar nodo lista");
        System.out.println("5)Ordenar Lista");
        System.out.println("6)Salir");
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        while (op <= 0 && op <= 5) {
            System.out.println("Seleccione una opcion(1-5)");
            op = teclado.nextInt();
            System.out.println("");
        }
        boolean ciclo = true;
        switch (op) {
            case 1:
                AgregarNodo();
                break;
            case 2:
                Listar();
                break;
            case 3:
                Buscar();
                break;
            case 4:
                EliminarNodo();
                break;
            case 5:
                OrdenarLista();
            case 6:
                ciclo = false;
        }

        return ciclo;
    }

    private static void AgregarNodo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Object dato = teclado.nextInt();
        lista.insertarCabezaLista(dato);
        System.out.println("Nodo Agregado!!!");
    }

    private static void Listar() {
        System.out.println("Lista de Nodos:");
        lista.visualizar();
    }

    private static void Buscar() {
        Nodo n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor a buscar");
        int valor = teclado.nextInt();
        n=lista.buscarLista(valor);
        if (n != null) {
            System.out.println("Existe!!!!");
            System.out.println(lista.buscarLista(valor).getDato());
        } else {
            System.out.println("El nodo buscado no existe");
        }

    }

    private static void EliminarNodo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nodo a eliminar");
        int valor = teclado.nextInt();
        if (lista.buscarLista(valor) != null) {
            lista.eliminar(valor);
            System.out.println("Eliminado");
        }else{
            System.out.println("El nodo no existe!!");
        }
    }

    private static void OrdenarLista() {
        lista.ordNodos();
    }

}
