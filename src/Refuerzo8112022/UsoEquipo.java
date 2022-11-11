package Refuerzo8112022;

public class UsoEquipo {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo();
        //get para leer y set para ponerlo
        System.out.println(equipo1.getNombre_equipo());
        equipo1.setNombre_equipo("Barça");
        System.out.println(equipo1.getNombre_equipo());
    }
}
