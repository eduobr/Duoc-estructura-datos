/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2evaluacion1;

/**
 *
 * @author Duoc
 */
public class Cliente {
    private String nombre;
    private String rut;
    private String telefono;
    private String direccion;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String rut, String telefono, String direccion, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", rut=" + rut + ", telefono=" + telefono + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
}
