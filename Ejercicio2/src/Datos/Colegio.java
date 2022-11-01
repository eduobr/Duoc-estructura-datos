/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Edd
 */
public class Colegio {
    private Profesor[] profesor;
    private static int puntero;

    public Colegio() {
        profesor = new Profesor[10];
        puntero=0;
    }
    
    public void agregarProfesor(Profesor pro){
        if (punteroLleno()) {
            System.out.println("Arreglo lleno");
            return;
        }
        profesor[puntero]=pro;
        System.out.println("profesor agregado");
        puntero++;
    }

    private boolean punteroLleno() {
        if (puntero==10) {
            return true;
        }else{
            return false;
        }
    }
    
    public void listarTodos(){
        for (int i = 0; i < puntero; i++) {
            System.out.println(profesor[i].toString());
        }
    }
    
    public void buscarProfesor(String rut){
        for (int i = 0; i < puntero; i++) {
            if (profesor[i].getRut().equals(rut)) {
                System.out.println("Existe");
                System.out.println(profesor[i].toString());
                return;
            }
        }
        System.out.println("No existe el profesor");
    }
    
    
}
