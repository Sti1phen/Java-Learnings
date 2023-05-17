package main.java.org.example.chapter4;
//calculating the sum of the first 100 positive integers

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //Counter-Controlled Repetition
////        int sum =0;
////        int x = 1;
//
//        while (x <= 100)
//        {
//            sum += x;
//            ++x;
//        }
//
//        System.out.printf("\nThe sum of the first 100 positive integers is:%d\n\n", sum);

        //Sentinel Controlled Repetition
        int sum = 0;
        int x;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer or other integers to quit: ");
        x = input.nextInt();

        while (x > 0)
        {
            sum +=x;
            System.out.print("Enter a positive integer or other integers to quit: ");
            x = input.nextInt();

        }

        if ( sum != 0)
        {
            System.out.printf("The sum of the positive integers entered is: %d\n", sum);
        }
        else System.out.print("You did not enter a positive integer.\n");


    }
}