package curso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreCurso;
        int cantidadAlumnos;
                
        System.out.println("Ingrese el nombre del curso");
        nombreCurso = sc.next();
        System.out.println("Ingrese la cantidad de alumnos");
        cantidadAlumnos = sc.nextInt();

        Curso c = new Curso(nombreCurso);

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = sc.next();
            System.out.println("Ingrese el legajo");
            int legajo = sc.nextInt();
            System.out.println("Ingrese la cantidad de notas");
            int notas = sc.nextInt();

            Alumno nuevo = new Alumno(nombre, legajo);

            System.out.println("Ingrese " + notas + " notas");
            for (int j = 0; j < notas; j++) {
                System.out.println(j + ")");
                int nota = sc.nextInt();
                nuevo.agregarNota(nota);    
            }
            
            c.agregarAlumno(nuevo);
        }

        System.out.println("Listado de alumnos ingresados");
        System.out.println(c.listadoOpcionStringBuilderForEach());
        System.out.println("El promedio general del curso es: " + c.promedioGeneral());
        System.out.println("Hay " + c.cantidadMayor8() + " alumnos con promedio > 8");
    }
}