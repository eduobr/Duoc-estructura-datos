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
public class Practica2Evaluacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Jose", "12345678-9", "67196561", "Pte alto", 21);
        Servicio sr1 = new Servicio(cl1, 2, 20000, 5, new String[]{"floreria","lloronas"});
        Cliente cl2 = new Cliente("Juan", "34567891-0", "98667819", "Maipu", 25);
        Servicio sr2 = new Servicio(cl2, 3, 11000, 5, new String[]{"servicio religioso","limusina"});
        Cliente cl3 = new Cliente("Diego", "5678910-1", "87263791", "Renca", 32);
        Servicio sr3 = new Servicio(cl3, 2, 35000, 5, new String[]{"limusina"});
        Cliente cl4= new Cliente("Pedro", "6789101-2", "98798798", "Renca", 35);
        Servicio sr4 = new Servicio(cl4, 1, 65000, 7, new String[]{"lloronas"});
        NadieLeImportaste nd = new NadieLeImportaste();
        nd.agregarContrato(sr1);
        nd.agregarContrato(sr2);
        nd.agregarContrato(sr3);
        nd.agregarContrato(sr4);
        nd.mostrarDatos();
        System.out.println("");
        System.out.println("precio promedio: "+nd.precioPromedio());
        nd.menorPromedio();
        nd.mayoresTrienta();
        nd.gananciaTotal();
        nd.servicioLloronas();
        
    }
    
}
