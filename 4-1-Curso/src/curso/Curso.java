package curso;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private ArrayList alumnos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList();
    }

    public void agregarAlumno(Alumno nuevo) {
        alumnos.add(nuevo);
    }

    public float promedioGeneral() {
        float suma = 0f;
        for (Object o : alumnos) {
            Alumno a = (Alumno) o;
            suma += a.getPromedio();
        }
        return suma / alumnos.size();
    }

    public int cantidadMayor8() {
        int c = 0;
        for (Object o : alumnos) {
            Alumno a = (Alumno) o;
            if (a.getPromedio() > 8) {
                c++;
            }
        }
        return c;
    }
    
    public String listadoOpcionStringBuilderForEach() {
        StringBuilder sb = new StringBuilder();
        for (Object o : alumnos) {
            sb.append(o.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}