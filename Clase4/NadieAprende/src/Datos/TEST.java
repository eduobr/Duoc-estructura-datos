/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author Duoc
 */
public class TEST {

    
    public static void main(String[] args) {
       Colegio cole = new Colegio();
       
       Alumno a1=new Alumno("GM", 21, 'M', new int[]{2,2,3,4,3});
       Alumno a2=new Alumno("MJ", 25, 'M', new int[]{1,4,5,3,3});
       
       cole.agregarAlumnos(a1);
       cole.agregarAlumnos(a2);
       
       cole.mostrarAlumnos();
       
       cole.Metodo1();
       cole.Metodo2();
       cole.Metodo3();
    }
    
}
