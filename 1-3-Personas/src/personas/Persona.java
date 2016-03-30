package personas;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    private int peso;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int altura, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;                
    }

    public float imc() {
        return peso / (altura * altura);
    }
    
    @Override
    public String toString() {
        return "Persona{" + "apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
}
