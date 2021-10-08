package com.company;

import java.net.SocketOption;

public class Main {
    static String name = "Ravindu";
    public static final int serialNum = 10;
    boolean IsActive = false;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Name:" + name);

        //Example: Variable Casting
    int valueA = 20, valueB = 20, valueC = 40;
    int sumInt = valueA + valueB + valueC;
    double sumDouble = (double) valueA + (double) valueB + (double) valueC;

    System.out.println("Sum Int = "+ sumInt);
    System.out.println("Sum Double ="+ sumDouble);

    double div =3.5;
    int avgInt = sumInt / (int) div;
    double avgIntDouble = sumInt / div;
    double avgDouble = sumInt / div;
    float a= (float)2.5;

    System.out.println("avgInt ="+ avgInt);
    System.out.println("avgIntDouble =" + avgIntDouble);
    System.out.println("avgDouble ="+ avgDouble);



    }
}
