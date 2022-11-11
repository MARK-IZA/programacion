package sesion1710ejer;

import java.util.Scanner;

public class Ej8Buc {
    public static void main(String[] args) {
        int numero =0;
        int tabla=0;
        System.out.print("Introduzca un número y te enseñaré su tabala de multiplicar ");
        Scanner sc = new Scanner(System.in);
        numero=sc.nextInt();

        for (int i = 0; i <=10; i++) {
            System.out.println(i*numero);

        }
    }
}
