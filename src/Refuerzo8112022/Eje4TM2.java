package Refuerzo8112022;

import java.util.Scanner;

public class Eje4TM2 {
    public static void main(String[] args) {
        int edad = 0;
        System.out.println("Introduzcame su edad");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();

        if (edad < 16) {
            System.out.println("Eres menor asi que tienes una denuncia");
        } else if (edad > 16 && edad < 24) {
            System.out.println("Sala privada");
        } else {
            System.out.println("Botella gratis");
        }
    }
}
