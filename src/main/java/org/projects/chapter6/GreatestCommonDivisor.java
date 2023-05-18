package main.java.org.example.chapter6;

import java.util.Scanner;

/*
Prompt user to input two integer
Input user response x, y
Use method gcd


Create method gcd (parameters x, y)

Use max method (x, y)
if y is max
y = y-x
else x = x -y
if x = y
    Print gcd = x
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.print("Finding Greatest Common Divisor\nEnter two integer to find their GCD (number1 number2): ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        gcd(number1, number2);

    }

    public static void gcd(int number1, int number2) {
        do {
            int max = Math.max(number1, number2);
            if (number1 == max)
                number1 -= number2;
            else number2 -= number1;
            if (number1 == number2)
                System.out.printf("Greatest Common Divisor is: %d\n", number1);
        } while (number1 != number2);
System.out.println();
    }
}