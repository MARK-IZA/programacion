package Sesion14112022;
import java.util.Arrays;
public class eje1 {
    public static void main(String[] args) {
        String[] alumnos ={"Sofia", "Elena","Sara","Lamyae"};

        int posicion = java.util.Arrays.binarySearch(alumnos,"Alberto");
        if (posicion<0) {
            System.out.println("Ese nombre no se encuentra en la lista");

        }
        else {
            System.out.println("El alumno"+alumnos[posicion]+"esta en la posición"+posicion);
        }
        //falta otro programa para conectarla

    }
}
