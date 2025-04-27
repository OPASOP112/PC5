package com.mycompany.caso1p4;

public class Administrador extends Usuario {

    public Administrador(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol_Administrador: " + nombre + ", ID: " + id + ", Correo: " + correo);
    }
}
