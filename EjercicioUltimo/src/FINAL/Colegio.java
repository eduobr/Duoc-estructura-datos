/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL;

import DED.ArbolBusqueda;
import DED.ListaEnlazada;
import DED.Nodo;
import DED.NodoArbol;
import DED.PilaDinamica;
import Datos.Cola;

/**
 *
 * @author Duoc
 */
public class Colegio {

    private ListaEnlazada listaAlumnos;
    private ArbolBusqueda arbolAlumnos;
    private PilaDinamica pilaAlumnos;
    private Cola colaAlumnos;

    public ArbolBusqueda getArbolAlumnos() {
        return arbolAlumnos;
    }

    public Colegio() {
        listaAlumnos = new ListaEnlazada();
        arbolAlumnos = new ArbolBusqueda();
        pilaAlumnos = new PilaDinamica();
        colaAlumnos = new Cola();
    }

    //metodo de ingreso en la lista enlazada
    public void insertarAlumno(Alumno alumno) {
        listaAlumnos.insertarCabeza(alumno);
        System.out.println("Alumno Ingresado!!");
    }

    public void visualizarAlumnos() {
        listaAlumnos.visualizarLista();
    }

    public void traspasoArbolBinarioOrdenado() {
        //recorrer la lista enlazada
        Nodo nodoTemp = listaAlumnos.getPrimero();
        while (nodoTemp != null) {
            Alumno alumTemp = (Alumno) nodoTemp.getDato();
            arbolAlumnos.insertar(alumTemp);
            System.out.println("Alumno Traspasado Arbol!!");
            nodoTemp = nodoTemp.getEnlace();
        }
        System.out.println("Proceso Terminado");
        //para visualizar el arbol se pasa la raiz del mismo arbol
        arbolAlumnos.inOrden(arbolAlumnos.getRaiz());
    }

    public void inOrden(NodoArbol r) {
        if (r != null) {
            inOrden(r.getIzqo());
            //r.vista();
            Alumno alumTemp = (Alumno) r.getDato();
            if (alumTemp.getSituacion().equals("R")) {
                pilaAlumnos.insertar(alumTemp);
                System.out.println("Alumno Traspasado;" + alumTemp.getNombre());
            }
            inOrden(r.getDer());
        }
    }

    public void preOrden(NodoArbol r) {
        if (r != null) {
            //r.vista();
            Alumno alumTemp = (Alumno) r.getDato();
            if (alumTemp.getSituacion().equals("A")) {
                colaAlumnos.insertar(alumTemp);
                System.out.println("Insertado en la Cola" + alumTemp.getNombre());
            }
            preOrden(r.getIzqo());
            preOrden(r.getDer());
        }
    }

    public void eliminarNodo(double nota) {
        Nodo actual, anterior;
        boolean encontro;
        actual = listaAlumnos.getPrimero();
        anterior = null;
        encontro = false;
        while ((actual != null) && (!encontro)) {
            encontro = (((Alumno) actual.getDato()).promedio() < nota);
            if (!encontro) {
                anterior = actual;
                actual = actual.getEnlace();
            }
        }
        if (actual == listaAlumnos.getPrimero()) {
            listaAlumnos.setPrimero(actual.getEnlace());
        } else {
            if (actual == null) {
                System.out.println("No existen mas registros");
            } else {
                anterior.setEnlace(actual.getEnlace());
            }
        }
        actual = null;
    }

    public void promMujeresHombres() {
        Nodo nodoTemp = listaAlumnos.getPrimero();
        int notMujeres = 0;
        int contM = 0;
        int notHombres = 0;
        int contH = 0;
        while (nodoTemp != null) {
            Alumno alumTemp = (Alumno) nodoTemp.getDato();
            if (alumTemp.getSexo() == 'f') {
                notMujeres += alumTemp.promedio();
                contM++;
            }
            if (alumTemp.getSexo()=='m') {
                notHombres+=alumTemp.promedio();
                contH++;
            }
            nodoTemp = nodoTemp.getEnlace();
        }
        int promMujeres=notMujeres/contM;
        int promHombres=notHombres/contH;
        System.out.println("Promedio Mujeres: "+promMujeres);
        System.out.println("Promedio Hombres: "+promHombres);
        
    }
}
