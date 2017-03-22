
import java.util.Scanner;

public class HorasExtras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horas, sueldoHora;
        float sueldoTotal;

        System.out.print("Ingrese la cantidad de horas trabajadas ");
        horas = sc.nextInt();

        System.out.print("Ingrese el sueldo por hora ");
        sueldoHora = sc.nextInt();

        if (horas <= 180) {
            sueldoTotal = horas * sueldoHora;
        } else {
            int horasExtras = horas - 180;
            sueldoTotal = horas * sueldoHora + horasExtras * sueldoHora * 0.5f;
        }
        
        System.out.println("El sueldo a cobrar es $ " + sueldoTotal);
    }

}
