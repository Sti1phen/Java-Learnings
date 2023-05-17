package main.java.org.example.chapter7;

import java.util.Scanner;

/*
Declare array fibonacci [n]
initialize fibonacci[0] = 0,
fibonacci[1] = 1;
use for statement from index = 0 till index = fibonacci.length
fibonacci[index] = fibonacci [index -1] + fibonacci[index-2]

Print fibonacci[fibonacci.length -1]
 */
public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term of the fibonacci series you want calculated:  ");
        int nthTerm = input.nextInt();

        fibonacci(nthTerm);
    }
    public static void fibonacci(int n){

        double [] fibonacci = new double[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int index = 0; index < fibonacci.length; index++){
            if (index > 1)
                fibonacci[index] = fibonacci[index -1] + fibonacci[index-2];
        }

        System.out.printf("%dth term of fibonacci series is: %.1f\n", n, fibonacci[n -1]);
    }
}