
import java.util.Scanner;

public class TresArticulos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float precio1, precio2, precio3;
        int cantidad1, cantidad2, cantidad3;
        
        System.out.print("Ingrese precio del primer artículo ");
        precio1 = sc.nextFloat();
        System.out.print("Ingrese cantidad del primer artículo ");
        cantidad1 = sc.nextInt();
        
        System.out.print("Ingrese precio del segundo artículo ");
        precio2 = sc.nextFloat();
        System.out.print("Ingrese cantidad del segundo artículo ");
        cantidad2 = sc.nextInt();
        
        System.out.print("Ingrese precio del tercer artículo ");
        precio3 = sc.nextFloat();
        System.out.print("Ingrese cantidad del tercer artículo ");
        cantidad3 = sc.nextInt();
        
        float subtotal1 = precio1 * cantidad1;
        float subtotal2 = precio2 * cantidad2;
        float subtotal3 = precio3 * cantidad3;
        float total = subtotal1 + subtotal2 + subtotal3;
        
        System.out.println("El total de la factura es de $ " + total);
    }
    
}
