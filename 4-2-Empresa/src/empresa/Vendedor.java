package empresa;

public class Vendedor extends Empleado {

    private float totalVentas;

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Vendedor(int legajo, String nombre, float sueldoBasico, float totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return " Vendedor {" + super.toString() + " totalVentas =" + totalVentas + '}';
    }

    @Override
    public float calcularSueldo() {
        return (getSueldoBasico() + 0.01f * totalVentas);
    }
}
