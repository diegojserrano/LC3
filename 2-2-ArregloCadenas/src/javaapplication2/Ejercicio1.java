package javaapplication2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de nombres: ");
        int cantidad = sc.nextInt();
        
         
        //Declaración y creación
        String[] arregloNombres = new String[cantidad];
        
        System.out.println("Ahora ingrese " + cantidad + " nombres:");
        for (int i = 0; i < cantidad; i++) {
            arregloNombres[i] = sc.next();
        }
        
        System.out.println("Nombres que comienzan con la letra A: ");
        boolean encontro = false;
        
        for (int i = 0; i < arregloNombres.length; i++) {
            if(arregloNombres[i].startsWith("A"))
            {
                System.out.println(arregloNombres[i]);
                encontro = true;
            }
        }
        
        if (!encontro) 
        {
            System.out.println("No se ingresó ningun nombre que inicie con A");
        }
    }    
}