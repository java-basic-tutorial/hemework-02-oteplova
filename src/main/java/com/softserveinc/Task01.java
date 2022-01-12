package com.softserveinc;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
        //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = {-1.7, -1.0, 2.6, 9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9, 1.4};
        // TODO: Write your code here
        double arrSum = 0;
        double minTemp = 0;
        double maxTemp = 0;
        int monthNumberLowTemp = 0;
        int monthNumberHighTemp = 0;

        for (double temp : temperature) {
            arrSum += temp;
        }

        for (int i=0;i<temperature.length;i++){
            if (temperature[i] < minTemp){
                minTemp = temperature[i];
                monthNumberLowTemp = i;
            }
            if (temperature[i] > maxTemp){
                maxTemp = temperature[i];
                monthNumberHighTemp = i;
            }
        }
        System.out.printf("Average annual temperature: %.3f\n", arrSum / temperature.length);

        switch (monthNumberLowTemp) {
            case 0: System.out.println("Month with the lowest temperature in a year: I");
                break;
            case 1:  System.out.println("Month with the lowest temperature in a year: II");
                break;
            case 2:  System.out.println("Month with the lowest temperature in a year: III");
                break;
            case 3:  System.out.println("Month with the lowest temperature in a year: IV");
                break;
            case 4:  System.out.println("Month with the lowest temperature in a year: V");
                break;
            case 5:  System.out.println("Month with the lowest temperature in a year: VI");
                break;
            case 6:  System.out.println("Month with the lowest temperature in a year: VII");
                break;
            case 7:  System.out.println("Month with the lowest temperature in a year: VIII");
                break;
            case 8:  System.out.println("Month with the lowest temperature in a year: IX");
                break;
            case 9: System.out.println("Month with the lowest temperature in a year: X");
                break;
            case 10: System.out.println("Month with the lowest temperature in a year: XI");
                break;
            case 11: System.out.println("Month with the lowest temperature in a year: XII");
                break;
        }

        switch (monthNumberHighTemp) {
            case 0: System.out.println("The month with the highest temperatures in a year: I");
                break;
            case 1:  System.out.println("The month with the highest temperatures in a year: II");
                break;
            case 2:  System.out.println("The month with the highest temperatures in a year: III");
                break;
            case 3:  System.out.println("The month with the highest temperatures in a year: IV");
                break;
            case 4:  System.out.println("The month with the highest temperatures in a year: V");
                break;
            case 5:  System.out.println("The month with the highest temperatures in a year: VI");
                break;
            case 6:  System.out.println("The month with the highest temperatures in a year: VII");
                break;
            case 7:  System.out.println("The month with the highest temperatures in a year: VIII");
                break;
            case 8:  System.out.println("The month with the highest temperatures in a year: IX");
                break;
            case 9: System.out.println("The month with the highest temperatures in a year: X");
                break;
            case 10: System.out.println("The month with the highest temperatures in a year: XI");
                break;
            case 11: System.out.println("The month with the highest temperatures in a year: XII");
                break;
        }



    }
}