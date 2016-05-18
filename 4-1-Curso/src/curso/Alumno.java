package curso;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int legajo;
    private ArrayList notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;        
        this.notas = new ArrayList();
    }
    
    public void agregarNota(int nota)
    {
        notas.add(nota);
    }
    
    public float getPromedio()
    {
        int total = 0;
        for (Object o : notas) {
            Integer n = (Integer)o;
            total += n;
        }
        return (float)total/notas.size();
    }

    @Override
    public String toString() {
        return "Alumno " + nombre + " - Legajo: " + legajo + " - Promedio: " + getPromedio();
    }
       
}