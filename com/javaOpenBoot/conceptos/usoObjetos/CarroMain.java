package com.javaOpenBoot.conceptos.usoObjetos;

public class CarroMain {
    public static void main(String[] args) {
        Vehiculo carroObj = new Vehiculo("ferrari", "convertible", "azul", "XJT557", 100);
        carroObj.acelerar(100);
        System.out.println(carroObj);
    }
}
