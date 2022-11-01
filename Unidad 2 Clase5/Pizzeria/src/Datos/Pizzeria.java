package Datos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
public class Pizzeria {

    private Cola colaPizza;
    private Pizza[] tiposPizza = new Pizza[3];
    int posTipoPizza = 0;
    private String[] cliente = new String[3];
    int posCliente = 0;

    public Pizzeria(int Tamano) {
        colaPizza = new Cola(Tamano);
    }

    public void insertarPizzas(Pizza pizza) {
        if (posTipoPizza < 3) {
            tiposPizza[posTipoPizza] = pizza;
            posTipoPizza++;
            System.out.println("Agrego tipo de pizza:" + pizza.getTipoPiza());
        } else {
            System.out.println("Arreglo de tipo pizza lleno");
        }

    }

    //metodo insertar ,mostra
    public void InsertarPedido(Pedido ped) {
        try {
            colaPizza.insertar(ped);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void mostrarPedido() {
        try {
            colaPizza.mostraCola();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertarCliente(String cli) {
        if (posCliente < 3) {
            cliente[posCliente] = cli;
            posCliente++;
            System.out.println("Agrego Cliente:" + cli);
        } else {
            System.out.println("Arreglo clientes Lleno");
        }
    }

    public void generarPedidos() {
        if (posCliente < 3) {
            System.out.println("Faltan Clientes");
            return;
        }
        if (posTipoPizza < 3) {
            System.out.println("Faltan Pizzas");
            return;
        }
        Random rnd = new Random();
        Date fecha_hora_actual = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
        System.out.println(fmt.format(fecha_hora_actual));
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Calendar cal3 = Calendar.getInstance();
        for (int i = 0; i < 100; i++) {
            int cli = (int) (rnd.nextDouble() * 3);
            int piz = (int) (rnd.nextDouble() * 3);
            System.out.println("Cliente:" + cliente[cli] + " - Pizza:" + tiposPizza[piz]);
            int hp = (int) ((rnd.nextDouble() * 6) + 5);
            cal.add(Calendar.MINUTE, hp);
            fecha_hora_actual = cal.getTime();
            System.out.println("Hora Pedido:" + fmt.format(fecha_hora_actual));
            System.out.println("Intervalo de Pedido:" + hp);
            int hd = (int) ((rnd.nextDouble() * 6) + 15);
            Date hora_despacho = fecha_hora_actual;
            cal2.setTime(fecha_hora_actual);
            cal2.add(Calendar.MINUTE, hd);
            hora_despacho = cal2.getTime();
            System.out.println("Hora Despacho:" + fmt.format(hora_despacho));
            System.out.println("Intervalo despacho:" + hd);
            int hr = (int) ((rnd.nextDouble() * 36) + 5);
            Date hora_recibo = new Date();
            cal3.setTime(hora_despacho);
            cal3.add(Calendar.MINUTE, hr);
            hora_recibo = cal3.getTime();
            System.out.println("Hora Recibo:" + fmt.format(hora_recibo));
            System.out.println("Intervalo de recibo:" + hr);
            boolean esGratis = (hr >= 30 ? true : false);
            Pedido ped = new Pedido(cliente[cli], fecha_hora_actual, hora_despacho, hora_recibo, tiposPizza[piz]);
            ped.setEsGratis(esGratis);
            InsertarPedido(ped);
            System.out.println("Pedido Creado");
            System.out.println("-------------------------------------");
        }
        System.out.println("OK");
    }

    public void pizzasGratis() {
        System.out.println("-------------------------------------");
        System.out.println("Pizzas Gratis");
        for (int i = 0; i < 100; i++) {
            try {
                Pedido ped = (Pedido) colaPizza.quitar();
                if (ped.isEsGratis()) {
                    System.out.println(ped);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("-------------------------------------");
    }

    public void totalVentas() {
        System.out.println("-------------------------------------");
        int acum = 0;
        for (int i = 0; i < 100; i++) {
            try {
                Pedido ped = (Pedido) colaPizza.quitar();
                for (int j = 0; j < 3; j++) {
                    acum += ped.getPizza().getValor();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Total de ventas: $" + acum);
        System.out.println("-------------------------------------");
    }

    public void pizzaMasVendida() {
        System.out.println("-------------------------------------");
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int i = 0; i < 100; i++) {
            try {
                Pedido ped = (Pedido) colaPizza.quitar();
                for (int j = 0; j < 3; j++) {
                    if (ped.getPizza().getTipoPiza().equals("napolitana")) {
                        cont1++;
                    }
                    if (ped.getPizza().getTipoPiza().equals("doble quezo")) {
                        cont2++;
                    }
                    if (ped.getPizza().getTipoPiza().equals("española")) {
                        cont3++;
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cont1 > cont2 && cont1 > cont3) {
            System.out.println("Pizza mas vendida:Napolitana");
        }
        if (cont2 > cont1 && cont2 > cont3) {
            System.out.println("Pizza mas vendida:doble queso");

        }
        if (cont3 > cont2 && cont3 > cont1) {
            System.out.println("Pizza mas vendida:española");
        }
        System.out.println("-------------------------------------");
    }
    public void pizzaMenosVendida() {
        System.out.println("-------------------------------------");
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int i = 0; i < 100; i++) {
            try {
                Pedido ped = (Pedido) colaPizza.quitar();
                for (int j = 0; j < 3; j++) {
                    if (ped.getPizza().getTipoPiza().equals("napolitana")) {
                        cont1++;
                    }
                    if (ped.getPizza().getTipoPiza().equals("doble queso")) {
                        cont2++;
                    }
                    if (ped.getPizza().getTipoPiza().equals("española")) {
                        cont3++;
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cont1 < cont2 && cont1 < cont3) {
            System.out.println("Pizza menos vendida:Napolitana");
        }
        if (cont2 < cont1 && cont2 < cont3) {
            System.out.println("Pizza menos vendida:doble queso");

        }
        if (cont3 < cont2 && cont3 < cont1) {
            System.out.println("Pizza mas vendida:española");
        }
        System.out.println("-------------------------------------");
    }

}
