package personas;

public class Persona {
    private String nombre;
    private String apellido;
    private int nacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, int nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + '}';
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public int edad() {
        return 2016-nacimiento;
    }
    
    
}
