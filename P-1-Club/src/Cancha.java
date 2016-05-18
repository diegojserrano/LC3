public class Cancha {
    private int numero;
    private String descripcion;
    private int deporte;
    private Alquiler[] alquileres;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDeporte() {
        return deporte;
    }

    public void setDeporte(int deporte) {
        this.deporte = deporte;
    }

    public Cancha(int numero, String descripcion, int deporte, int cantidadAlquileres) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.deporte = deporte;
        this.alquileres = new Alquiler[cantidadAlquileres];
    }

    public void agregarAlquiler(Alquiler nuevo) {
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i] == null) {
                alquileres[i] = nuevo;
                break;
            }
        }
    }

    public float sumaTotalAlquileres() {
        float suma = 0;
        for (Alquiler a : alquileres) {
            if (a != null) {
                suma += a.getImporte();
            }
        }
        return suma;
    }

    public boolean fueAlquilada(int dia, int mes) {
        for (Alquiler a : alquileres) {
            if (a != null && a.getDia() == dia && a.getMes() == mes) {
                return true;
            }
        }
        return false;
    }

    public Alquiler[] alquileresMasAsistentes(int minimo) {
        int c = 0;
        for (Alquiler a : alquileres) {
            if (a != null && a.getAsistentes() > minimo) {
                c++;
            }
        }
        Alquiler[] salida = new Alquiler[c];
        c = 0;
        for (Alquiler a : alquileres) {
            if (a != null && a.getAsistentes() > minimo) {
                salida[c] = a;
                c++;
            }
        }
        return salida;
    }

    public int[] cantidadPorTrimestre() {
        int[] c = {0, 0, 0, 0};
        for (Alquiler a : alquileres) {
            if (a != null) {
                int mes = a.getMes();
                if (mes <= 3) {
                    c[0]++;
                } else if (mes <= 6) {
                    c[1]++;
                } else if (mes <= 9) {
                    c[2]++;
                } else {
                    c[3]++;
                }
            }
        }
        return c;
    }
}