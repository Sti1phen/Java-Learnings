package main.java.org.example.chapter4;
/*
Top: Read a five-digit integer and determine whether it's a palindrome
First Refinement: Initialize variable x, y, a, b;
Prompt user to input digits, separate digits and determine if its a palindrome
Print if palindrome or else print not palindrome or no five-digits integer
Second Refinement
Initialize variable x, y, z, a
Prompt user for a five-digit integer
Input user response , v

While v is less than or equal to 9999 or more than 99999
    Print you have not entered a five digit number,
    Please enter a five digit number

Separate user response using division and remainder
Separate first digit by dividing by 10000 and assign x
Separate second digit by dividing by 1000 and % 10 and assign y
Separate fourth digit by doing % 100 and dividing by 10 and assign z
Separate fifth digit by doing % 10 and assign a

If x == a and y == z
    Print the number is a palindrome
Else
    Print number is not a palindrome

 */

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        int x, y, z, w, v;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        v = input.nextInt();

        while (v <= 9999 || v > 99999)
        {
            System.out.print("You have entered an incorrect integer.\nPlease enter a five-digit integer: ");
            v = input.nextInt();
            v++;
        }

        x = v / 10000;
        y = ((v / 1000) % 10);
        z = ((v % 100) / 10);
        w = v % 10;

        if (x == w && y == z)
        {
            System.out.printf("Integer %d is a Palindrome\n\n",v);
        }
        else System.out.printf("Integer %d is not a Palindrome\n\n",v);
    }
}
