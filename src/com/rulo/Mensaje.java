package com.rulo;

import java.util.Scanner;

public class Mensaje {
    public String obtenerDatos(String mensaje){
        System.out.printf(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(String datos){
        System.out.printf("Hola %s, bienvenido a Java \n", datos);
    }
}
