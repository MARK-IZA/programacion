package Sesion9112022;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        //array bidimensional primera forma (2x2)

        int [] [] matriz = new int[2][2];
        matriz[0][0]=6;
        matriz[0][1]=8;
        matriz[1][0]=1;
        matriz[1][1]=5;



        //segunda forma
        int [][] matriz_2 = {{1,2},{3,4}};



        //tercera forma
        Scanner sc = new Scanner(System.in);
        int[][] matriz_3 = new int[2][2];
        for (int i=0;i<matriz_3.length;i++){
            System.out.print("\n");
            for (int j=0;j<matriz_3.length;j++){
                System.out.println("Introduce un numero");
                matriz_3[i][j] = sc.nextInt();

            }
        }

        //imprmir los arrays
        for (int i=0;i<matriz.length;i++){
            System.out.print("\n");
            //para que se muestren en pantalla ordenados
            //System.out.println("");

            for (int j=0;j<matriz.length;j++){

            System.out.println(matriz[i][j]);

                }

        }




    }
}
