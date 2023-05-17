package main.java.org.example.chapter4;
/*Top: Find two largest value of a series of integers
First Refinement: Initialize variables
Input numbers, inspect for the largest second largest
Print the two largest

Second Refinement:
Initialize largest, largest2;
Initialize Counter =1
largest =0 largest2 =0

while number counter is less than or equal to 10
    Prompt user to input integer
    Input number = integer

    if number >= largest
    largest = number
    if  number < largest && number >= largest2
    largest2 = number
    Counter++

Print the two largest number are largest and largest2
 */

import java.util.Scanner;

public class TwoLargestValue {
    public static void main(String[] args) {

        int counter = 1, largest =0, largest2=0, largest_old;

        Scanner input = new Scanner(System.in);
        while ( counter <= 10 )
        {
            System.out.print( "Enter a number: " );
            int number = input.nextInt();

            if ( number >= largest)
            {
                largest_old = largest;
                largest = number;
                largest2 = largest_old;
            }

            counter++;
        }

        System.out.printf("The two largest numbers of the 10 entries are: %d and %d\n",largest, largest2);

    }
}