package c.EjercicioCirculo;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        int opc;
     Scanner in = new Scanner(System.in);

     System.out.println("Selecciona una opción: \n1.- Calcular el perímetro\n2.-Calcular el área\n3.- Calcular el volumen");

     opc = in.nextInt();

     switch(opc) {
         case 1:

             break;
         default:
             System.out.println("Opcion incorrecta");

     }
    }
}
