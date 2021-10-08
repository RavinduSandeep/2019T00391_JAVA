package com.company;

import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;

public class Main {

    public static void main(String[] args) {

        //  Control Structures: Decision
       //IF

        int age = 8;

        if (age < 18 ){
            System.out.println("Not eligible for driving license");
        }
        else if (age > 80){
            System.out.println("Too old to drive. Please submit the Medical Report");
        }
        else {
            System.out.println("Allowed to apply");
        }


        //Example IF

        double apiVersion =1;
        //Double.parseDouble(args[1]);___(not worked_Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException;
        final double DEPRECATED_VERSION = 3.11;
        final double LATEST_VERSION = 7.6;

        if (apiVersion <= DEPRECATED_VERSION){
            System.out.println("Deprecated API version : " + apiVersion);
        }
        else if (apiVersion == LATEST_VERSION){
            System.out.println("Latest Version : " + apiVersion);
        }
        else {
            System.out.println("Accepted API Version : " + apiVersion);
        }

        // SWITCH

        switch("Android"){
            case "iOS":
                System.out.println("Vendor(s) :");
                System.out.println("Apple");
                break;
            case "Android":
                System.out.println("Vendor(s) :");
                System.out.println("Google");
                System.out.println("Samsung");
                System.out.println("Huawei");
                System.out.println("Oneplus");
                System.out.println("Nokia");
                break;
            case "WindowsPhone":
                System.out.println("Vendor(s) :");
                System.out.println("Nokia");
                break;
            default:
                System.out.println("Unknown OS");
        }


        }
    }

