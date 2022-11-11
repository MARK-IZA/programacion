package Sesion2112022;

public class PasoValorObjetos {
    public static void main(String... hazloMejor) {
        Persona p1 = new Persona();
        p1.nombre="Sofia";
        System.out.println(p1.nombre);
        transfomarNombre(p1);
        System.out.println("después de pasarle el método transformarNombre...");
        //System.out.println("el nombre es " p1.nombre);


    }
    static void transfomarNombre (Persona p){
        p.nombre = "Mark";
    }
}
