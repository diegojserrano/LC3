/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Persona[] personas = new Persona[3];
        
        System.out.println("Ingrese los datos de 3 personas:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println((i + 1) + ") Nombre: ");
            String nombre = sc.next();
            System.out.println("Apellido: ");
            String apellido = sc.next();
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            
            Persona p = new Persona();
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setEdad(edad);
            
            personas[i] = p;
        }
        
        int total = 0;
        int mayor = -1;
        for (int i = 0; i < personas.length; i++) {
            total += personas[i].getEdad();
            
            //BUSCO EL DE MAYOR EDAD
            if(mayor < personas[i].getEdad())
                mayor = i;
        }
        
        float promedio = total / personas.length;
        System.out.println("El promedio de edad es de: " + promedio);
        System.out.println("El mayor de todos es: " + personas[mayor].getNombre() + " " + personas[mayor].getApellido());
    }   
}
