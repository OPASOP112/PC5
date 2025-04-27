
package com.mycompany.caso1p2;

public class Administrador extends Usuario {

    public Administrador(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void agregarCurso(String curso) {
        System.out.println("Administrador " + id + ": " + nombre + " agrego el curso " + curso + " para el nuevo ciclo");
    }

}
