package empleados;

public class Administrativo extends Empleado {
    private boolean presentismo;

    public Administrativo(int legajo, String nombre, float sueldoBasico, boolean presentismo) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }

    @Override
    public String toString() {
        return "Administrativo{" + super.toString() + "presentismo=" + presentismo + '}';
    }
   
    @Override
    public float calcularSueldo() {
        float sueldo = sueldoBasico;
        if (presentismo)
            sueldo = sueldo * 1.13f;
        return sueldo;
    }
}
