/*
 * Diseñe un algoritmo de tal manera que le permita almacenar una Coleccion de
elementos a utilizar en el circuito del proyecto limpiaparabrisa,
ademas, cree un objeto Array en el cual debera insertar objetos de la clase String.
Luego elimine dos elementos y finalmente invoque al metodo size para que
le permita devolver el tamaño de la coleccion de elementos de la clase String.
 */
package coleccionlimpiaparabrisatarea1;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionLimpiaparabrisaTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Caratula
        System.out.println("          UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n");
        System.out.println("                Ingenieria  Automotriz ");
        System.out.println("                 Jessica Maribel Vega ");
        System.out.println("           Programacion Orientada  a objetos ");
        System.out.println("               Ing. Luis Alberto Guerra ");
        System.out.println("                        7450 \n");
        System.out.println("Coleccion de elementos a utilizar en el circuito del proyecto limpiaparabrisa");

        Collection listaElementos=new ArrayList<String>(); //El tipo de listaElementos es Collection//

        listaElementos.add("Multimetro");
        listaElementos.add("Protoboard");
        listaElementos.add("Cable");
        listaElementos.add("Fuente de 12V");
        listaElementos.add("Diodo D1 1N4004");
        listaElementos.add("Condensador C1 de 47 nF");
        listaElementos.add("Resistencia R1 de 560 Ω");
        listaElementos.add("Condensador Electrolitico de 470uF/25V");
        listaElementos.add("Transistor Q1 2N1711");
        listaElementos.add("Diodo zener de 10V");
        listaElementos.add("Condensador Electrolitico de 100uF/25V");
        listaElementos.add("Resistencia R2 de 15 kΩ");
        listaElementos.add("Potenciometro de 470 Ω");
        listaElementos.add("Resistencia R3 de 470 Ω");
        listaElementos.add("Resistencia Variable de 4,7 kΩ");
        listaElementos.add("Condensador Electrolitico C4 de 100uF/25V");
        listaElementos.add("Temporizador 555");
        listaElementos.add("Condensador C5 de 10 nF");
        listaElementos.add("Resistencia R4 de 10 kΩ");
        listaElementos.add("Transistor Q2 2N2222");
        listaElementos.add("Resistencia R5 de 1 kΩ");
        listaElementos.add("Transistor Q3 2N1711");
        listaElementos.add("Trsnsistor BJT");
        listaElementos.add("Conmutador");

        System.out.println("\n Numero de elementos a utilizar en el circuito "
                + "antes de ser eliminados: "+listaElementos.size());
        System.out.println("\n Los elementos a usar son: ");
        System.out.println(listaElementos.toString());

        listaElementos.remove("Multimetro");
        listaElementos.remove("Trsnsistor BJT");
        listaElementos.remove("Conmutador");

        System.out.println("\n Numero de elementos después de ser eliminados: "
                + "el multimetro, transistor BJT y el conmutador:" +listaElementos.size());
        System.out.println("\n Los elementos que quedan para el circuito son: ");
        System.out.println(listaElementos.toString());
    }
}
