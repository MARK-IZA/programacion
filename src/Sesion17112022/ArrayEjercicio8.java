package Sesion17112022;

public class ArrayEjercicio8 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        System.out.println("Array numeros "+java.util.Arrays.toString(numeros));
        int[] listanumeros2 = java.util.Arrays.copyOf(numeros,numeros.length);
        System.out.println("Array listanumeros2 "+java.util.Arrays.toString(listanumeros2));
        int[] listanumeros3 = java.util.Arrays.copyOf(numeros, 3);
        System.out.println("Array listanumeros3 "+java.util.Arrays.toString(listanumeros3));
        int[] listanumeros4 = java.util.Arrays.copyOfRange(numeros,0,numeros.length-1);
        System.out.println("Array listanumeros4 "+java.util.Arrays.toString(listanumeros4));

    }
}
