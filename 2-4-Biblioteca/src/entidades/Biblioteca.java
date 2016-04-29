package entidades;

public class Biblioteca {

    private Libro[] libros;

    public Biblioteca(int cantidadLibros) {
        libros = new Libro[cantidadLibros];
    }

    public void agregarLibro(Libro l) {

        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = l;
                break;
            }
        }
    }

    public int cantidadLibros(int estado) {
        int c = 0;

        for (Libro l : libros) {
            if (l != null && l.getEstado() == estado) {
                c++;
            }
        }
        return c;
    }

    public int[] cantidadLibrosPorEstado() {
        int c[] = {0, 0, 0};

        for (Libro l : libros) {
            if (l != null) {
                switch (l.getEstado()) {
                    case 0: c[0]++; break;
                    case 1: c[1]++; break;
                    case 2: c[2]++; break;
                }
            }
        }
        return c;
    }

    public float sumaPrecioExtraviados() {
        float acPrecio = 0;

        for (Libro l : libros) {
            if (l != null && l.getEstado() == 3) {
                acPrecio += l.getPrecio();
            }
        }
        return acPrecio;
    }

    public String listadoSolicitantes(String titulo) {
        String listado = "No se encuentra";

        for (Libro l : libros) {
            if (l != null && l.getTitulo().equalsIgnoreCase(titulo)) {
                listado = l.listadoSolicitantes();
                break;
            }
        }
        return listado;
    }

    public float promedioPrestamos() {
        int c = 0, ac = 0;

        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                c++;
                ac += libros[i].cantidadPrestamos();
            }
        }

        float promedio = 0;
        if (c != 0) {
            promedio = (float) ac / c;
        }

        return promedio;
    }
}