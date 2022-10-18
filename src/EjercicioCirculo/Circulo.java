package EjercicioCirculo;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int radio;
        double perimetro, area, volumen;
        double pi = 3.1416;

        System.out.println("Introduzca el radio del circulo para calcularlo");
        radio = entrada.nextInt ();

        perimetro = 2*pi*radio;
        area = pi*radio*radio;
        volumen = 4/3*pi*radio*radio*radio;

        System.out.println("El perimetro es: " + perimetro + ".");
        System.out.println("El area es: " + area + ".");
        System.out.println("El volumen es: " + volumen + ".");
    }
}
