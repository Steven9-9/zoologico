package org.example;

public class Animal {

    public Animal pareja;
    String nombre;
    String genero;
    double peso;






    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }


}
