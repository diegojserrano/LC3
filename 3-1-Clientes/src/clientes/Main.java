package clientes;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan Perez", "123456", 1);
        ClientePreferencial c2 = new ClientePreferencial("Ana Perez", "87654", 2, "Av. Aguaverde 345", 0, 1000);
        
        System.out.println(c1);
        System.out.println(c2);
    }
}
