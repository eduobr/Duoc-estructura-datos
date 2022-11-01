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
public class Servicio {

    private Cliente cliente;
    private int tipoContrato;
    private int precio;
    private int cantidadMeses;
    private String[] adicionales = new String[4];

    public Servicio() {
    }

    public Servicio(Cliente cliente, int tipoContrato, int precio, int cantidadMeses, String[] adicionales) {
        this.cliente = cliente;
        setTipoContrato(tipoContrato);
        this.precio = precio;
        this.cantidadMeses = cantidadMeses;
        this.adicionales = adicionales;
    }

    public int getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(int cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        if (tipoContrato == 1 || tipoContrato == 2 || tipoContrato == 3) {
            this.tipoContrato = tipoContrato;
        } else {
            System.out.println("El tipo de contrato solo puede ser 1(anual)-2(menusual)-3(semestral)");
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String[] getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(String[] adicionales) {
        if (adicionales.equals("floreria") || adicionales.equals("servicio religioso") || adicionales.equals("lloronas") || adicionales.equals("limusina")) {
            this.adicionales = adicionales;
        }else{
            System.out.println("Los servicios solo pueden ser:");
            System.out.println("floreria - servicio religioso - lloronas - limusina");
        }
    }

    @Override
    public String toString() {
        return "Servicio{" + "cliente=" + cliente + ", tipoContrato=" + tipoContrato + ", precio=" + precio + ", cantidadMeses=" + cantidadMeses + ", adicionales=" + adicionales() + '}';
    }
    
    public String adicionales(){
        String texto="";
        for (String ad : adicionales) {
            texto+=ad+",";
        }
        return texto;
    }

}
