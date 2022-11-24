package Sesion16112022;


//Ejercicio para simular el Array númerico (Binarysearch) y que lea el String
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class SimulacionArrayString {
    public static void main(String[] args) {
        //esto es lo primero declarar el array
        String[] lista = {"Sofia", "Mark", "Kevin", "William"};
        //si inicializamos el 0 el array es un indice entonces necesitamos un valor negativo
        int posicion = -1;
        //la variable donde el usuario va poner lo que quiere
        String busca;
        //Para preguntarle que es lo que quiere buscar
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que nombre quieres buscar?");
        busca = sc.next();
        //asgina posicion con la lista y busca
        posicion = busca(lista, busca);
        //llamar al metodo imprimir
        imprimir(posicion, busca, lista);
        lista2 =lista.clone();
        System.out.println(Arrays.toString(lista2));
    }

    //para devolver el valor (te crea una funcion y te asigna la variable para que lo devuelvas)
    private static void imprimir(int posicion, String nombre, String[] lista) {
        System.out.println("el array introducido es" + Arrays.toString(lista));
        if (posicion == -1) {
            System.out.println("elemento que buscabas" + nombre + "no se encuentra");
        } else {
            System.out.println(posicion);
        }
    }

    //PARA devolver un valor (te cerea una funcion)
    private static int busca(String[] lista, String busca) {
        int posicion = -1;
        //recorrer el array (Busca en la posicion 0 hasta que recorras toda la lista) (i++ es para que pase si quiere buscar el 2 y y no el 1)
        for (int i = 0; i < lista.length; i++) {
            if (busca.equals(lista[i])) ;
            {
                //si entra en el bucle le saca la posición
                posicion = i;
            }
            //en caso de que no entre en el if
            return posicion;
        }
    }
