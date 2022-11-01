package Datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test {

    public static void main(String[] args) throws ParseException {
        //  ejemplo();
        //ejemploRandom();
        //ejemploHora();
        
        pizzeria();

    }

    private static void ejemplo() {
        Cola cola1 = new Cola(6);//0-5
        try {
            cola1.insertar(5);
            cola1.insertar(4);
            cola1.insertar(78);
            cola1.insertar(34);
            cola1.insertar(44);
            cola1.insertar(74);
            System.out.println("quitar Elemento:" + cola1.quitar());
            cola1.mostraCola();
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    private static void ejemploRandom() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            // int valorAleatorio=(int)(rnd.nextDouble()*6+5);//entre 5 y 10
            // int valorAleatorio1=(int)((rnd.nextDouble()*6)+15);//entre 15 - 20
            int valorAleatorio2 = (int) ((rnd.nextDouble() * 36) + 5);//entre 5 - 40
            System.out.println("valor aleatorio:" + valorAleatorio2);
        }
    }

    private static void ejemploHora() throws ParseException {
        Date fecha_Completa = new Date();
        //System.out.println("Fecha Completa="+fecha_Completa.getHours()+":"+fecha_Completa.getMinutes());
        SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Fecha Completa=" + fmt.format(fecha_Completa));
//        System.out.println("Fecha Completa=" + fecha_Completa);

        //suma 5 minutos
        Calendar cal = Calendar.getInstance();

        Date f1 = fmt.parse("12:00:00");

        for (int i = 0; i < 100; i++) {
            
            cal.add(Calendar.MINUTE, 5);
            fecha_Completa = cal.getTime();
            System.out.println("Hora nueva=" + fmt.format(fecha_Completa));
            if (fecha_Completa.after(f1)) {
                break;
            }

        }

    }

    private static void pizzeria() {
        Pizzeria pizaRara= new Pizzeria(100);
        
        //tipos de pizza
        Pizza piza1=new Pizza("napolitana", 8000);
        Pizza piza2=new Pizza("doble queso", 8070);
        Pizza piza3=new Pizza("española", 8000);
        
        /*Date FechaHora=new Date();
        
        //los pedidos debem generarse aleatoriamente (100)
        Pedido ped=new Pedido("gm", FechaHora, FechaHora, FechaHora,  piza1);
        
        pizaRara.InsertarPedido(ped);
        pizaRara.mostrarPedido();*/
        pizaRara.insertarPizzas(piza1);
        pizaRara.insertarPizzas(piza2);
        pizaRara.insertarPizzas(piza3);
        pizaRara.insertarCliente("Gabriel Medina");
        pizaRara.insertarCliente("Carlos Cortes");
        pizaRara.insertarCliente("Waldo Nado");
        pizaRara.generarPedidos();
        pizaRara.mostrarPedido();
        //pizaRara.pizzasGratis();
        //pizaRara.totalVentas();
        //pizaRara.pizzaMasVendida();
        pizaRara.pizzaMenosVendida();
        
    }
}
