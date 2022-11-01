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
public class Oficina {

    Lista listaFuncionarios;

    public Oficina() {
        listaFuncionarios = new Lista();
    }

    public void agregarFuncionario(Funcionario fun) {
        listaFuncionarios.insertarCabezaLista(fun);
    }

    public void listarFuncionarios() {
        listaFuncionarios.visualizar();
    }

    public void asignarExpediente(Expedientes exp) {
        boolean ciclo = false;
        Nodo lfn = listaFuncionarios.getPrimero();
        Nodo lfnAux = listaFuncionarios.getPrimero();
        int cantExp=999999999;
        int cantExpAyud=0;
        Funcionario ft=null;
        while (lfn != null) {
            Funcionario fnTemp = (Funcionario) lfn.getDato();
            if (fnTemp.getCargo().equals("Ayudante") && fnTemp.cantExpedientes()<cantExp) {
                cantExpAyud=fnTemp.cantExpedientes();
                ft=fnTemp;
            }
            if (fnTemp.getCargo().equals("Abogado") && fnTemp.totalDocumentos()<130) {
                System.out.println("Nombre:" + fnTemp.getNombre() + ", Cargo:" + fnTemp.getCargo()+",Cantidad de documentos:"+fnTemp.totalDocumentos());
                fnTemp.insertarExpediente(exp);
                return;
            }
            lfn = lfn.getEnlace();
        }
        
        ft.insertarExpediente(exp);
        
        while (lfnAux!=null) {
            Funcionario fnAux = (Funcionario)lfnAux.getDato();
            if (fnAux.getCargo().equals("Ayudante") && fnAux.cantExpedientes()==cantExpAyud) {
                fnAux.insertarExpediente(exp);
            }
            lfnAux = lfnAux.getEnlace();
        }
        
    }

}
