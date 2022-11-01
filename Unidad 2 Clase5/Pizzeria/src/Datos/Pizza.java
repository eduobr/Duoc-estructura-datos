/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author Duoc
 */
public class Pizza {
    
    private String tipoPiza;
    private int valor;

    public Pizza() {
    }

    public Pizza(String tipoPiza, int valor) {
        this.tipoPiza = tipoPiza;
        this.valor = valor;
    }

    public String getTipoPiza() {
        return tipoPiza;
    }

    public void setTipoPiza(String tipoPiza) {
        this.tipoPiza = tipoPiza;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pizza{" + "tipoPiza=" + tipoPiza + ", valor=" + valor + '}';
    }
    
    
}
