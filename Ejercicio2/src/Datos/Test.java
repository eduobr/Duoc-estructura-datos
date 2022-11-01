/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Scanner;

/**
 *
 * @author Edd
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
        System.out.println("1)Agregar Profesor");
        System.out.println("2)Listar Profesores");
        System.out.println("3)Buscar Profesores");
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
                AgregarProfesor();
                break;
            case 2:
                ListarProfesores();
                break;
            case 3:
                BuscarProfesor();
                break;
            case 4:
                ciclo=false;
                break;
        }
        return ciclo;
    }

    private static void AgregarProfesor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese rut:");
        String rut = teclado.next();
        System.out.println("Ingrese Nombre:");
        String nombre=teclado.next();
        System.out.println("Ingrese Telefono:");
        String telefono=teclado.next();
        System.out.println("Ingrese Edad");
        int edad=teclado.nextInt();
        System.out.println("Ingrese el valor de la hora:");
        int valorHora=teclado.nextInt();
        
        Profesor pro=new Profesor();
        pro.setRut(rut);
        pro.setNombre(nombre);
        pro.setTelefono(telefono);
        pro.setEdad(edad);
        pro.setValorHora(valorHora);
        
        cole.agregarProfesor(pro);
        
    }

    private static void ListarProfesores() {
        cole.listarTodos();
    }

    private static void BuscarProfesor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese rut");
        String rut=teclado.next();
        System.out.println("");
        cole.buscarProfesor(rut);
    }
    
}
