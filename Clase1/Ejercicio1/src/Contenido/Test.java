/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

import java.util.Scanner;

/**
 *
 * @author Duoc
 */
public class Test {
    public static Colegio cole = new Colegio();

    public static void main(String[] args) {
        boolean ciclo = true;
        do {
            ciclo = menu();
        } while (ciclo);
        System.out.println("Adios");
    }

    private static boolean menu() {
        System.out.println("--Menu Colegio --");
        System.out.println("1)Agregar Alumno");
        System.out.println("2)Listar Alumno");
        System.out.println("3)Buscar Alumno");
        System.out.println("4)Salir");
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        while (op <= 0 || op>4) {
            System.out.println("Seleccione(1-4)");
            op = teclado.nextInt();
        }
        boolean ciclo=true;
        switch(op){
            case 1:
                AgregarAlumno();
                break;
            case 2:
                ListarAlumno();
                break;
            case 3:
                BuscarAlumno();
                break;
            case 4:
                ciclo=false;
                break;
        }
        return ciclo;
    }

    private static void AgregarAlumno() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese rut:");
        String rut = teclado.next();
        System.out.println("Ingrese Nombre:");
        String nombre=teclado.next();
        System.out.println("Ingrese Apellido:");
        String apellido=teclado.next();
        System.out.println("Ingrese Edad");
        int edad=teclado.nextInt();
        
        Alumno alum=new Alumno();
        alum.setRut(rut);
        alum.setNombre(nombre);
        alum.setApellidos(apellido);
        alum.setEdad(edad);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese Nota"+(i+1));
            double nota=teclado.nextDouble();
            alum.agregarNota(nota);
        }
        cole.agregarAlumno(alum);
        
    }

    private static void ListarAlumno() {
        cole.mostrarAlumno();
    }

    private static void BuscarAlumno() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese rut");
        String rut=teclado.next();
        System.out.println("");
        cole.buscarAlumno(rut);
    }
    
    

}
