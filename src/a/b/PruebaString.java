package a.b;

public class PruebaString {

    public static void main(String[] ags) {
        String nombre = "Mark";
        String apellido = "IZA";

        System.out.println("voy a pasar a mayuscula el nombre" + nombre);
        System.out.println("voy a pasar a minusculas el apellido" + apellido);
        System.out.println("concatenar caracteres" + nombre.concat( ""+apellido));
        String napa = apellido.charAt(0)+"";
        System.out.println("mostrar la inicial de mi apellido" +napa.toLowerCase());
        System.out.println("el numero de caracteres de" + nombre + "es " + nombre.length());

    }


}