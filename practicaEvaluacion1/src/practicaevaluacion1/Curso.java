/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaevaluacion1;

/**
 *
 * @author Edd
 */
public class Curso {
    private String nombre;
    private int duracion;
    private int precio;
    private int cupos;
    private String[] ciudades = new String[3];

    public Curso(String nombre, int duracion, int precio, int cupos, String[] ciudades) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.cupos = cupos;
        this.ciudades = ciudades;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String[] getCiudades() {
        return ciudades;
    }

    public void setCiudades(String[] ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio + ", cupos=" + cupos + ", ciudades=" + ciudades() + '}';
    }
    
    public String ciudades(){
        String ciud="";
        for (String ciudade : ciudades) {
            ciud+=ciudade+", ";
        }
        return ciud;
    }
    
}
