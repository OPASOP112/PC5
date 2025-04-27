
package com.mycompany.caso1p4;

public class Estudiante extends Usuario {

    public Estudiante(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol_Estudiante: " + nombre + ", ID: " + id + ", Correo:" + correo);
    }
}
