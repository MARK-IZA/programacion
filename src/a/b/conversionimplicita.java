package a.b;

import java.util.Scanner;

public class conversionimplicita {

    public static void main(String[] args) {
        float nota;
        System.out.println("Introduzca un número");

        Scanner sc = new Scanner(System.in);
        nota = sc.nextFloat();
        System.out.println("el usuario ha introducido este valor"+nota);


    }
}
