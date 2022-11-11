package Refuerzo8112022;

import java.util.Scanner;

public class Eje5TM2 {
    public static void main(String[] args) {
        char vocal;
        System.out.println("Introduce un caracter");
        Scanner sc = new Scanner (System.in);
        //sc reoje el string y el Char recoje el primer caracter
        vocal = sc.next().charAt(0);
        switch (vocal)
        {
            case 'a': System.out.println("Es la primera vocal del abecedario"); break;
            case 'e': System.out.println("Es la segunda vocal del abecedario"); break;
            case 'i': System.out.println("Es la tercera vocal del abecedario"); break;
            case 'o': System.out.println("Es la cuarta vocal del abecedario"); break;
            case 'u': System.out.println("Es la quinta vocal del abecedario"); break;
            //sirve para caundo el usuario no meta una vocal de las que estan ahi
            default:
                System.out.println("Payaso me has puesto una vocal"); break;
        }

    }
}
