package com.javaOpenBoot.conceptos;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "nublado";
        switch (weather){
            case "soleado":
                System.out.println("El dia esta soleado");
                break;
            case "nublado":
                System.out.println("El dia esta nublado");
                break;
            default:
                System.out.println("No se pudo identificar el clima");
                break;
        }
    }
}
