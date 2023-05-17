package main.java.org.example.chapter6;

import java.util.Scanner;

/*
Application to define four methods to round number
 */
public class RoundingNumber2 {
    static double x;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value to be rounded to the nearest integer, tenth, hundredth, and thousandth:");
       x = input.nextDouble();
       System.out.printf("%.3f rounded to integer is: %d\n    rounded to Tenths is: %.1f\n    rounded to Hundredths is: %.2f\n" +
               "    rounded to Thousandths is: %.3f\n", x, roundToInteger(x), roundToTenths(x), roundToHundredths(x), roundToThousandths(x));


    }
    public static int roundToInteger(double number){
        RoundingNumber2.x = number;
        return (int) Math.floor(x +0.5);
    }
    public static double roundToTenths(double number){
        RoundingNumber2.x = number;
        return Math.floor(x * 10 + 0.5) / 10;
    }
    public static double roundToHundredths(double number){
        RoundingNumber2.x = number;
        return Math.floor(x * 100 + 0.5) / 100;
    }
    public static double roundToThousandths(double number){
        RoundingNumber2.x = number;
        return Math.floor(x * 1000 + 0.5) / 1000;
    }
}