package arregloenteros;

import java.util.Scanner;

public class ArregloEnteros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[10];

        System.out.println("Ingrese 10 numeros");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }

        int suma = 0, c = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            if (numeros[i] > 5) {
                c++;
            }
        }

        float promedio = (float) suma / numeros.length;

        System.out.println("\nLa suma es: " + suma);
        System.out.println("El promedio: " + promedio);
        System.out.println("Hay " + c + " números mayores a 5");
    }

}
