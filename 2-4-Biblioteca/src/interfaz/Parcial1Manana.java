package interfaz;
import entidades.*;
import java.util.Scanner;

public class Parcial1Manana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de libros");
        int cantidadLibros= sc.nextInt();

        Biblioteca biblio = new Biblioteca(cantidadLibros);

        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("Libro Nro. " + i);
            System.out.println("Ingrese titulo del libro");
            String titulo = sc.next();
            System.out.println("Ingrese precio de reposición");
            float precio = sc.nextFloat();
            System.out.println("Ingrese estado (1: disponible, 2: prestado, 3: extraviado)");
            int estado = sc.nextInt();
            System.out.println("Ingrese cantidad de prestamos");
            int cantidadPrestamos = sc.nextInt();

            Libro l = new Libro(titulo, precio, estado, cantidadPrestamos);

            for (int j = 0; j < cantidadPrestamos; j++) {
                System.out.println("Prestamo Nro. " + j);
                System.out.println("Ingrese el nombre del solicitante");
                String nombre = sc.next();
                System.out.println("Ingrese los dias del prestamo");
                int dias = sc.nextInt();
                System.out.println("Ingrese 1 si fue devuelto y 0 si no");
                int devu = sc.nextInt();
                boolean devuelto = false;
                if (devu == 1) devuelto = true;
                
                Prestamo pr = new Prestamo(nombre, dias, devuelto);
                l.agregarPrestamo(pr);
            }
            biblio.agregarLibro(l);
        }

        System.out.println("Ingrese el título del libro a buscar: ");
        String tituloBuscado = sc.next();
        System.out.println("RESULTADOS");
        
        System.out.println("Cantidad de libros disponibles: " + biblio.cantidadLibros(1));
        System.out.println("Cantidad de libros prestados: " + biblio.cantidadLibros(2));
        System.out.println("Cantidad de libros extraviados: " + biblio.cantidadLibros(3));
        System.out.println("Suma de los precios de los extraviados: " + biblio.sumaPrecioExtraviados());
        System.out.println("Solicitantes del libro " + tituloBuscado + ": "+  biblio.listadoSolicitantes(tituloBuscado));
        System.out.println("Promedio general de prestamos: " + biblio.promedioPrestamos());
    }
}