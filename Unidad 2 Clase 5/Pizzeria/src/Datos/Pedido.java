package Datos;

import java.util.Date;

public class Pedido {

    private String nombre;
    private Date horaPedido;
    private Date horaDespacho;
    private Date horaRecibido;
   private boolean esGratis;
    private Pizza pizza;

    public Pedido() {
    }

    public Pedido(String nombre, Date horaPedido, Date horaDespacho, Date horaRecibido, Pizza pizza) {
        this.nombre = nombre;
        this.horaPedido = horaPedido;
        this.horaDespacho = horaDespacho;
        this.horaRecibido = horaRecibido;
       
        this.pizza = pizza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Date getHoraRecibido() {
        return horaRecibido;
    }

    public void setHoraRecibido(Date horaRecibido) {
        this.horaRecibido = horaRecibido;
    }

  

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public boolean isEsGratis() {
        return esGratis;
    }

    public void setEsGratis(boolean esGratis) {
        this.esGratis = esGratis;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nombre=" + nombre + ", horaPedido=" + horaPedido + ", horaDespacho=" + horaDespacho + ", horaRecibido=" + horaRecibido + ", esGratis=" + esGratis + ", pizza=" + pizza + '}';
    }
}
