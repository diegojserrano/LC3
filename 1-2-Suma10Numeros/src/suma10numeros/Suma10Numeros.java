package suma10numeros;

import java.util.Scanner;

public class Suma10Numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, suma = 0;
        float promedio;

        System.out.println("Ingrese 10 números");
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            suma += n;
        }

        promedio = (float) suma / 10;

        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("Y el promedio: " + promedio);
    }

}
