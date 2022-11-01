
package Contenido;

public class Colegio {
    private Alumno[] alumno;
    private int puntero = 0;

    public Colegio() {
        alumno=new Alumno[5];
    }
    //agregar alumno,listar,buscar por rut y mostrarlo
    
    public void agregarAlumno(Alumno alu){
        if (punteroLleno()) {
            System.out.println("Arreglo LLeno");
            return;
        }
        alumno[puntero]=alu;
        System.out.println("Agregado");
        puntero++;
    }
    
    public boolean punteroLleno(){
        if (puntero==5) {
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarAlumno(){
        for (int i = 0; i < puntero; i++) {
            alumno[i].Imprimir();
        }
    }
    
    public void buscarAlumno(String rut){
        for (int i = 0; i < puntero; i++) {
            if (alumno[i].getRut().equals(rut)) {
                System.out.println("Existe");
                alumno[i].Imprimir();
                return;
            }
        }
        System.out.println("No esta");
    }
    
}
