package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      // Common Operators in Java
        int x = 0;
        int y = 0;

        System.out.println("X = "+ x++);
        System.out.println("Y = " + ++y);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input nummber : " );
        int xx = scanner.nextInt(); // Read integer value
        //String ss = scanner.next();

        scanner.close();

        System.out.println("My int is : " + xx);

        if (xx % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");


        // Iteration - While  and Do-while

        ArrayList<String> names = new ArrayList<String>();
        names.add("Ravindu");
        names.add("Sandeep");
        names.add("Nimal");
        names.add("Kamal");

        int c = 0;

        while (c < names.size()){
            System.out.println(names.get(c));

            System.out.println("c = " + c);
            if ( c == 1)
                break;

            c++;
        }
    }
}
