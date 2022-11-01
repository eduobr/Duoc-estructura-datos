package Datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Duoc
 */
public class Alumno {

    private String nombre;
    private String rut;
    private int edad;
    private char sexo;
    private int[] notas = new int[5];

    public Alumno(String nombre, int edad, char sexo, int[] notas) {
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
        this.notas = notas;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre  + ", edad=" + edad + ", sexo=" + sexo + ", notas=" + Notas() + '}';
    }

    private String Notas() {
        String texto = "";
        for (int i = 0; i < 5; i++) {
            texto += " Nota " + (i + 1) + ":" + notas[i];
        }
        return texto;
    }
    
    public double promedio(){
        double suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma+=notas[i];
        }
        return suma/notas.length;
    }
    
    public String situacion(){
        if (promedio()>=4) {
            return "Aprobado";
        }
        return "Reprobado";
    }
}
