package Datos;

public class Libro {

    private String nombreLibro;
    private int annoPuplicacion;
    private Autor autor;

    public Libro() {
    }

    public Libro(String nombreLibro, int annoPuplicacion, Autor autor) {
        this.nombreLibro = nombreLibro;
        this.annoPuplicacion = annoPuplicacion;
        this.autor = autor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getAnnoPuplicacion() {
        return annoPuplicacion;
    }

    public void setAnnoPuplicacion(int annoPuplicacion) {
        this.annoPuplicacion = annoPuplicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreLibro=" + nombreLibro + ", annoPuplicacion=" + annoPuplicacion + ", autor=" + autor + '}';
    }
    
    
}
