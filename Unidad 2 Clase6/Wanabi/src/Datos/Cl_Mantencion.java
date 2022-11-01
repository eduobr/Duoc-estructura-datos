/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cl_Mantencion {
    private int precio;
    private String descripcion;
    private Date fecha;

    public Cl_Mantencion() {
    }

    public Cl_Mantencion(int precio, String descripcion, Date fecha) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
        return "Cl_Mantencion{" + "precio=" + precio + ", descripcion=" + descripcion + ", fecha=" + sdf.format(fecha) + '}';
    }
}
