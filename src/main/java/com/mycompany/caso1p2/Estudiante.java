
package com.mycompany.caso1p2;

public class Estudiante extends Usuario {

    public Estudiante(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void verCursosDisponibles() {
        System.out.println("Estudiante " + id + ": " + nombre + " tienes los siguientes cursos disponibles: POO, Matematica, Algoritmos");
    }
}
