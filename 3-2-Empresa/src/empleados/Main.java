package empleados;

public class Main {

    public static void main(String[] args) {
        Obrero e1 = new Obrero(100, "Cesar Aguirre", 10000, 20);
        Administrativo e2 = new Administrativo(101, "Susana Vega", 10000, true);
        Vendedor e3 = new Vendedor(102, "Mónica Torres", 10000, 150000);
        
        Empresa emp = new Empresa(3);
        emp.agregarEmpleado(e1);
        emp.agregarEmpleado(e2);
        emp.agregarEmpleado(e3);
        
        System.out.println(emp.liquidacion());
        System.out.println(emp.totalSueldos());
        float []totales = emp.totalSueldosPorTipo();
        System.out.println("Total Obreros: " + totales[0]);
        System.out.println("Total Administrativos: " + totales[1]);
        System.out.println("Total Vendedores: " + totales[2]);        
    }
}