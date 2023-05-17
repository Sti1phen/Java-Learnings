package main.java.org.example.chapter4;

import java.util.Scanner;

/*
Read n factorial and calculate its value
Initialize variable factorial = 0

Prompt user to enter a non negative integer
input user response

    While user response is less than or equal to zero
        Prompt user to enter a non negative integer
        input user response
Calculate factorial of user input
    if n == 0,
    factorial equal 1
    else
    while n>1
    int n = m
    m = m * (n-1))
    --n;
    factorial = m;
    Print m
 */
public class Factorial {
    public static void main(String[] args) {
        int factorial;
        int m, y;
        Scanner input = new Scanner(System.in);

        System.out.print("Finding Factorial\nEnter a number you wish to find its factorial: ");
        int n = input.nextInt();

        while (n < 0) {
            System.out.print("Enter a non zero integer: ");
            n = input.nextInt();
        }
        y = n;
        m = n;
        if (n == 0||n==1)
        {
            m =1;
        }


        while (n > 1)
        {
            m *= (n - 1);
            --n;
        }
            factorial = m;
                System.out.printf("%d factorial is %d\n", y, factorial);


            }
        }
