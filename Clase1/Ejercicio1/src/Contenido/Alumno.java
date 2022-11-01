/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

/**
 *
 * @author Duoc
 */
public class Alumno {

    private String rut;
    private String nombre;
    private String apellidos;
    private int edad;
    private double[] notas = new double[5];
    private int puntero=0;

    public Alumno() {
    }

    public Alumno(String rut, String nombre, String apellidos, int edad, double[] notas) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.notas = notas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 5 && edad <= 80) {
            this.edad = edad;
        } else {
            System.out.println("la dedad debe estar entre 5 y 80");
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (rut.length() > 5) {
            this.rut = rut;
        } else {
            System.out.println("el largo del rut debe ser mayor a 5");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() != 0) {
            this.nombre = nombre;
        } else {
            System.out.println("El largo del nombre debe ser distinto de 0");
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (apellidos.length() >= 10) {
            this.apellidos = apellidos;
        } else {
            System.out.println("largo minimo apellido 10");
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;

    }
    
    //metodos customer
    
    public String MostrarNotas(){
        String mensaje="";
        for (int i = 0; i <=4; i++) {
            mensaje = "nota"+(i+1)+":"+notas[i];
        }
        return mensaje;
    }
    
    public void Imprimir(){
        System.out.println("Nombre:"+getNombre());
        System.out.println("Rut:"+getRut());
        for (int i = 0; i <=4; i++) {
            System.out.println("nota"+(i+1)+":"+notas[i]);
        }
        //System.out.println("sus notas son:"+MostrarNotas());
    }
    
    public double calcularPromedio(){
        double suma=0;
        for (int i = 0; i <5; i++) {
            suma+=notas[i];
        }
        double promedio = suma/5;
        return promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    //metodo mayorNota, menorNota. Estado(Repro/Apro),Cantidad Azules y Rojos
    
    public double mayorNota(){
        double max=0;
        for (int i = 0; i <5; i++) {
            if (notas[i]>max) {
                max=notas[i];
            }
        }
        return max;
    }
    
    public double menorNota(){
        double min=7;
        for (int i = 0; i <5; i++) {
            if (notas[i]<min) {
                min=notas[i];
            }
        }
        return min;
    }
    
    public void estado(){
        if (calcularPromedio()>=4) {
            System.out.println("El alumno aprobo");
        }else{
            System.out.println("El alumno reprobo");
        }
    }
    
    public void cantAzulesRojos(){
        int contAzules=0;
        int contRojos=0;
        for (int i = 0; i < 5; i++) {
            if (notas[i]>=4) {
                contAzules++;
            }else{
                contRojos++;
            }
        }
        System.out.println("Cantidad de Azules:"+contAzules);
        System.out.println("Cantidad de Rojos:"+contRojos);
    }
    
    public void agregarNota(double nota){
        if (punteroLleno()) {
            System.out.println("No se puenden agregar mas nots");
            return;
        }
        notas[puntero]=nota;
        System.out.println("nota agregada");
        puntero++;
    }

    private boolean punteroLleno() {
        if (puntero==5) {
            return true;
        }else{
            return false;
        }
    }

}
