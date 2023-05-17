package main.java.org.example.chapter6;

import java.util.Scanner;

/*
Prompt user to enter integer
Input user response
do while user response !=0
    integer % 10
        Print answer
    integer /= 10
 */
public class ReversingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to be reversed: ");
        int number = input.nextInt();
        reverseDigits(number);
        System.out.println();
    }

    public static void reverseDigits(int number){
        while ( number !=0){
            int separateNumber = number % 10;
            System.out.printf("%d  ",separateNumber);
            number /= 10;
        }

    }
}