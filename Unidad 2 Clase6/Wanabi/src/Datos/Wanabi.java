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
 * @author Duoc
 */
public class Wanabi {

    private Cola colaVehiculos;
    private int tamañoCola;

    public Wanabi(int capacidad) {
        colaVehiculos = new Cola(capacidad);
        tamañoCola = capacidad;
    }

    public void insertarVehiculo(Cl_Auto auto) {
        try {
            colaVehiculos.insertar(auto);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void visualizarVehiculos() {
        try {
            colaVehiculos.mostrarCola();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void generarAtenciones() throws ParseException {

        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Date hora_inicio = sdf.parse("06:00:00");
        cal2.setTime(hora_inicio);
        cal.setTime(hora_inicio);
        int minutosAtencion = 0;
        boolean esAtendido = true;
        for (int i = 0; i < tamañoCola; i++) {
            Random rnd = new Random();
            int intervaloAtencion = (int) ((rnd.nextDouble() * 6) + 10);
            minutosAtencion += intervaloAtencion;
            PilaLineal pl=new PilaLineal(5);
            if (minutosAtencion > 240) {
                esAtendido = false;
            } else {
                esAtendido = true;
                pl = llenarPila();
            }
            String dueño = "GM";
            String patente = "JG-761" + i;
            cal.add(Calendar.MINUTE, 4);
            Date hi = cal.getTime();
            //cal2.setTime(hi);
            cal2.add(Calendar.MINUTE, intervaloAtencion);
            Date ha = cal2.getTime();
            Cl_Auto veh = new Cl_Auto(patente, dueño, esAtendido, hi, ha, pl);
            insertarVehiculo(veh);
            System.out.println("Agrego Vehiculo");
        }
    }

    private PilaLineal llenarPila() {
        try {
            String[] tiposMantencion = new String[]{"ruedas", "Tapiz", "Aceite", "Motor", "Frenos"};
            PilaLineal pila = new PilaLineal(5);
            Random rnd = new Random();
            for (int i = 0; i < 5; i++) {
                int posDescripcion = (int) (rnd.nextDouble() * 5);
                String descripcion = tiposMantencion[posDescripcion];
                int precio = (int) ((rnd.nextDouble() * 225001) + 5000);
                Date fecha = new Date();
                Cl_Mantencion mantencion = new Cl_Mantencion(precio, descripcion, fecha);
                pila.insertar(mantencion);
            }
            return pila;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
