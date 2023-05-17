package main.java.org.example.chapter4;

/*Top: Find the largest number among 10 integers entered by user
FirstRefinement:Initialize variables
Input integers, count if they are up to 10, Determine the largest so far
Print Largest number;

Second Refinement:
Initialize counter = 1;
initialize largest = 0

While Counter is less than or equal to 10
    Prompt user to input number
    input integer to number
    find largest entered so far and print the largest number so far
    Counter++;

    prints the largest number is:
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int counter = 1, number, largest =0;

        Scanner input = new Scanner(System.in);
        while ( counter <= 10 )
        {
            System.out.print( "Enter a number: " );
            number = input.nextInt();
                if ( number >= largest )
                {
                    largest = number;
                }
                counter++;
            }

        System.out.printf("The largest number of all 10 entries is: %d\n",largest );

        }
    }
