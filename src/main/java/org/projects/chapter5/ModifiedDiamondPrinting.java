package main.java.org.projects.chapter5;

import java.util.Scanner;

/*
Display Diamond according to the odd number input from user
Initialize row =1
Prompt user to input value
Input response from user
While value is not odd
Print error to user
if user input is odd
    Print Diamond Shape
    Divide user input by 2 plus 1 = middle
for row1 to middle
    Print space equals middle minus row
    Print star equals number of row
    Print star equals row -1 (in addition on a row)
    Print next line
for row (middle -1) to 1
    Print space equals middle minus row
    Print star equals number of row
    Print star equals row -1 (in addition on a row)
    Print next line
 */
public class ModifiedDiamondPrinting {
    public static void main(String[] args) {
        int row, column;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an odd integer from 1 to 19: ");
        int userResponse = input.nextInt();
        while (userResponse % 2 == 0 || userResponse > 19 || userResponse < 1) {
            System.out.print("Incorrect integer! Enter an odd integer from 1 to 19: ");
            userResponse = input.nextInt();
        }
        int middle = (userResponse / 2 + 1);

        for (row = 1; row <= middle; row++) {
            for (column = 1; column <= (middle - row); column++)
                System.out.print(' ');
            for (column = 1; column <= row; column++)
                System.out.print('*');
            for (column = 1; column <= (row - 1); column++)
                System.out.print('*');
            System.out.println();
        }
        for (row = (middle - 1); row >= 1; row--) {
            for (column = 1; column <= middle - row; column++)
                System.out.print(' ');
            for (column = 1; column <= row; column++)
                System.out.print('*');
            for (column = 1; column <= (row - 1); column++)
                System.out.print('*');
            System.out.println();

        }
    }
}