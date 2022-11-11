package Refuerzo8112022;

import java.util.Scanner;

public class Eje3TM2 {
    public static void main(String[] args) {
        int edad=0;
        System.out.println("Introduzcame su edad");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();

        if (edad>=18){
            System.out.println("Puedes pasar payaso");

        }
        else {
            System.out.println("No puedes pasar niño asqueroso");
        }
    }
}
