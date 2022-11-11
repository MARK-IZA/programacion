package Refuerzo8112022;

public class Equipo {
    //atributos
    //para nombres
    private String nombre_equipo;
    //double para los decimales
    private double presupuesto;
     private int trofeos_ganados;
    //metodos
    Equipo(){
        nombre_equipo="Betis ";
        presupuesto = 1.5;
        trofeos_ganados =4;

    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public int getTrofeos_ganados() {
        return trofeos_ganados;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setTrofeos_ganados(int trofeos_ganados) {
        this.trofeos_ganados = trofeos_ganados;
    }
}
