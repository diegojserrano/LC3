package clientes;

public class Cliente {
    protected String nombre;
    protected String telefono;
    protected int numero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente() {
    }

    public Cliente(String nombre, String telefono, int cuit) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.numero = cuit;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", cuit=" + numero + '}';
    }
    
}
