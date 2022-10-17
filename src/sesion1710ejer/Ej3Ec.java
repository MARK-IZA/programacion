package sesion1710ejer;

import java.util.Scanner;

public class Ej3Ec {
    public static void main(String[] args) {
        int hora = 0;
        //Solicitud de la hora
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que hora es?");
        hora = sc.nextInt();

        if (hora >= 6 && hora <= 12)
        {
            System.out.println("Buenos días");
        }
        else if (hora >= 13 && hora <= 20)
        {
            System.out.println("Buenas tardes");
        }
        else if (hora>=21 || hora<=5)
        {
            System.out.println("Buenas noches");
        }
        else {
            System.out.println("Valor incorrecto");
        }
    }
}
