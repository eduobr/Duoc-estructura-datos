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
public class Funcionario {
    private String nombre;
    private String rut;
    private String cargo;
    private pilaDinamica expediente;

    public Funcionario() {
        expediente = new pilaDinamica();
    }

    public Funcionario(String nombre, String rut, String cargo) {
        this.nombre = nombre;
        this.rut = rut;
        this.cargo = cargo;
        expediente = new pilaDinamica();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public pilaDinamica getExpediente() {
        return expediente;
    }

    public void setExpediente(pilaDinamica expediente) {
        this.expediente = expediente;
    }
    
    public void insertarExpediente(Expedientes exp){
        expediente.insertar(exp);
    }
    
    public String listarExpedientes(){
        return expediente.escribirTodos();
    }
    
    public int totalDocumentos(){
        Nodo doc = expediente.getCima();
        int sumDoc=0;
        while (doc!=null) {
            Expedientes ex = (Expedientes) doc.getDato();
            sumDoc += ex.getCantDocumentos();
            doc = doc.getEnlace();
        }
        return sumDoc;
    }
    
    public int cantExpedientes(){
        Nodo doc=expediente.getCima();
        int cont=0;
        while (doc!=null) {            
            Expedientes ex = (Expedientes)doc.getDato();
            cont++;
            doc = doc.getEnlace();
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nombre=" + nombre+", rut=" + rut + ", cargo=" + cargo + ", expediente=" + expediente + '}';
    }
    
}
