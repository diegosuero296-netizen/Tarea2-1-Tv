package com.mycompany.tarea2_1;

// Diego Suero - 2025-2470
public class Tv {

    // Atributos
    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;

    // Métodos
    public void encender() {
        encendido = true;
        System.out.println("La TV se está encendiendo...");
    }

    public void apagar() {
        encendido = false;
        System.out.println("La TV se está apagando...");
    }

    public void subirVolumen() {
        volumen++;
        System.out.println("Subiendo el volumen...");
    }

    public void bajarVolumen() {
        volumen--;
        System.out.println("Bajando el volumen...");
    }
}
