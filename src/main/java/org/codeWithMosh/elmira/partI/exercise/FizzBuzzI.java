package org.codeWithMosh.elmira.partI.exercise;

import java.util.Scanner;

public class FizzBuzzI {
    public static void main(String[] args) {
        // divisible by 5 --> Fizz
        // divisible by 3 --> Buzz
        // divisible by 3 & 5 --> FizzBuzz
        // non --> same number print in the terminal

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
