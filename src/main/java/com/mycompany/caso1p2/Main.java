package com.mycompany.caso1p2;

public class Main {

    public static void main(String[] args) {
        Administrador admin = new Administrador("N000", "Luciana", "n000@admin.upn.pe");
        Estudiante est = new Estudiante("N001", "Omar", "Sistemas");

        admin.agregarCurso("Poo");
        est.verCursosDisponibles();
    }

}
