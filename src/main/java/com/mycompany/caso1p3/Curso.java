package com.mycompany.caso1p3;

public class Curso {

    public String codigo;
    public String nombrec;
    public int cuposDisponibles;

    public Curso(String codigo, String nombrec, int cuposDisponibles) {
        this.codigo = codigo;
        this.nombrec = nombrec;
        this.cuposDisponibles = cuposDisponibles;
    }

    public void matricularEstudiante(String estudianteNombre) throws SinCupoEx {
        if (cuposDisponibles <= 0) {
            throw new SinCupoEx(" Estudiante " + estudianteNombre + " no hay mas cupos para el curso: " + nombrec);
        }
        cuposDisponibles--;
        System.out.println("Estudiante " + estudianteNombre + " se matriculo correctamente en el curso " + nombrec);
        System.out.println("Cupos restantes: " + cuposDisponibles);
    }

    static class SinCupoEx extends Exception {

        public SinCupoEx(String msg) {
            super(msg);
        }
    }
   
 public void matricularEstudiante(String[] estudiantes) {
        for (String estudiante : estudiantes) {
            try {
                matricularEstudiante(estudiante);
            } catch (SinCupoEx ex) {
                System.out.println("No se pudo matricular a " + estudiante + ": " + ex.getMessage());
            }
        }
    }
 
  public static void main(String[] args) {
        Curso curso = new Curso("POO101", "POO", 4);

        String[] estudiantes = {"Maria", "Tyron", "Marco", "Pepe", "Ariana"};
        curso.matricularEstudiante(estudiantes);
    }
  
   /* public static void main(String[] args) {
        Curso curso = new Curso("", "POO", 4);

        String[] estudiantes = {"Maria", "Tyron", "Marco", "Pepe", "Ariana"};

        for (String estudiante : estudiantes) {
            try {
                curso.matricularEstudiante(estudiante);
            } catch (Curso.SinCupoEx ex) {
                System.out.println("ERROR EN LA MATRICULA," + ex.getMessage());
            }
        }
    } */
}
