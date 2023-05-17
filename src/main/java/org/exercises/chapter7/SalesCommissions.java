package main.java.org.example.chapter7;

import java.util.Scanner;

/*
Declare array frequency
Prompt user to provide the gross sales of an employee to be entered per time
until user input a sentinel value or end-of-file
Calculate each user gross income and populate array frequency as
++frequency[grossIncome/100]
for frequency
    Print range : frequency
 */
public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] frequency = new int[11];
        System.out.print("Enter the gross sales of salesperson or -1 to end entry: ");
        double grossSales = input.nextDouble();
        while (grossSales != -1) {
            int grossIncome = (int) ((200 + (0.09* grossSales)) / 100);
            if (grossIncome >= 10)
                grossIncome = 10;
            ++frequency[grossIncome];
            System.out.print("Enter the gross sales of salesperson or -1 to end entry: ");
            grossSales = input.nextDouble();
        }
        System.out.printf("%14s\t\tNumber of Sales Persons", "Salary Range");
        System.out.println();
        for (int range = 2; range < frequency.length; range++) {
                if (range == 10)
                    System.out.printf("%4d and over ", range * 100);
                else System.out.printf("%5d - %-5d ", range * 100, range * 100 + 99);
                System.out.printf("\t\t%10d",frequency[range]);
                System.out.println();
            }
        }
    }