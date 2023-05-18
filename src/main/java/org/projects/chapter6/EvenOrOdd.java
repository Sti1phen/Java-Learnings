package main.java.org.projects.chapter6;

import java.util.Scanner;

/*
Declare method as boolean with integer argument
Use remainder % to check if Multiple
Use if to output if multiple or not
 */
public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Even Or Odd Number\nEnter an integer: ");
        int even = input.nextInt();

        System.out.println(isEven(even));

    }


    public static boolean isEven(int even){
        boolean isEven;
        isEven = even % 2 == 0;
        return isEven;
    }

}

