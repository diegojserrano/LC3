package empresa;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion2;
        
        Empresa C = new Empresa();

        do {
            Empleado nuevo;
            System.out.println("Ingrese el legajo");
            int legajo = sc.nextInt();
            System.out.println("Ingrese el nombre");
            String nombre = sc.next();
            System.out.println("Ingrese el sueldo basico");
            float sueldo = sc.nextFloat();
            System.out.println("Ingrese el tipo de empleado" + "\n"
                    + "1. Obrero" + "\n" + "2. Administrativo" + "\n"
                    + "3. Vendedor");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese la cantidad de dias trabajados");
                    int cantTrabajados = sc.nextInt();
                    nuevo = new Obrero(legajo, nombre, sueldo, cantTrabajados);
                    break;

                }
                case 2: {
                    System.out.println("Tiene Presentismo");
                    boolean presentismo = sc.nextBoolean();
                    nuevo = new Administrativo(legajo, nombre, sueldo, presentismo);
                    break;

                }
                case 3: {
                    System.out.println("Ingrese la cantidad de ventas");
                    int cantVentas = sc.nextInt();
                    nuevo = new Vendedor(legajo, nombre, sueldo, cantVentas);
                    break;
                }
                default: {
                    return;
                }

            }
            C.agregarEmpleado(nuevo);
            System.out.println("¿Desea agregar un nuevo Empleado?" + "\n" + "1 para Salir");
            opcion2 = sc.nextInt();
        } while (opcion2 != 1);

        System.out.println("La cantidad de empleados " + C.getEmpleados().size());
        System.out.println("Los empleados son: " + C.descripcion());
        System.out.println("Ingrese el tipo de empleado para conocer el sueldo" + "\n"
                + "1. Obrero" + "\n" + "2. Administrativo" + "\n"
                + "3. Vendedor" + "\n"
                + "0. Total");
        int opcion = sc.nextInt();
        System.out.println("El sueldo total es: " + C.sueldoTotal(opcion));
    }
}
