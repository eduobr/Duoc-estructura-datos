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

public class Test {

    public static void main(String[] args) {
        //ejemploRandom();
        //ejemploHora();
        Pizzeria();
    }

    private static void ejemploRandom() {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            //int valorAleatorio=(int)(rnd.nextDouble()*6+5);//5-10
            //int valorAleatorio=(int)(rnd.nextDouble()*6+15)//15-20;
            int valorAleatorio = (int) (rnd.nextDouble() * 36 + 5);
            System.out.println("Valor Aleatorio:" + valorAleatorio);
        }
    }

    private static void ejemploHora() {
        try {
            Date fecha_completa = new Date();
            SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
            //sumar 5 minutos
            Calendar cal = Calendar.getInstance();
            Date fecha_limite = fmt.parse("12:00:00");
            System.out.println("Fecha Limite:" + fmt.format(fecha_limite));
            System.out.println("Fecha Completa:" + fmt.format(fecha_completa.getTime()));
            for (int i = 0; i < 100; i++) {
                cal.add(Calendar.MINUTE, 5);
                fecha_completa = cal.getTime();
                System.out.println("Hora nueva:" + fmt.format(fecha_completa.getTime()));
                if (fecha_completa.before(fecha_limite)) {
                    break;
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void Pizzeria() {
        PizzeriaRARA prr = new PizzeriaRARA(3);
        Pizza combo1=new Pizza("Napolitana", 7000);
        Pizza combo2=new Pizza("Española", 8500);
        Pizza combo3=new Pizza("Doble Queso", 7500);
        
        Pedido p1=new Pedido("GM",new Date(),new Date(),new Date(),combo1);
        Pedido p2=new Pedido("GM",new Date(),new Date(),new Date(),combo1);
        Pedido p3=new Pedido("GM",new Date(),new Date(),new Date(),combo1);
        
        prr.insertarPedido(p1);
        prr.insertarPedido(p2);
        prr.insertarPedido(p3);
        
        prr.mostrarPedido();
    }

}
