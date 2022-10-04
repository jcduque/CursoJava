package JavaUdemy;

import java.util.Scanner;

public class ConversionPrimitivos {
    public static void main(String[] args) {
        //Convertir un tipo string a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 3));
        //Convertir string a Double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        //pedir un valor y convertirlo
        /*var consola = new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);*/
    }
}
