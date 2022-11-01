/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaevaluacion1;

/**
 *
 * @author Edd
 */
public class Capacitacion {
    public Lista listaCursos;

    public Capacitacion() {
        this.listaCursos = new Lista();
    }

    public void agregarCurso(Curso curso){
        listaCursos.insertarCabezaLista(curso);
    }
    
    public void mostrarCapacitacion(){
        listaCursos.visualizar();
    }
    
    public int promedioCurso(){
        int acum=0;
        int cont=0;
        Nodo listaC = listaCursos.getPrimero();
        while (listaC!=null) {          
            Curso cTemp = (Curso)listaC.getDato();
            acum+=cTemp.getPrecio();
            cont++;
            listaC = listaC.getEnlace();
        }
        int promedio = acum/cont;
        return promedio;
    }
    
    public void menorPromedio(){
        Nodo listaC = listaCursos.getPrimero();
        int contC=0;
        int cont=0;
        while (listaC!=null) {            
            Curso cTemp = (Curso)listaC.getDato();
            contC++;
            if (cTemp.getPrecio()<promedioCurso()) {
                cont++;
            }
            listaC = listaC.getEnlace();
        }
        int porcentaje = (cont*100)/contC;
        System.out.println("Porcentaje de cursos menor al promedio: "+porcentaje+"%");
    }
    
    public void cursoMas3Semanas(){
        Lista nLista = new Lista();
        Nodo listaC = listaCursos.getPrimero();
        while (listaC!=null) {
            Curso cTemp = (Curso)listaC.getDato();
            if (cTemp.getDuracion()>3) {
                nLista.insertarCabezaLista(cTemp);
            }
            listaC = listaC.getEnlace();
        }
        nLista.visualizar();
    }
    
    public void ganancia(){
        Nodo listaC = listaCursos.getPrimero();
        int ganancia=0;
        while (listaC!=null) {
            Curso cTemp = (Curso)listaC.getDato();
            ganancia=cTemp.getPrecio()*cTemp.getCupos();
            System.out.println("Curso:"+cTemp.getNombre()+", Ganancia que se espera obtener: $"+ganancia);
            listaC = listaC.getEnlace();
        }
    }
    
    public void cursosLaSerena(){
        Nodo listaC = listaCursos.getPrimero();
        while (listaC!=null) {
            Curso cTemp=(Curso)listaC.getDato();
            if (cTemp.ciudades().contains("La Serena")) {
                System.out.println(cTemp);  
            }
            listaC = listaC.getEnlace();
        }
    }
}
