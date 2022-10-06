package Sesion0510;

import java.util.Scanner;

public class EsPar {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("Es impar");
        }
    }
}