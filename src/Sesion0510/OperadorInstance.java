package Sesion0510;

public class OperadorInstance {
    public static void main(String[] args) {
    Integer i = 5;
    String nombre ="Mark";
    System.out.print("la variable i es instancia de clase envoltorio(Wrapper) Integer");
    System.out.println(i instanceof Integer);
    //Syste,.out.println(i.getClass());
    System.out.print("la variable nombre es instancia de clase String");
    System.out.println(nombre instanceof String);
    //nombre.getClass();
    }
}
