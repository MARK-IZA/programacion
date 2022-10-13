package Sesion1310;

import java.util.Scanner;

public class ForInDecrementarIDecrementar {
    public static void main(String[] args) {
        System.out.println("Vamos a mostrar por pantalla los numeros de 1 a 100");
        //solicitar al usuario
        int numero=0;
        System.out.println("Por favor introduzca un número");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        //bucle incremetal
        for (int i = 1; i <=numero; i++) {
            System.out.println(i);
        }
        System.out.println("Vamos a mostrar por pantalla los números de 100 a 1");
        //bucle decremental

        for (int j =numero; j > 0; j--) {
            System.out.println(j);
        }
    }
}
