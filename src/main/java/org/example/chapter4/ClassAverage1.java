package org.example.chapter4;
//Implementing Sentinel-Controlled Repetition

import java.util.Scanner;

public class ClassAverage1 {

    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1)
        {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();

        }

        if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;
            System.out.printf("\nTotal of the %d grades entered is: %d", gradeCounter, total);
            System.out.printf("\nClass average is: %.2f\n", average);
        }
        else
            System.out.println("No grades were entered");

    }

}
