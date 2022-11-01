/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duoc
 */
public class Test {

    
    public static void main(String[] args) throws Exception {
        try {
            AlmacenDonPepe al = new AlmacenDonPepe(1);
            al.generarCola();
            //al.ventaTotal();
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
