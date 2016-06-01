package empresa;

public class Obrero extends Empleado {

    private int diasTrabajados;

    public Obrero(int legajo, String nombre, float sueldoBasico, int diasTrabajados) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public String toString() {
        return "Obrero{" + super.toString() + "diasTrabajados=" + diasTrabajados + '}';
    }

    @Override
    public float calcularSueldo() {
        return (getSueldoBasico() / 22) * diasTrabajados;
    }
}
