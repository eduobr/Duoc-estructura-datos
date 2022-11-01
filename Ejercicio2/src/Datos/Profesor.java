/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

public class Profesor {

    private String rut;
    private String nombre;
    private String telefono;
    private int edad;
    private int valorHora;

    public Profesor() {
    }

    public Profesor(String rut, String nombre, String telefono, int edad, int valorHora) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.valorHora = valorHora;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        }else{
            System.out.println("El valor de la hora debe ser mayor a 0");
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (rut.length() > 5) {
            this.rut = rut;
        } else {
            System.out.println("Largo rut mayor a 5");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.trim().length() > 5) {
            this.nombre = nombre;
        } else {
            System.out.println("Largo nombre mayor a 5");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() > 2) {
            this.telefono = telefono;
        } else {
            System.out.println("Largo telefono minimo 2");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 20 && edad <= 80) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe estar entre 20 y 80");
        }
    }

    @Override
    public String toString() {
        return "Profesor{" + "rut=" + rut + ", nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad + ", valorHora=" + valorHora + '}';
    }

}
