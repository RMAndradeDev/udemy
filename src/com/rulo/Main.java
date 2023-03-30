package com.rulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!\n"+"Hola Mundo!!");
        System.out.println("Adios mundo");
        System.out.println("Commit para la rama dev :v");
        System.out.printf("Vamos a leer un nombre e mandar un mensaje");

        Mensaje msg = new Mensaje();
        String datos = msg.obtenerDatos("Hola, dime tu nombre: ");
        msg.saludar(datos);
    }
}