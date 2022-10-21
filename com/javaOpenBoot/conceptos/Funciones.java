package com.javaOpenBoot.conceptos;

public class Funciones {
    public static void main(String[] args) {
//        System.out.println("Esto es una prueba");
//        System.out.println("Esto es una prueba");
//        String saludar = pruebaHola("Maria");
//        System.out.println(saludar);
//        holaMundo();
//        bienvenida("Luis");
        System.out.println(saludoAdicional());
        System.out.println(sum(5,7));
    }

    private static String saludoAdicional() {
        String saludo = "Buenas tardes";
        return saludo;
    }

    private static void bienvenida(String nombre) {
        System.out.println("Bienvenid@ " + nombre);
    }

    private static void holaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    private static String pruebaHola(String name) {
        String saludo = "hola ";
        return saludo + name;
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}
