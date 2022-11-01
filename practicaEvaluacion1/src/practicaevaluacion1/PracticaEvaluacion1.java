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
public class PracticaEvaluacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Capacitacion cap = new Capacitacion();
        Curso c1=new Curso("Contabilidad Basica", 5, 350000, 30, new String[]{"Iquique","Arica"});
        Curso c2=new Curso("Office 1", 3, 375000, 30, new String[]{"Temuco","Chillan","Pto montt"});
        Curso c3=new Curso("Atencion de Clientes 1", 3, 255000, 20, new String[]{"La Serena","Valparaiso","Viña del mar"});
        Curso c4=new Curso("Contabiliadad Basica 2", 5, 258000, 15, new String[]{"Valparaiso","Viña del mar"});
        Curso c5=new Curso("Office 2", 8, 155000, 15, new String[]{"Rancagua","Chillan","La Serena"});
        Curso c6=new Curso("Capacitacion Laboral 1", 5, 185700, 15, new String[]{"Santiago"});
        Curso c7=new Curso("Contabilidad Basica 3", 7, 258000, 30, new String[]{"Santiago","La Serena"});
        Curso c8=new Curso("Atencion al Cliente 1", 5, 190000, 15, new String[]{"Santiago"});
        cap.agregarCurso(c1);
        cap.agregarCurso(c2);
        cap.agregarCurso(c3);
        cap.agregarCurso(c4);
        cap.agregarCurso(c5);
        cap.agregarCurso(c6);
        cap.agregarCurso(c7);
        cap.agregarCurso(c8);
        System.out.println("precio promedio curso: "+cap.promedioCurso());
        cap.menorPromedio();
        cap.cursoMas3Semanas();
        cap.ganancia();
        cap.cursosLaSerena();
        
    }
    
}
