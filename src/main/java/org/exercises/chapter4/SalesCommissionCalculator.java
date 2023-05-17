package main.java.org.example.chapter4;
/*Top - Calculate the items sold by a sales person and determine their earnings
First Refinement
Initialize variables
Input the number of each item sold, calculate the totalSales and earnings
Display earnings
Second Refinement
Initialize item1 to 239.99
Initialize item2 to 129.75
initialize item3 to 99.95
initialize item4 to 350.89
initialize totalSales = 0;
initialize itemCounter = 0

Prompt user to enter number of item 1 sold:
Input item1 sold or 0 if no item was sold
while itemCounter != 0
    Prompt user to enter number of item 2 sold
    input item2 sold or 0 if no item was sold
    prompt user to enter number of item 3 sold
    input item3 or 0 if no item was sold
    prompt user to enter number of item 4 sold
    input item4 or 0 if no item was sold


if itemCounter !=0
    Calculate totalSales
    Calculate earnings
    Print earnings
Else
    Print "Nothing was sold by te Sales Personnel"
 */

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        double earnings = 200;
        int itemCounter =0;
        int x, y = 0, z =0, q =0;


        Scanner input = new Scanner(System.in);
       System.out.print("Enter number of item1 sold or 0 if no item was sold: ");
       x = input.nextInt();
       itemCounter +=x;

       if ( x !=0)
       {
           System.out.print("Enter number of item2 sold or 0 if no item2 was sold: ");
            y = input.nextInt();
           itemCounter +=y;
           System.out.print("Enter number of item3 sold or 0 if no item3 was sold: ");
           z = input.nextInt();
           itemCounter +=z;
           System.out.print("Enter number of item4 sold or 0 if no item4 was sold: ");
           q = input.nextInt();
           itemCounter +=q;
       }

       if (itemCounter == 0)
           System.out.printf("\nSales Person made no sale this month.\nTotal Sales Person earning for the month: $%.2f\n\n", earnings);

       else
            {
                double totalSales = ((x * item1) + (y * item2) + (z * item3) + (q *item4));
                earnings += (0.09 * totalSales);
                System.out.printf("\nTotal Sales Person earning for the month: $%.2f\n\n", earnings);
            }


       }

    }
