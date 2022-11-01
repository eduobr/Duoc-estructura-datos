/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Duoc
 */
public class AlmacenDonPepe {

    private Cola colaCliente;
    private int tamañoCola;

    public AlmacenDonPepe() {
    }

    public AlmacenDonPepe(int capacidad) {
        colaCliente = new Cola(capacidad);
        tamañoCola = capacidad;
    }

    public Cola getColaCliente() {
        return colaCliente;
    }

    public void setColaCliente(Cola colaCliente) {
        this.colaCliente = colaCliente;
    }

    public int getTamañoCola() {
        return tamañoCola;
    }

    public void setTamañoCola(int tamañoCola) {
        this.tamañoCola = tamañoCola;
    }

    public void insertarCliente(Cliente cl) throws Exception {
        colaCliente.insertar(cl);
    }

    public void mostrarClientes() throws Exception {
        colaCliente.mostrarCola();
    }

    public void generarCola() throws ParseException, Exception {
        Calendar ca = Calendar.getInstance();
        Calendar ca2 = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Date horaInicio = sdf.parse("16:00:00");
        ca.setTime(horaInicio);
        ca2.setTime(horaInicio);
        Date horaLlegada = ca.getTime();
        Date horaAtendido = ca2.getTime();
        int tMinutosLlegada = 0;
        int tMinutosAtencion = 0;
        int interMinutosLlegada = 0;
        int contador = 0;
        int totalVenta = 0;
        int clientesAtendidos = 0;
        int clientesNoAtendidos = 0;
        int contadorVentasMenores = 0;
        boolean esAtendido = true;
        int porClientesNoAtendidos = 0;
        for (tMinutosLlegada = 0; tMinutosLlegada < 180; tMinutosLlegada += interMinutosLlegada) {
            Random rnd = new Random();
            interMinutosLlegada = (int) ((rnd.nextDouble() * 3) + 1);
            int interMinutosAtendido = (int) ((rnd.nextDouble() * 6) + 5);
            tMinutosAtencion += interMinutosAtendido;
            ca.add(Calendar.MINUTE, interMinutosLlegada);
            ca2.add(Calendar.MINUTE, interMinutosAtendido);
            horaLlegada = ca.getTime();
            horaAtendido = ca2.getTime();
            contador++;
            colaCliente = new Cola(contador);
            PilaLineal p = new PilaLineal(5);
            if (tMinutosAtencion < 180) {
                int venta = 0;
                for (int i = 0; i < 5; i++) {
                    int precioProducto = (int) ((rnd.nextDouble() * 9001) + 1000);
                    p.insertar(precioProducto);
                    venta += precioProducto;

                    esAtendido = true;
                }
                totalVenta += venta;
                if (venta < 15000) {
                    contadorVentasMenores++;
                }
                clientesAtendidos++;
            } else {
                esAtendido = false;
                clientesNoAtendidos++;
            }
            Cliente c = new Cliente(horaLlegada, horaAtendido, contador, p, esAtendido);
            insertarCliente(c);
            mostrarClientes();
            porClientesNoAtendidos = ((clientesNoAtendidos * 100) / contador);
        }
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("Total de la venta= $" + totalVenta);
        System.out.println("------------------------------------------------");
        System.out.println("Total clientes Atendidos=" + clientesAtendidos);
        System.out.println("------------------------------------------------");
        System.out.println("Clientes no Atendidos=" + clientesNoAtendidos);
        System.out.println("------------------------------------------------");
        System.out.println("Total clientes=" + contador);
        System.out.println("------------------------------------------------");
        System.out.println("Porcentaje clientes no Atendidos=" + porClientesNoAtendidos + "%");
        System.out.println("------------------------------------------------");
        System.out.println("Cantidad ventas menores a $15000=" + contadorVentasMenores);
        System.out.println("------------------------------------------------");
        tamañoCola = contador;
    }

}
