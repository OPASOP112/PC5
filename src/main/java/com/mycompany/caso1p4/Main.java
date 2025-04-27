package com.mycompany.caso1p4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Administrador("N000", "Luciana", "n000@admin.upn.pe"));
        usuarios.add(new Estudiante("N001", "Maria", "n001@upn.pe"));
        usuarios.add(new Estudiante("N002", "Juan", "n002@upn.pe"));

        for (Usuario u : usuarios) {
            u.mostrarRol();
        }
    }
}
