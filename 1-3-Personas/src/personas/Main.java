package personas;

public class Main {

    public static void main(String[] args) {
        Persona per1, per2;
        
        per1 = new Persona("Juan","Perez",1989);
        per2 = new Persona("Juana","Pereza",1982);
        
        System.out.println(per1.getNombre());
        System.out.println(per1.getApellido());
        System.out.println(per1.getNacimiento());
        System.out.println(per1.nombreCompleto());
        System.out.println(per1.edad());
        
        System.out.println(per2.getNombre());
        System.out.println(per2.getApellido());
        System.out.println(per2.getNacimiento());
        System.out.println(per2.nombreCompleto());
        System.out.println(per2.edad());
        
    }
    
}
