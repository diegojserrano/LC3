package curso;

public class Curso {

    private String nombre;
    private Alumno[] alumnos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.alumnos = new Alumno[cantidad];
    }

    public void agregarAlumno(Alumno nuevo) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = nuevo;
                return;
            }
        }
    }

    public float promedioGeneral() {
        float suma = 0f;
        int c = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                c++;
                suma += alumnos[i].getPromedio();
            }
        }
        return suma / c;
    }

    public int cantidadMayor8() {
        int c = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getPromedio() > 8) {
                c++;
            }
        }
        return c;
    }
    
    public String listadoOpcionStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alumnos.length; i++){
            if (alumnos[i] != null) {
                sb.append(alumnos[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    public String listadoOpcionStringBuilderForEach() {
        StringBuilder sb = new StringBuilder();
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                sb.append(alumno.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    public String listadoOpcionString()
    {
        String listado = "";
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i] != null)
            {
                listado += alumnos[i].toString() + "\n";
            }
        }
        return listado;
    }
    
    public String listadoOpcionStringForEach()
    {
        String listado = "";
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                listado += alumno.toString() + "\n";
            }
        }
        return listado;
    }
}
