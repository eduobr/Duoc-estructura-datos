/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL;

import java.util.Scanner;

/**
 *
 * @author Duoc
 */
public class Test {

    private static Colegio cole = new Colegio();

    public static void main(String[] args) {
        boolean ciclo = true;
        while (ciclo) {
            ciclo = menuPrincipal();
        }
        System.out.println("Adios!!!");
    }

    private static boolean menuPrincipal() {
        System.out.println("-- Menu Principal --");
        System.out.println("1) Ingresar alumno en lista enlazada");
        System.out.println("2( Visualizar alumnos de la lista enlazada");
        System.out.println("3) Traspasae lista enlazada a un arbol binario");
        System.out.println("4) Traspaso aprobados en Pila");
        System.out.println("5) Traspaso reprobados en cola");
        System.out.println("6) Eliminar lista enlazada alumno");
        System.out.println("7) Promedio Hombres y Mujeres");
        System.out.println("8) Salir");

        Scanner teclado = new Scanner(System.in);
        int op = 0;
        boolean ciclo = true;
        while (op < 1 || op > 8) {
            System.out.println("Ingrese Opcion:");
            op = teclado.nextInt();
        }
        switch (op) {
            case 1:
                ingresarAlumnoListaEnlazada();
                break;
            case 2:
                visualizarAlumnoListaEnlazada();
                break;
            case 3:
                traspasoListaEnlazadaArbolBinario();
                break;
            case 4:
                traspasoAprobadosCola();
                break;
            case 5:
                traspasoReprobadosPila();
                break;
            case 6:
                eliminarLista();
                break;
            case 7:
                promedioHombresyMujeres();
                break;
            case 8:
                ciclo=false;
                break;
        }
        return ciclo;
    }

    private static void ingresarAlumnoListaEnlazada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--Datos del Alumno --");
        System.out.println("Ingrese Codigo:");
        int cod = teclado.nextInt();
        System.out.println("Ingrese Nombre:");
        String nombre = teclado.next();
        System.out.println("Ingrese Edad");
        int edad = teclado.nextInt();
        System.out.println("Ingrese Sexo:");
        char sexo = teclado.next().charAt(0);
        System.out.println("Ingrese las 3 Notas");
        double[] notas = new double[3];
        System.out.println("Nota 1:");
        notas[0] = teclado.nextDouble();
        System.out.println("Nota 2:");
        notas[1] = teclado.nextDouble();
        System.out.println("Nota 3:");
        notas[2] = teclado.nextDouble();
        Alumno alum = new Alumno(cod, nombre, edad, sexo, notas, "-");
        cole.insertarAlumno(alum);
    }

    private static void visualizarAlumnoListaEnlazada() {
        cole.visualizarAlumnos();
    }

    private static void traspasoListaEnlazadaArbolBinario() {
        cole.traspasoArbolBinarioOrdenado();
    }

    private static void traspasoAprobadosCola() {
        cole.preOrden(cole.getArbolAlumnos().getRaiz());
    }

    private static void traspasoReprobadosPila() {
        cole.inOrden(cole.getArbolAlumnos().getRaiz());
    }

    private static void eliminarLista() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nota promedio:");
        double prom=teclado.nextDouble();
        cole.eliminarNodo(prom);
        cole.visualizarAlumnos();
    }
    
    private static void promedioHombresyMujeres(){
        cole.promMujeresHombres();
    }

}
