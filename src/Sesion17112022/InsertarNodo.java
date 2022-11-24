package Sesion17112022;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class InsertarNodo {
    public static void main(String[] args) {
        int [] array1 = {1,2};
        int [] array1simulado= new int[3];
        System.out.println("el array es "+Arrays.toString(array1));
        System.arraycopy(array1,0, array1simulado, 0,array1.length);
        System.out.println("el array es "+Arrays.toString(array1simulado));
        System.out.println("¿Quieres insertar un nuevo elemento ?");
        Scanner sc = new Scanner(System.in);
        char opcion = sc.next().toLowerCase().charAt(0);

        if (opcion=='s'){
            System.out.println("¿Dime un número? ");
            int valornuevo = sc.nextInt();
            array1simulado[array1simulado.length-1]=valornuevo;
            System.out.println("el array es "+Arrays.toString(array1simulado));
        }
        else {
            System.out.println("Pues nada");
        }

    }
}
