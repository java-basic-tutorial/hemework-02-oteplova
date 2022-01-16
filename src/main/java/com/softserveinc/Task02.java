package com.softserveinc;

import java.util.Locale;
import java.util.Scanner;

/*
    Write a program that displays a table of temperature correspondence in degrees Celsius and Fahrenheit (F°=9/5·C° + 32).
    The user should input the temperature range in degrees Celsius and the step.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    t1 >>> 0
    t2 >>> 10
    dt >>> 1
    -----------------
    C       F
    -----------------
    0.00    32.00
    1.00    33.80
    2.00    35.60
    3.00    37.40
    4.00    39.20
    5.00    41.00
    6.00    42.80
    7.00    44.60
    8.00    46.40
    9.00    48.20
    10.00    50.00
    -----------------
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        double t1;
        double t2;
        double dt;
        double i;
        double tempF;
        System.out.print("t1 >>> ");
        t1 = scanner.nextDouble();
        System.out.print("t2 >>> ");
        t2 = scanner.nextDouble();
        System.out.print("dt >>> ");
        dt = scanner.nextDouble();
        System.out.println("-----------------");
        System.out.println("C       F ");
        System.out.println("-----------------");
        i = t1;
        while (i >= t1 && i <= t2) {
            tempF = 9.00 / 5.00 * i + 32;
            System.out.format("%.2f    %.2f\n", i, tempF);
            i += dt;
        }
        System.out.println("-----------------");
    }
}
