package Refuerzo8112022;

import java.util.Scanner;

public class eje2 {
    public static void main(String[] args) {
        //String para declarar la variable de nombre (es una cadena de caracteres)
        String nombre="";
        //declarar constante
        final String SALUDO="Guten Morgen";
        //varaiable que aspire
        Scanner sc =new Scanner(System.in);
        //preguntamos al usuario
        System.out.println("Introduzca un nombre");
        //aspiramos lo que introduce en el tecaldo
        nombre= sc.next();
        //para separar con comillas
        System.out.println(SALUDO+" "+nombre);
    }
}
