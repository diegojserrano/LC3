package mayores5;

import java.util.Scanner;

public class Mayores5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, cantidad = 0;

        System.out.println("Ingrese la cantidad de números");
        n = sc.nextInt();

        System.out.println("Ingrese " + n + " números");
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x > 5) {
                cantidad++;
            }
        }

        System.out.println("Se ingresaron " + cantidad + " números mayores a 5");
    }

}
