package Datos;

public class Animal {

    private String especie;
    private char sexo;
    private int numJaula;
    private int edad;

    public Animal() {
    }

    public Animal(String especie, char sexo, int numJaula, int edad) {
        this.especie = especie;
        this.sexo = sexo;
        this.numJaula = numJaula;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getNumJaula() {
        return numJaula;
    }

    public void setNumJaula(int numJaula) {
        this.numJaula = numJaula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + ", sexo=" + sexo + ", numJaula=" + numJaula + ", edad=" + edad + '}';
    }

}
