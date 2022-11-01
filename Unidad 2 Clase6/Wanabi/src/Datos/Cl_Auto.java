/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cl_Auto {
    private String patente;
    private String dueño;
    private boolean esAtendido;
    private Date horaIngreso;
    private Date horaAtencion;
    private PilaLineal mantenciones=new PilaLineal(5);

    public Cl_Auto() {
    }

    public Cl_Auto(String patente, String dueño, boolean esAtendido, Date horaIngreso, Date horaAtencion, PilaLineal mantencion) {
        this.patente = patente;
        this.dueño = dueño;
        this.esAtendido = esAtendido;
        this.horaIngreso = horaIngreso;
        this.horaAtencion = horaAtencion;
        this.mantenciones = mantencion;
    }

    public PilaLineal getMantencion() {
        return mantenciones;
    }

    public void setMantencion(PilaLineal mantencion) {
        this.mantenciones = mantencion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public boolean isEsAtendido() {
        return esAtendido;
    }

    public void setEsAtendido(boolean esAtendido) {
        this.esAtendido = esAtendido;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Date getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(Date horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    @Override
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
        return "Cl_Auto{" + "patente=" + patente + ", due\u00f1o=" + dueño + ", esAtendido=" + esAtendido + ", horaIngreso=" + fmt.format(horaIngreso) + ", horaAtencion=" + fmt.format(horaAtencion) + ", mantencion=" + verMantenciones() + '}';
    }
    
    public String verMantenciones(){
        return mantenciones.mostrar2();
    }
    
}
