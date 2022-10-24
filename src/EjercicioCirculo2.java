import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class EjercicioCirculo2 {
    public static void main(String[] args) throws IOException {
        int numero = 0;
        final double PI = 3.146;
        double area;
        double radio;
        double perímetro = 0;
        double volumen;

        int opc;
        Scanner in = new Scanner(System.in);
        System.out.println("Selecciona la opción que quieres calcular: \n1.- Calcular el perímetro\n2.-Calcular el área\n3.- Calcular el volumen");
        opc = in.nextInt();

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        switch (opc) {
            case 1:
                System.out.print("Ingrese el radio");
                entrada = bufer.readLine();
                radio = Double.parseDouble(entrada);

                perímetro = 2*PI*radio;

                System.out.print("El perímetro del circulo es:" +perímetro );
                break ;
            case 2:
                System.out.print("Ingrese el radio");
                entrada = bufer.readLine();
                radio = Double.parseDouble(entrada);

                area = PI * radio * radio;

                System.out.print("El área del circulo es:" +area );
                break ;
            case 3:
                System.out.print("Ingrese el radio" );

                entrada = bufer.readLine();
                radio = Double.parseDouble(entrada);

                volumen = 4%3*PI*radio*radio*radio;
                System.out.println("El volumen es:" +volumen);
                break ;

            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
