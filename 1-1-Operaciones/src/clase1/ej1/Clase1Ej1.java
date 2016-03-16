package clase1.ej1;

import java.util.Scanner;

public class Clase1Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int a = sc.nextInt();
        System.out.println("Ingrese otro");
        int b = sc.nextInt();
        
        int suma, resta, producto;
        float cociente;
        
        suma = a + b;
        resta = a - b;
        producto = a * b;
        cociente = (float)a / b;
        
        System.out.println("La suma es: " + suma + "!!");
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(cociente);
        
    }
    
}
