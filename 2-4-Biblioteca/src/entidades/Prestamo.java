package entidades;

public class Prestamo {

    private String solicitante;
    private int dias;
    private boolean devuelto;

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public Prestamo() {
    }

    public Prestamo(String solicitante, int dias, boolean devuelto) {
        this.solicitante = solicitante;
        this.dias = dias;
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "solicitante=" + solicitante + ", dias=" + dias + ", devuelto=" + devuelto + '}';
    }

}
