package com.javaOpenBoot.conceptos;

public class WhileLoop {
    public static void main(String[] args) {
        int count =0;
        int countB =0;
        while (count <= 10){
            System.out.println("Hola mundo " + count);
            count ++;
        }
        while (countB < 6){
            countB ++;
            if (countB == 3){
                //continue;// salta la ejecucion
                break;// termina la ejecucion
            }
            System.out.println("Hola numero " + countB);
        }
        System.out.println("fin");
    }
}
