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
public class NadieLeImportaste {
    public Lista contrato;

    public NadieLeImportaste() {
        contrato = new Lista();
    }
    
    public void agregarContrato(Servicio serv){
        contrato.insertarCabezaLista(serv);
    }
    
    public void mostrarDatos(){
        contrato.visualizar();
    }
    
    public int precioPromedio(){
        Nodo listaC = contrato.getPrimero();
        int acum=0;
        int cont=0;
        while (listaC!=null) {
            Servicio sr= (Servicio)listaC.getDato();
            acum+=sr.getPrecio();
            cont++;
            listaC=listaC.getEnlace();
        }
        return acum/cont;
    }
    
    public void menorPromedio(){
        Nodo listaC=contrato.getPrimero();
        int cont=0;
        while (listaC!=null) {
            Servicio sr = (Servicio)listaC.getDato();
            if (sr.getPrecio()<precioPromedio()) {
                cont++;
            }
            listaC=listaC.getEnlace();
        }
        System.out.println("");
        System.out.println("Servicios menores al promedio: "+cont);
    }
    
    public void mayoresTrienta(){
        Lista lTemp = new Lista();
        Nodo listaC=contrato.getPrimero();
        while (listaC!=null) {
            Servicio sr=(Servicio)listaC.getDato();
            if (sr.getCliente().getEdad()>30) {
                lTemp.insertarCabezaLista(sr);
            }
            listaC=listaC.getEnlace();
        }
        System.out.println("");
        System.out.println("Clientes Mayores a 30 años");
        lTemp.visualizar();
    }
    
    public void gananciaTotal(){
        Nodo listaC = contrato.getPrimero();
        double interes=0;
        double interesAd=0;
        double ganTotal=0;
        while (listaC!=null) {
            Servicio sr = (Servicio)listaC.getDato();
            if (sr.getCantidadMeses()>6) {
                interes =0.10;
            }
            String[]ad=sr.adicionales().split(",");
            interesAd=(ad.length*3);
            ganTotal = sr.getPrecio()+(sr.getPrecio()*interes)+(sr.getPrecio()*(interesAd/100));
            System.out.println("");
            System.out.println("Nombre: "+sr.getCliente().getNombre()+" cantidad de meses:"+sr.getCantidadMeses()+", ganancia total: "+ganTotal);
            listaC=listaC.getEnlace();
        }
        
    }
    
    public void servicioLloronas(){
        Nodo listaC = contrato.getPrimero();
        int cont=0;
        while (listaC!=null) {
            Servicio sr = (Servicio)listaC.getDato();
            if (sr.adicionales().contains("lloronas")) {
                cont++;
            }
            listaC = listaC.getEnlace();
        }
        System.out.println("");
        System.out.println("Cantidad de contratos que optaron por sercicio de lloronas: "+cont);
    }
    
    
}
