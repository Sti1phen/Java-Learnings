package main.java.org.example.chapter6;

import java.util.Scanner;

/*

 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        System.out.print("\nRounding Numbers\nEnter a decimal value to be rounded to the nearest integer: ");
        x = input.nextDouble();
         int y = (int) Math.floor(x +0.5);

        System.out.printf("%.2f was rounded to %d\n", x, y);

    }
}