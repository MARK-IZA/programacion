package Sesion24112022;

import java.util.Scanner;

public class NotasDam {
    public static void main(String[] args) {
        float[][] notas = new float[2][3];
        int i;
        Scanner sc = new Scanner(System.in);
        for ( i=0;i<notas.length;i++){
             for (int j=0;j<notas[i].length){
                   System.out.println("intodfjkdsjf");
                   notas[i][j]=sc.nextFloat();

             }
        }

        float media_programacion = (notas[0][0]+notas[0][1]+notas[0][2])/3;



    }
}
