
package Datos;


public class TipoAnimal {
    
    public String clasificación;
    public String seccion;
    public Animal animales;

    public TipoAnimal() {
    }

    public TipoAnimal(String clasificación, String seccion, Animal animales) {
        this.clasificación = clasificación;
        this.seccion = seccion;
        this.animales = animales;
    }

    public String getClasificación() {
        return clasificación;
    }

    public void setClasificación(String clasificación) {
        this.clasificación = clasificación;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Animal getAnimales() {
        return animales;
    }

    public void setAnimales(Animal animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "TipoAnimal{" + "clasificaci\u00f3n=" + clasificación + ", seccion=" + seccion + ", animales=" + animales + '}';
    }
    
    
}
