/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author Duoc
 */
public class Test {

    
    public static void main(String[] args) {
       Funcionario f1= new Funcionario("Pedro","12345678-9","Abogado");
       Funcionario f2= new Funcionario("Camila","23456789-1","Ayudante");
       Funcionario f3= new Funcionario("Juan","3456789-2","Abogado");
       Expedientes ex1=new Expedientes(1, "11/07/17", 5);
       Expedientes ex2=new Expedientes(2, "11/07/17", 120);
       Expedientes ex3=new Expedientes(3, "11/07/17", 10);
       //f1.insertarExpediente(ex1);
       //f1.insertarExpediente(ex2);
       //f3.insertarExpediente(ex3);
       Oficina of = new Oficina();
       //of.listarFuncionarios();
       of.agregarFuncionario(f1);
       of.agregarFuncionario(f2);
       of.agregarFuncionario(f3);
       
       of.asignarExpediente(ex1);
       of.asignarExpediente(ex2);
       of.asignarExpediente(ex3);
    }
    
}
