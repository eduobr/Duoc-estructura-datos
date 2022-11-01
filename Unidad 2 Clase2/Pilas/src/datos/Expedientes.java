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
public class Expedientes {
    private int numExpediente;
    private String fecha;
    private int cantDocumentos;

    public Expedientes(int numExpediente, String fecha, int cantDocumentos) {
        this.numExpediente = numExpediente;
        this.fecha = fecha;
        this.cantDocumentos = cantDocumentos;
    }

    public int getCantDocumentos() {
        return cantDocumentos;
    }

    public void setCantDocumentos(int cantDocumentos) {
        this.cantDocumentos = cantDocumentos;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Expedientes{" + "numExpediente=" + numExpediente + ", fecha=" + fecha + ", cantDocumentos=" + cantDocumentos + '}';
    }
}
