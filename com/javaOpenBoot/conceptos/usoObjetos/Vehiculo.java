package com.javaOpenBoot.conceptos.usoObjetos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private String placa;

    private Integer velocidad =0;

    public Vehiculo(String marca, String modelo, String color, String placa, Integer velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.velocidad = velocidad;
    }
    public void acelerar(Integer cantidad) {
        if(cantidad >0 && cantidad <= 200) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", placa='" + placa + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
