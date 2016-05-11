package empleados;

public class Empresa {

    private Empleado[] plantel;

    public Empresa(int cantidadEmpleados) {
        plantel = new Empleado[cantidadEmpleados];
    }

    public void agregarEmpleado(Empleado nuevo) {
        for (int i = 0; i < plantel.length; i++) {
            if (plantel[i] == null) {
                plantel[i] = nuevo;
                break;
            }
        }
    }

    public float totalSueldos() {
        float acumSueldos = 0;
        for (Empleado e : plantel) {
            if (e != null) {
                acumSueldos += e.calcularSueldo();
            }
        }
        return acumSueldos;
    }

    public float[] totalSueldosPorTipo() {
        float[] acumSueldos = {0, 0, 0};
        for (Empleado e : plantel) {
            if (e != null) {
                int tipo = 0;
                if (e instanceof Obrero) {
                    tipo = 0;
                } else if (e instanceof Administrativo) {
                    tipo = 1;
                } else {
                    tipo = 2;
                }
                acumSueldos[tipo] += e.calcularSueldo();
            }
        }
        return acumSueldos;
    }

    public String liquidacion() {
        StringBuilder listado = new StringBuilder();
        for (Empleado e : plantel) {
            if (e != null) {
                listado.append(e.toString());
                listado.append(e.calcularSueldo() +"\n");
            }
        }
        return listado.toString();
    }
}
