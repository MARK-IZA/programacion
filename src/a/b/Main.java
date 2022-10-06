package a.b;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //declaration de una constante
        final String SALUDO="Hola, ";
        //declaración de la variable que contiene el nombre del usuario
        String nombre="Mark";
        System.out.println(SALUDO+nombre);
        char c='a';
        char caracter='b';
        int num=88;
        System.out.println(c);
        c=caracter;
        System.out.println(c);
    }
}