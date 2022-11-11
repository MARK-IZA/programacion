package Sesion9112022;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int [] [] matriz = new int[2][3];
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[1][0]=3;
        matriz[1][1]=4;
        matriz[2][0]=5;
        matriz[2][1]=6;

        //segunda forma
        int [][] matriz_2 = {{1,2},{3,4},{5,6}};
        //tercera forma
        Scanner sc = new Scanner(System.in);
        int[][] matriz_3 = new int[2][3];
        for (int i=0;i<matriz_3.length;i++) {
            for (int j = 0; j < matriz_3[i].length; j++) {
                System.out.println("Introduce un numero");
                matriz_3[i][j] = sc.nextInt();
            }
        }
        //imprmir los arrays
        for (int i=0;i<matriz.length;i++){

            for (int j=0;j<matriz.length;j++){

                System.out.println(matriz[i][j]);
            }

        }
    }
}
