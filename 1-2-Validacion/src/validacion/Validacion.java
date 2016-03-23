package validacion;

import java.util.Scanner;

public class Validacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        do {
            System.out.println("Ingrese un número positivo");
            a = sc.nextInt();
        } while (a <= 0);

        System.out.println("Muchas gracias");
    }

}
