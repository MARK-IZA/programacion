package Sesion2112022;
import java.util.Scanner;

public class UsoPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("introduzca el nombre de la persona");
        Scanner sc = new Scanner(System.in);
        persona.nombre = sc.next();
        System.out.println("introduzca la edad de la persona");
        persona.edad = sc.nextInt();
        System.out.println(persona.nombre + "nacio en el año " + persona.obtenerAnyo(persona.edad));
    }
}
