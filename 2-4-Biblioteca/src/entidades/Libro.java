package entidades;

public class Libro {

    private String titulo;
    private float precio;
    private int estado;
    private Prestamo[] prestamos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Libro(String titulo, float precio, int estado, int cantidadPrestamos) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        prestamos = new Prestamo[cantidadPrestamos];
    }

    public void agregarPrestamo(Prestamo p) {

        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = p;
                break;
            }
        }
    }

    public String listadoSolicitantes() {
        StringBuffer salida = new StringBuffer();

        salida.append("[");
        for (Prestamo p : prestamos) {
            salida.append(p.getSolicitante() + "\n");
        }
        salida.append("]");

        return salida.toString();
    }

    public int cantidadPrestamos() {
        int c = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null) {
                c++;
            }
        }

        return c;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", estado=" + estado + '}';
    }

}
