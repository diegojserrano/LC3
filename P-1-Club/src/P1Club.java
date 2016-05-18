import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class P1Club {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de canchas");
        int cantidadCanchas = sc.nextInt();
        Cancha[] canchas = new Cancha[cantidadCanchas];

        for (int i = 0; i < cantidadCanchas; i++) {
            System.out.println("Ingrese número de la cancha");
            int numero = sc.nextInt();

            System.out.println("Ingrese descripcion");
            String descripcion = sc.next();

            System.out.println("Ingrese deporte (1: futbol, 2: tenis, 3: basquet");
            int deporte = sc.nextInt();

            System.out.println("Ingrese cantidad de alquileres");
            int cantidadAlquileres = sc.nextInt();

            Cancha c = new Cancha(numero, descripcion, deporte, cantidadAlquileres);

            canchas[i] = c;

            for (int j = 0; j < cantidadAlquileres; j++) {
                System.out.println("Ingrese dia");
                int dia = sc.nextInt();

                System.out.println("Ingrese mes");
                int mes = sc.nextInt();

                System.out.println("Ingrese importe");
                float importe = sc.nextFloat();

                System.out.println("Ingrese cantidad de asistentes");
                int asistentes = sc.nextInt();

                Alquiler a = new Alquiler(dia, mes, importe, asistentes);

                c.agregarAlquiler(a);
            }
        }

        System.out.println("Ingrese dia y mes para buscar");
        int diaBuscado = sc.nextInt();
        int mesBuscado = sc.nextInt();

        System.out.println("Ingrese asistentes mínimos para listar");
        int minimo = sc.nextInt();

        for (Cancha c : canchas) {
            System.out.println("\n\nReportes cancha número " + c.getNumero());
            System.out.println("Facturación: $ " + c.sumaTotalAlquileres());
            if (c.fueAlquilada(diaBuscado, mesBuscado)) {
                System.out.println("La cancha fue alquilada en el día buscado");
            } else {
                System.out.println("La cancha NO fue alquilada en el día buscado");
            }
            Alquiler[] listado = c.alquileresMasAsistentes(minimo);
            System.out.println("Alquileres con asistentes superiores al minimo");
            for (Alquiler a : listado) {
                System.out.println(a);
            }
            int[] cantidadTrim = c.cantidadPorTrimestre();
            System.out.println("Cantidad de alquileres por trimestre");
            for (int i = 0; i < 4; i++) {
                System.out.println(cantidadTrim[i]);
            }
        }
    }
}