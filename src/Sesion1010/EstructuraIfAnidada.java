package Sesion1010;

import java.util.Scanner;

public class EstructuraIfAnidada {
    public static void main(String[] args) {
        //aclaración de variables
        int nota = 0;
        //solicitud y lectura de la edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la edad, por favor:");
        nota = sc.nextInt();


        //determinar a que etapa estoy mediante el uso de if anidados

        if (nota >= 0 && nota <= 4.99) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota <= 5.99) {
            System.out.println("Suficiente");

        } else if (nota >= 6 && nota <= 6.99)
            System.out.println("Bien");
    }
}
