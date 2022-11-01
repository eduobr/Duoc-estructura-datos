/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

public class PizzeriaRARA {
    private Cola colaPizza;

    public PizzeriaRARA(int tamaño) {
        colaPizza=new Cola(tamaño);
    }
    
    public void insertarPedido(Pedido oed){
        try {
            colaPizza.insertar(oed);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void mostrarPedido(){
        try {
            colaPizza.mostrarCola();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
