package com.mycompany.caso1p;

import java.util.ArrayList;

public class Estudiante {

    public String codigo;
    public String nombre;
    public String carrera;
    public ArrayList<String> cursos;

    public Estudiante(String codigo, String nombre, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.cursos = new ArrayList<>();
    }

    public void matricularCurso(String curso) throws
            YaMatriculadoEx {
        if (cursos.contains(curso)) {
            throw new YaMatriculadoEx("Ya estas matriculado en : " + curso);
        }
        cursos.add(curso);
        System.out.println("Curso matriculado exitosamente: " + curso);
    }

    public void Ymatri() {
        System.out.println("Cursos actuales de " + nombre + "," + carrera + ": " + cursos);
    }

    static class YaMatriculadoEx extends Exception {

        public YaMatriculadoEx(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        Estudiante est = new Estudiante("N001", "Omar", "Sistemas");

        try {
            est.matricularCurso("POO");
            est.matricularCurso("Algoritmos");
            est.matricularCurso("POO");
        } catch (YaMatriculadoEx ex) {
            System.out.println("Error en matricula: " + ex.getMessage());
        }

        est.Ymatri();
    }
}
