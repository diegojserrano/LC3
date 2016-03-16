package clase1.ej5;

import java.util.Scanner;

public class Clase1Ej5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la primer persona: ");
        String nombreA = s.next();

        System.out.println("y ahora su altura: ");
        float alturaA = s.nextFloat();

        System.out.println("Ahora ingrese el nombre de la segunda persona: ");
        String nombreB = s.next();

        System.out.println("y ahora su altura: ");
        float alturaB = s.nextFloat();

        if (alturaA > alturaB) {
            System.out.println("La persona mas alta es " + nombreA);
            System.out.println("Gracias por usar el sistema de comparacion!");
        } 
        else
        {
            if (alturaA < alturaB)
                System.out.println("La persona mas alta es " + nombreB);
            else 
                System.out.println("Los dos miden lo mismo!");
            
        }
    }

}
