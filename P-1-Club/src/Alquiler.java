public class Alquiler {
    private int dia;
    private int mes;
    private float importe;
    private int asistentes;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public Alquiler(int dia, int mes, float importe, int asistentes) {
        this.dia = dia;
        this.mes = mes;
        this.importe = importe;
        this.asistentes = asistentes;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "dia=" + dia + ", mes=" + mes + ", importe=" + importe + ", asistentes=" + asistentes + '}';
    }
}