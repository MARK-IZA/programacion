package Sesion23112022;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.Locale;

public class UsoMetodoString {
    public static void main(String[] args) {
        String pais="Francia";
        String pais2="Ecuadro";
        String pais3="Maruecos";
        String pais4="España";
        String pais22="ecuador";
        String pais8="";


        //char
        System.out.println("La incial de este país es"+pais.charAt(0));
        System.out.println("La letra del país"+pais.charAt(pais.length()));
        System.out.println("numero de letras"+pais.length());
        System.out.println("el país en mayusculas es"+pais.toUpperCase());
        System.out.println("el país en minusculas es"+pais.toLowerCase());
        System.out.println("es igual"+pais2+" y "+pais22+"?="+pais2.equals(pais22));
        //System.out.println("¿Es igual"+pais2+" y"+pais22+ pais2.compareTo(pais22));

        if (pais2.toLowerCase().compareTo(pais22.toLowerCase())==0){
            System.out.println("son iguales");
        }
        else{
            System.out.println("no son iguales");
        }
        System.out.println("es subcadena "+pais3.contains("rru"));
        System.out.println("es el sufijo de "+pais4.endsWith("eña"));
        System.out.println("Esta vacío el país"+pais4.isEmpty());
        System.out.println("Esta vacío el país"+pais8.isEmpty());
        System.out.println(pais4.indexOf("a"));
        System.out.println(pais4.lastIndexOf("a"));
        String animal="perro";
        System.out.println(animal.replace('0','a'));
        System.out.println(animal.substring(0,2));
        System.out.println(animal.startsWith("pa"));
        String pais20="Qatar";
        System.out.println(pais20.length());
        System.out.println(pais20.trim().length());


    }
}
