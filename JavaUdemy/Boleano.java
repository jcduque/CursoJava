package JavaUdemy;

public class Boleano {
    public static void main(String[] args) {
        boolean bandera = false;
        if(bandera){
            System.out.println("La bandera es True");
        }
        else {
            System.out.println("La bandera es False");
        }
        var edad = 10;
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
        //otra forma de hacerlo
        var esAdulto = edad >= 18;
        System.out.println("esAdulto = " + esAdulto);
        if(esAdulto) {
            System.out.println("Es mayor de edad ");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
