package empleados;

public class Obrero extends Empleado {
    private int diasTrabajados;

    public Obrero(int legajo, String nombre, float sueldoBasico, int diasTrabajados) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public String toString() {
        return "Obrero{" + "diasTrabajados=" + diasTrabajados + '}';
    }

    @Override
    public float calcularSueldo() {
        return sueldoBasico / 22 * diasTrabajados;
    }
}