package main.java.org.projects.chapter4;
//Example 4.7
//A class that analyzes result of an exam and determine if the instructor should be paid bonus

import java.util.Scanner;

public class Analysis2 {

    public static void main(String[] args) {

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        Scanner input = new Scanner(System.in);

        while (studentCounter <= 10)
        {
            System.out.print("Enter result: ");
            int result = input.nextInt();

            if (result == 1)
                passes++;
            else
                failures++;

            studentCounter++;

        }

        System.out.printf("\nNumber of passes is: %d\n", passes);
        System.out.printf("Number of failures is: %d\n", failures);

        if (passes > 8)
            System.out.println("Bonus to Instructor");

    }
}

