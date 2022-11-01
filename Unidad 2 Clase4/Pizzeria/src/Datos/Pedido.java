/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.util.Date;

/**
 *
 * @author Duoc
 */
public class Pedido {
    private String nombreCliente;
    private Date horaPedido;
    private Date horaDespacho;
    private Date horaRecibe;
    private boolean esGratis;
    private Pizza pizza;

    public Pedido() {
    }
    public Pedido(String nombreCliente, Date horaPedido, Date horaDespacho, Date horaRecibe, Pizza pizza) {
        this.nombreCliente = nombreCliente;
        this.horaPedido = horaPedido;
        this.horaDespacho = horaDespacho;
        this.horaRecibe = horaRecibe;
        this.pizza = pizza;
    }

    public Date getHoraRecibe() {
        return horaRecibe;
    }

    public void setHoraRecibe(Date horaRecibe) {
        this.horaRecibe = horaRecibe;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(Date horaPedido) {
        this.horaPedido = horaPedido;
    }

    public Date getHoraDespacho() {
        return horaDespacho;
    }

    public void setHoraDespacho(Date horaDespacho) {
        this.horaDespacho = horaDespacho;
    }

    public boolean isEsGratis() {
        return esGratis;
    }

    public void setEsGratis(boolean esGratis) {
        this.esGratis = esGratis;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nombreCliente=" + nombreCliente + ", horaPedido=" + horaPedido + ", horaDespacho=" + horaDespacho + ", horaRecibe=" + horaRecibe + ", esGratis=" + esGratis + ", pizza=" + pizza + '}';
    }
    
    
}
