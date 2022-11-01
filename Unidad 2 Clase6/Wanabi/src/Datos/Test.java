/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Wanabi wst = new Wanabi(60);
            /*Cl_Auto au1= new Cl_Auto("AS-326", "GM", false, null, null, null);
            Cl_Auto au2= new Cl_Auto("JH-213", "GM", false, null, null, null);
            Cl_Auto au3= new Cl_Auto("LKJ-254", "GM", false, null, null, null);
            Cl_Mantencion ma1= new Cl_Mantencion(25000, "llantas", null);
            Cl_Mantencion ma2= new Cl_Mantencion(25000, "focos", null);
            au1.getMantencion().insertar(ma1);
            au1.getMantencion().insertar(ma2);
            wst.insertarVehiculo(au1);
            wst.insertarVehiculo(au2);
            wst.insertarVehiculo(au3);*/
            wst.generarAtenciones();
            wst.visualizarVehiculos();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
