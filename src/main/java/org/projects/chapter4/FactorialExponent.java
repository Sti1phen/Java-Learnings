package main.java.org.projects.chapter4;

import java.util.Scanner;

/*
find the value of natural exponent e. Stop at nth term input by user
Prompt user to input what term to end calculation
package org.example.chapter4;
initialize e =1;
n =m;
n=y;

Prompt user to enter a non negative integer
input user response

    While user response is less than or equal to zero
        Prompt user to enter a non negative integer
        input user response

Calculate factorial of user input

While nth term >=1

        if n == 0 or 1
            m = 1

         else {
                    int x = 2;
                    m = n;
                    while (x <= n) {
                        m *= (x - 1);
                        x++;
                    }


    e+=(1/m)
    n--;
    natural exponent = e;
    Print e
 */
public class FactorialExponent {
    public static void main(String[] args) {
        int m; double e=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Finding natural number\nEnter nth to stop calculation of natural number: ");
        int n = input.nextInt();

        while (n <0) {
            System.out.print("Enter a non zero integer: ");
            n = input.nextInt();
        }

        while (n >= 0) {
                if (n==1 ||n==0)
                    m=1;

               else {
                    int x = 2;
                    m = n;
                    while (x <= n) {
                        m *= (x - 1);
                        x++;
                    }
                }

                e+= (double) 1/m;
                n--;
            }
        System.out.printf("e value is %.3f\n", e);
        }

}