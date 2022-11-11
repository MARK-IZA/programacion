package Sesion2112022;

import java.util.Scanner;

public class FactorialRecursivo {
    public static long factorialRecusivo(long numero){
        if (numero<=1){
            return 1;

        }
        return numero*factorialRecusivo(numero-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduca un numero del cual quiere calcular su factorial");
        long numero = 0;
        numero = sc.nextLong();

        System.out.println("El factorial de 4 "+factorialRecusivo(4));
    }
}
