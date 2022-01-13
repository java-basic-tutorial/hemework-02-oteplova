package com.softserveinc;

import java.lang.reflect.Array;
import java.util.*;

/*
    Write a program that determines the minimum of a sequence positive numbers (the length of the sequence is not limited).

    The user should input the numbers until enter a zero or negative number.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    Enter the number after symbol >>>. To exit enter a zero.
    >>> 12
    >>> 75
    >>> 10
    >>> 9
    >>> 23
    >>> 0
    Minimum number is 9

            for (int i = 0; i < listOfNumbers.size(); i++) {
            listOfNumbers
        }
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        List<Integer> fullListOfNumbers = new ArrayList<>();
        int enteredValue;
        int min;
        do {
            System.out.print(">>> ");
            enteredValue = scanner.nextInt();
            fullListOfNumbers.add(enteredValue);
        } while (enteredValue != 0);

        for (int i=0; i < fullListOfNumbers.size(); i++){
            if (fullListOfNumbers.get(i).equals(0)){
                fullListOfNumbers.remove(i);
            }
        }

        Collections.sort(fullListOfNumbers);
        min = fullListOfNumbers.get(0);
        System.out.println("Minimum number is " + min);
    }
}
