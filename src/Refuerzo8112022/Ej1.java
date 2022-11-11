package Refuerzo8112022;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        //declaracion de variables

        int numero1=0;
        int numero2=0;
        int resultado=0;

        //declaracion de constantes
        // es más fino que en el system println
        final String SALUDO="Hola";
        //creamos un objeto de tipo escaner que sirve para leer lo que pondrá el usuario del teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Por favor, introduzca el numero 1?");
        //el sc es para aspirar numeros por teclado y asi lo mete en la cajita numero 1
        numero1 = sc.nextInt();
        System.out.println("Por favor, introduzca el numero 2");
        numero2 = sc.nextInt();

        resultado = numero1+numero2;

        System.out.println("El resultado es" +resultado);


    }
}