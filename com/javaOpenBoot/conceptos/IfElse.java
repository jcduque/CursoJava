package com.javaOpenBoot.conceptos;

public class IfElse {
    public static void main(String[] args) {
        boolean validador = 5 > 20;
        if(validador){
            System.out.println("Es verdadero");
        }else{
            System.out.println("Es falso");
        }

        Integer numero1 = 50;
        Integer numero2 = 10;
        Integer numero3 = 150;
        Integer numero4 = 20;
        if(numero1 < numero2 && numero3 < numero4){
            System.out.println("primera condicion");
        } else if (numero3 < numero4) {
            System.out.println("segunda condicion");
        }else{
            System.out.println("no se cumplio ninguna condicion");
        }
    }
}
