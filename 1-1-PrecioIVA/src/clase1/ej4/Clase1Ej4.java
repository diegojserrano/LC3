package clase1.ej4;

import java.util.Scanner;

public class Clase1Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el precio");
        float precio = sc.nextFloat();
        float iva, total;
        
        iva = precio * 0.21f;
        total = precio + iva;
                
        System.out.println("El precio incluyendo IVA es de: " + total);
    }
    
}
