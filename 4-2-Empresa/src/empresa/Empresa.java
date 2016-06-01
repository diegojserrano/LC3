package empresa;

import java.util.*;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {

        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado E) {

        empleados.add(E);
    }

    public float sueldoTotal(int opcion) {
        float sueldoTotal = 0;
        for (Empleado E : empleados) {
            switch (opcion) {
                case 1:
                    if (E instanceof Obrero) {
                        sueldoTotal += E.calcularSueldo();
                    }
                    break;
                case 2:
                    if (E instanceof Administrativo) {
                        sueldoTotal += E.calcularSueldo();
                    }
                    break;
                case 3:
                    if (E instanceof Vendedor) {
                        sueldoTotal += E.calcularSueldo();
                    }
                    break;
                default: {
                    sueldoTotal += E.calcularSueldo();
                }
                break;
            }

        }
        return sueldoTotal;
    }

    public String descripcion() {
        String desc = "";
        for (Empleado E : empleados) {
            desc += E.toString();
        }
        return desc;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}