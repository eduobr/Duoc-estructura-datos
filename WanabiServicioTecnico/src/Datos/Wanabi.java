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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edd
 */
public class Wanabi {

    private Cola colaVehiculos;
    private int tamañoCola;

    public Wanabi(int capacidad) {
        colaVehiculos = new Cola(capacidad);
        tamañoCola = capacidad;
    }

    public Cola getColaVehiculos() {
        return colaVehiculos;
    }

    public void setColaVehiculos(Cola colaVehiculos) {
        this.colaVehiculos = colaVehiculos;
    }

    public int getTamañoCola() {
        return tamañoCola;
    }

    public void setTamañoCola(int tamañoCola) {
        this.tamañoCola = tamañoCola;
    }

    public void insertarVehiculo(Cl_Vehiculo vehiculo) {
        try {
            colaVehiculos.insertar(vehiculo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void mostrarVehiculo() {
        try {
            colaVehiculos.mostraCola();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void generarAtencion() throws ParseException {
        Calendar ca = Calendar.getInstance();
        Calendar ca2 = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Date horaInicio = sdf.parse("06:00:00");
        ca.setTime(horaInicio);
        ca2.setTime(horaInicio);
        int minutosAtencion = 0;
        for (int i = 0; i < tamañoCola; i++) {
            Random rnd = new Random();
            int interMinutos = (int) ((rnd.nextDouble() * 6) + 10);
            String dueño = "HJ" + i;
            String patente = "ASD-123" + i;
            boolean esAtendido;
            boolean esNotificado = false;
            PilaLineal pl = new PilaLineal();
            minutosAtencion += interMinutos;
            ca.add(Calendar.MINUTE, 4);
            ca2.add(Calendar.MINUTE, interMinutos);
            if (minutosAtencion < 240) {
                esAtendido = true;
                pl = llenarPila();
//                int acumPrecio = totalMantencion(pl);
//                if (acumPrecio > 200000) {
//                    esNotificado = true;
//                }
            } else {
                esAtendido = false;

            }
            Date horaIngreso = ca.getTime();
            Date horaAtencion = ca2.getTime();
            Cl_Vehiculo veh = new Cl_Vehiculo(dueño, patente, esAtendido, horaIngreso, horaAtencion, pl, esNotificado);
            insertarVehiculo(veh);
        }
        mostrarVehiculo();
    }

    private PilaLineal llenarPila() {
        PilaLineal pl = new PilaLineal(5);
        String[] fallas = {"frenos", "motor", "bujias", "luces"};
        Random rnd = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                int posDescripcion = (int) (rnd.nextDouble() * 4);
                int precio = (int) ((rnd.nextDouble() * 80000) + 5000);
                String descripcion = fallas[posDescripcion];
                Date fecha = new Date();
                Cl_Mantencion ma = new Cl_Mantencion(precio, descripcion, fecha);
                pl.insertar(ma);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pl;
    }

    private int totalMantencion(PilaLineal pl) {
        PilaLineal auxPl = pl;
        int acumPrecio = 0;
        try {
            for (int i = 0; i < 5; i++) {
                Cl_Mantencion ma = (Cl_Mantencion) auxPl.quitar();
                acumPrecio += ma.getPrecio();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return acumPrecio;
    }

    public void Atendidos() throws Exception {
        int contadorAtendidos = 0;
        int contadorNoAtendidos = 0;
        for (int i = 0; i < tamañoCola; i++) {
            Cl_Vehiculo au = (Cl_Vehiculo) colaVehiculos.quitar();
            if (au.isEsAtendido()) {
                contadorAtendidos++;
            } else {
                contadorNoAtendidos++;
            }
        }
        System.out.println("Autos Atendidos:" + contadorAtendidos);
        System.out.println("Autos No Atendidos:" + contadorNoAtendidos);
    }

    public void propietariosNotificados() {
        try {
            int contadorNotificados = 0;
            for (int i = 0; i < tamañoCola; i++) {
                Cl_Vehiculo au = (Cl_Vehiculo) colaVehiculos.quitar();

                if (au.isEsAtendido()) {
                    int suma = 0;
                    for (int j = 0; j < 5; j++) {
                        Cl_Mantencion ma = (Cl_Mantencion) au.getMantencion().quitar();
                        suma += ma.getPrecio();
                    }
                    if (suma >= 200000) {
                        contadorNotificados++;
                    }
                }
            }
            System.out.println("POropietarios Notificados: " + contadorNotificados);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void pporcPropietarios() {
        try {
            int contadorMenores = 0;
            int totalAtendidos = 0;
            for (int i = 0; i < tamañoCola; i++) {
                Cl_Vehiculo au = (Cl_Vehiculo) colaVehiculos.quitar();
                if (au.isEsAtendido()) {
                    int suma = 0;
                    totalAtendidos++;
                    for (int j = 0; j < 5; j++) {
                        Cl_Mantencion ma = (Cl_Mantencion) au.getMantencion().quitar();
                        suma += ma.getPrecio();
                    }
                    if (suma < 200000) {
                        contadorMenores++;
                    }
                }
            }
            int porcentaje = (int) ((contadorMenores * 100) / totalAtendidos);
            System.out.println("Total Atendidos:"+totalAtendidos);
            System.out.println("Menores:"+contadorMenores);
            System.out.println("Porcentaje:"+porcentaje);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void promedioClientes() {
        try {
            int contadorAtendidos = 0;
            int sumaGeneral=0;
            for (int i = 0; i < tamañoCola; i++) {
                Cl_Vehiculo au = (Cl_Vehiculo) colaVehiculos.quitar();
                if (au.isEsAtendido()) {
                    int suma = 0;
                    for (int j = 0; j < 5; j++) {
                        Cl_Mantencion ma = (Cl_Mantencion) au.getMantencion().quitar();
                        suma += ma.getPrecio();
                    }
                    contadorAtendidos++;
                    sumaGeneral+=suma;
                }
            }
            int prom=(int)(sumaGeneral/contadorAtendidos);
            System.out.println("Promedio general: $" + prom);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
