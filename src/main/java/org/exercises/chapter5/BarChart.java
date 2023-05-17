package main.java.org.example.chapter5;

import java.util.Scanner;

/*
Initialize variables count =1
for count less than or equal to 5
Prompt user for input
if count == 1
Input use response
while user response is not bewteen 1 and 30
    Print error
    Input user response
if count == 2
Input use response
while user response is not bewteen 1 and 30
    Print error
    Input user response
if count == 3
Input use response
while user response is not bewteen 1 and 30
    Print error
    Input user response
if count == 4
Input use response
while user response is not bewteen 1 and 30
    Print error
    Input user response
if count == 5
Input use response
while user response is not bewteen 1 and 30
    Print error
    Input user response

for each input
for row less than or equal to user input
i = 1
Print integer (number of asterisks)  entered by user
 */
public class BarChart {
    public static void main(String[] args) {
        int count, a=1, b = 1, c = 1, d = 1, e = 1, i;

        Scanner input = new Scanner(System.in);

        for (count = 1; count <= 5; count++)
        {
            System.out.print("Enter an integer between 1 and 30: ");
            switch (count)
            {
                    case 1:
                        a = input.nextInt();
                        while (a <1 | a >30)
                        {
                            System.out.print("Incorrect integer. Enter an integer between 1 and 30: ");
                        a = input.nextInt();
                        }
                        break;
                    case 2:
                        b = input.nextInt();
                        while (b <1 | b >30)
                        {
                            System.out.print("Incorrect integer. Enter an integer between 1 and 30: ");
                            b = input.nextInt();
                        }
                        break;
                    case 3:
                        c = input.nextInt();
                        while (c <1 | c >30)
                        {
                            System.out.print("Incorrect integer. Enter an integer between 1 and 30: ");
                        c = input.nextInt();
                        }
                        break;
                    case 4:
                        d = input.nextInt();
                        while (d <1 | d >30)
                        {
                            System.out.print("Incorrect integer. Enter an integer between 1 and 30: ");
                        d = input.nextInt();
                        }
                        break;
                    case 5:
                        e = input.nextInt();
                        while (e <1 | e >30)
                        {
                            System.out.print("Incorrect integer. Enter an integer between 1 and 30: ");
                            e = input.nextInt();
                        }
                }

        }

        for (i = 1; i <= a; i++) {
            System.out.print('*');
        }
        System.out.println();
        for (i = 1; i <= b; i++) {
            System.out.print('*');
        }
        System.out.println();
        for (i = 1; i <= c; i++) {
            System.out.print('*');
        }
        System.out.println();
        for (i = 1; i <= d; i++) {
            System.out.print('*');
        }
        System.out.println();
        for (i = 1; i <= e; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}