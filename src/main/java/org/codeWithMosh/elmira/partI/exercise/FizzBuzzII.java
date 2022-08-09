package org.codeWithMosh.elmira.partI.exercise;

public class FizzBuzzII {
    public static void main(String[] arg){
       fizzBuzz(15);
    }

  // write the program outputs that outputs the string representation of numbers from 1 to n
    // i divisible by 3 & 5 --> FizzBuzz
    // i divisible by 3 --> Fizz
    // i divisible by 5 --> Buzz
    // non --> print the value of i

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++){
            if (i % 5 == 0 && i % 3 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0 )
                System.out.println("Fizz");
            else if (i % 5 == 0 )
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}

