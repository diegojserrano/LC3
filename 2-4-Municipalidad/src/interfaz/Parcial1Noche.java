package interfaz;

import entidades.*;
import java.util.Scanner;

public class Parcial1Noche {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de planes");
        int cantidadPlanes = sc.nextInt();

        Municipalidad muni = new Municipalidad(cantidadPlanes);

        for (int i = 0; i < cantidadPlanes; i++) {
            System.out.println("Plan Nro. " + i);
            System.out.println("Ingrese nombre del contribuyente");
            String nombre = sc.next();
            System.out.println("Ingrese total de la deuda");
            float deuda = sc.nextFloat();
            System.out.println("Ingrese cantidad de cuotas");
            int cuotas = sc.nextInt();
            System.out.println("Ingrese cantidad de cuotas pagadas");
            int pagos = sc.nextInt();

            Plan p = new Plan(nombre, deuda, cuotas, pagos);

            for (int j = 0; j < pagos; j++) {
                System.out.println("Pago Nro. " + j);
                System.out.println("Ingrese el importe pagado");
                float importe = sc.nextFloat();
                System.out.println("Ingrese los dias de demora");
                int demora = sc.nextInt();

                Pago pa = new Pago(demora, importe);
                p.agregarPago(pa);
            }
            muni.agregarPlan(p);
        }

        System.out.println("Ingrese nombre del contribuyente a buscar: ");
        String nombreBuscado = sc.next();
        System.out.println("RESULTADOS");
        
        System.out.println("Cantidad de planes pagados en su totalidad: " + muni.cantidadPlanesPagados());
        System.out.println("Suma de todas las deudas: " + muni.sumatoriaDeuda());
        System.out.println("Pagos del plan de " + nombreBuscado + ": "+  muni.listadoPagosContribuyente(nombreBuscado));
        System.out.println("Promedio general de intereses: " + muni.promedioIntereses());
    }
}
