/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private Date horaLlegada;
    private Date horaAtendido;
    private int num;
    private PilaLineal producto;
    private boolean esAtendido;

    public Cliente() {
    }

    public Cliente(Date horaLlegada, Date horaAtendido, int num, PilaLineal producto, boolean esAtendido) {
        this.horaLlegada = horaLlegada;
        this.horaAtendido = horaAtendido;
        this.num = num;
        this.producto = producto;
        this.esAtendido = esAtendido;
    }

    public boolean isEsAtendido() {
        return esAtendido;
    }

    public void setEsAtendido(boolean esAtendido) {
        this.esAtendido = esAtendido;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Date getHoraAtendido() {
        return horaAtendido;
    }

    public void setHoraAtendido(Date horaAtendido) {
        this.horaAtendido = horaAtendido;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public PilaLineal getProducto() {
        return producto;
    }

    public void setProducto(PilaLineal producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return "Cliente{" + "horaLlegada=" + sdf.format(horaLlegada)+ ", horaAtendido=" + sdf.format(horaAtendido) + ", num=" + num + ", esAtendido=" + esAtendido +", productos=" + producto.mostrar2()  + '}';
    }
    
    
}
