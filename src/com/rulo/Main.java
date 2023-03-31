package com.rulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tutorial();
        test();
    }

    private static void test() {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        for (int row=1;row<=n;row++){
            //System.out.println(row);
            System.out.printf("%n%d%n", row);
            for (int col=row;col<2*n;col++){
                System.out.printf("%d",col);
            }
        }
        System.out.println("\n\n\n\n\n");

        for (int row=1;row<=n;row++){
            //System.out.println(row);
            System.out.printf("%d", row);
            for (int col=row;col<2*n;col++){
                System.out.printf("%d",col);
            }
        }
    }

    public static void tutorial(){
        System.out.printf("----------%n");
        System.out.println("Hello world!!\n"+"Hola Mundo!!");
        System.out.println("Adios mundo");
        System.out.println("Commit para la rama dev :v");
        System.out.printf("Vamos a leer un nombre e mandar un mensaje");

        Mensaje msg = new Mensaje();
        String datos = msg.obtenerDatos("Hola, dime tu nombre: ");
        msg.saludar(datos);
    }
}