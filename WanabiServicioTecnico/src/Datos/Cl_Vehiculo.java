/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Edd
 */
public class Cl_Vehiculo {
    private String dueño;
    private String patente;
    private boolean esAtendido=false;
    private Date horaIngreso; 
    private Date horaAtencion;
    private boolean esNotificado=false;
    private PilaLineal mantencion = new PilaLineal(5);

    public Cl_Vehiculo() {
    }

    public Cl_Vehiculo(String dueño, String patente, boolean esAtendido, Date horaIngreso, Date horaAtencion, PilaLineal mantencion,boolean esNotificado) {
        this.dueño = dueño;
        this.patente = patente;
        this.esAtendido = esAtendido;
        this.horaIngreso = horaIngreso;
        this.horaAtencion = horaAtencion;
        this.mantencion = mantencion;
        this.esNotificado=esNotificado;
    }

    public PilaLineal getMantencion() {
        return mantencion;
    }

    public void setMantencion(PilaLineal mantencion) {
        this.mantencion = mantencion;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        return "Cl_Vehiculo{" + "due\u00f1o=" + dueño + ", patente=" + patente + ", esAtendido=" + esAtendido + ", horaIngreso=" + sdf.format(horaIngreso) + ", horaAtencion=" + sdf.format(horaAtencion) +" es notificado="+esNotificado+", mantencion=" + verMantenciones()+ '}';
    }
    
    public String verMantenciones(){
        return mantencion.mostrar2();
    }

    public boolean isEsNotificado() {
        return esNotificado;
    }

    public void setEsNotificado(boolean esNotificado) {
        this.esNotificado = esNotificado;
    }
}
