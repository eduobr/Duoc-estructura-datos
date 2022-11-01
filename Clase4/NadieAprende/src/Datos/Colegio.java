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
public class Colegio {
    private Lista listaAlumnos;

    public Colegio() {
        listaAlumnos = new Lista();
    }
    
    public void agregarAlumnos(Alumno alum){
        listaAlumnos.insertarCabezaLista(alum);
    }
    
    public void mostrarAlumnos(){
        listaAlumnos.visualizar();
    }
    
    public void Metodo1(){
        Nodo nodoTemp=listaAlumnos.getPrimero();
        while (nodoTemp!=null) {            
            Alumno AlumnoTemp = (Alumno)nodoTemp.getDato();
            System.out.println(AlumnoTemp.getNombre()+"-"+AlumnoTemp.getEdad()+"-"+AlumnoTemp.promedio()+"-"+AlumnoTemp.situacion());
            nodoTemp = nodoTemp.getEnlace();
        }
    }
    
    public void Metodo2(){
        int acumM=0;
        int acumF=0;
        Nodo nodoTemp = listaAlumnos.getPrimero();
        while (nodoTemp!=null) {            
            Alumno AlumnoTemp=(Alumno)nodoTemp.getDato();
            if (AlumnoTemp.getSexo()=='M' && AlumnoTemp.promedio()>=4) {
                acumM++;
            }
            if (AlumnoTemp.getSexo()=='F' && AlumnoTemp.promedio()>=4) {
                acumF++;
            }
            nodoTemp=nodoTemp.getEnlace();
        }
        System.out.println("Hombres Aprobados: "+acumM);
        System.out.println("Mujeres Aprobadas: "+acumF);
    }
    
    public void Metodo3(){
        double acum = 0;
        int contador=0;
        Nodo nodoTemp = listaAlumnos.getPrimero();
        while (nodoTemp!=null) {            
            Alumno alumnoTemp = (Alumno)nodoTemp.getDato();
            acum+=alumnoTemp.promedio();
            contador++;
            nodoTemp = nodoTemp.getEnlace();
        }
        System.out.println("Promedio curso: "+acum/contador);
    }
}
