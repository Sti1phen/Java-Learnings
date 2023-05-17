package main.java.org.example.chapter5;

import java.util.Scanner;

/*
Print the Smallest Number of Several Integers
Initialize variables
number
smallest
count =1

Prompt user for integer input:
Input user response
first value

for count <= user response
    Prompt user for integer input
    Input user response
    Number

    if number <=smallest       = number

Print smallest
 */
public class SmallestNumber {
    public static void main(String[] args) {
int number, count, smallest = 0;
        Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int first_value = input.nextInt();
while (first_value < 0)
{
    System.out.print("Enter a positive integer: ");
    first_value = input.nextInt();
}

for (count =1; count <= first_value; ++count)
{
    System.out.print("Enter an integer: ");
    number = input.nextInt();
    if (number <=smallest)
        smallest = number;
}

        System.out.printf("Smallest number entered is %d\n", smallest);


    }
}