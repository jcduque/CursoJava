package com.javaOpenBoot.conceptos;

import static java.lang.Float.parseFloat;

public class Operadores {
    public static void main(String[] args) {
        //Operadores

        //Aritmeticos

        // + - / * %
        int numero1 = 6;
        int number2 = 3;

        int resultado1 = numero1 + number2;
        int resultado2 = numero1 - number2;
        Float resultado3 = parseFloat(String.valueOf(numero1 / number2));
        int resultado4 = numero1 * number2;

        System.out.println("resultado1 = " + resultado1);
        System.out.println("resultado2 = " + resultado2);
        System.out.println("resultado3 = " + resultado3);
        System.out.println("resultado4 = " + resultado4);

        //logicos, relacion, comparacion, booleanos

        /*
        >
        >=
        <
        <=
        ==
        !=
        && and
        || or
        !
         */

        //asignacion

        /*
        =
        +=
        -=
        *=
        /=
        %=
         */

        //incremento
        // ++

        //decremento
        // --

        //concatenacion
        // +
    }
}
