package sesion1710ejer;

import java.util.Scanner;

public class Ej7Buc {
    public static void main(String[] args) {
        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;

        do {
            System.out.println("Introduzca la clave de la caja fuerte");
            numeroIntroducido = Integer.parseInt(System.console().readLine());

            if (numeroIntroducido == 24006) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }

            intentos--;

        } while ((intentos > 0) && (!acertado));

        if (acertado) {
            System.out.println("Ha abierto la caja fuerte.");
        } else {
            System.out.println("Has agotado las 4 oportunidades, ahora llamare a la policía");
        }
    }

}
