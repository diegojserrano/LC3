package curso;

public class Alumno {
    private String nombre;
    private int legajo;
    private int[] notas;

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

    public Alumno(String nombre, int legajo, int cantidadNotas) {
        this.nombre = nombre;
        this.legajo = legajo;
        
        this.notas = new int[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            this.notas[i] = -1;
        }
    }
    
    public void agregarNota(int nota)
    {
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] == -1)
                notas[i] = nota;
        }
    }
    
    public float getPromedio()
    {
        int total = 0, cantidad = 0;
        for (int i = 0; i < notas.length; i++) 
        {
            if(notas[i] > -1)
            {
                total += notas[i];
                cantidad++;
            }
        }
        return (float)total/cantidad;
    }

    @Override
    public String toString() {
        return "Alumno " + nombre + " - Legajo: " + legajo + " - Promedio: " + getPromedio();
    }
       
}
