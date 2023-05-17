package main.java.org.example.chapter4;

import java.util.Scanner;

/*
An app that test whether 3 sides input from a user can form a right angled triangle
Initialize variable
Prompt user to input the 3 sides and determine whether they form the sides of a right angled triangle.
Print whether the sides entered form a right angle triangle

Initialize variable count, number, largest=0, sum=0;

While count <= 3
Prompt user to enter the 3 sides of a right-angled triangle
input user input
if number <= largest
    largest = number

else number *=number
sum += number;
count++;

If largest square == sum
    Print integers entered are sides of a right angle triangle
Else
    Print integers entered are not sides of a right angle triangle
 */
public class RightAngleTriangle {
    public static void main(String[] args) {
        int count =1; int number, largest =0, sum =0;

        Scanner input = new Scanner(System.in);
        while (count <=3)
        {
            System.out.print("Enter a side of the right angle triangle: ");
            number = input.nextInt();
            while (number <= 0)
            {
                System.out.print("Enter a side of the right angle triangle: ");
                number = input.nextInt();
            }
            if (number >= largest)
                largest = number;
            number *= number;
            sum += number;
            count++;
        }
            int hyp2 = largest * largest;

        if (hyp2 == (sum - hyp2))
            System.out.print("The values entered are sides of a right angle triangle\n");

        else System.out.print("The values entered are not sides of a right angle triangle\n");
    }
}