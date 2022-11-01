/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL;

/**
 *
 * @author Duoc
 */
public class Alumno {

    private int codigo;
    private String nombre;
    private int edad;
    private char sexo;
    private double[] notas = new double[3];
    private String situacion;

    public Alumno() {
    }

    public Alumno(int codigo, String nombre, int edad, char sexo, double[] notas, String situacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.notas = notas;
        this.situacion = situacion;
        if (promedio()>=4) {
            this.situacion="A";
        }else{
            this.situacion="R";
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", notas=" + mostrarNotas() + ", situacion=" + situacion + '}';
    }

    private String mostrarNotas() {
        String texto = "";
        for (int i = 0; i < 3; i++) {
            texto += " nota " + (i + 1) + ":" + notas[i];
        }
        return texto;
    }

    public int promedio() {
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            suma+=notas[i];
        }
        return (int)(suma/3);
    }
}
