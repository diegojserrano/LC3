package entidades;

public class Plan {

    private String nombre;
    private float deuda;
    private int cuotas;
    private Pago[] pagos;

    public Plan(String nombre, float deuda, int cuotas, int cantidadPagos) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        this.pagos = new Pago[cantidadPagos];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public void agregarPago(Pago p) {
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i] = p;
                break;
            }
        }
    }

    public boolean estaPagadoTotalmente() {
        int c = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                c++;
            }
        }        
        
        if (cuotas == c) {
            return true;
        } else {
            return false;
        }
    }

    public String listadoPagos() {
        StringBuffer salida = new StringBuffer();

        salida.append("[");
        for (Pago pago : pagos) {
            if (pago != null) {
                salida.append(pago.toString() + "\n");
            }
        }
        salida.append("]");
        return salida.toString();

    }

    public float sumaInteresesCobrados() {
        float acumIntereses = 0f;

        for (Pago pago : pagos) {
            if (pago != null) {
                acumIntereses += pago.getInteresesAdicionales();
            }
        }

        return acumIntereses;
    }

}
